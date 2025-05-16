package grupo5proyectofinal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conexion_BD {
    Connection cn;
    Statement sql;
    ResultSet registro;
    PreparedStatement ps;

    public void insertar_coches_bd(Coche obj_coche) {    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");
        System.out.println("Se conectó correctamente");

        String SQL = "INSERT INTO coche (marca, modelo, matricula, kilometraje, ano_fabricacion, precio, cv, color) VALUES ('"
                + obj_coche.getMarca() + "', '"
                + obj_coche.getModelo() + "', '"
                + obj_coche.getMatricula() + "', "
                + obj_coche.getKilometraje() + ", "
                + obj_coche.getAno_fabricacion() + ", "
                + obj_coche.getPrecio() + ", "
                + obj_coche.getCv() + ", '"
                + obj_coche.getColor() + "')";

        sql = cn.createStatement();
        sql.executeUpdate(SQL); 
        System.out.println("Coche añadido correctamente.");

    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        
    public ArrayList<Coche> Consultar_coches(){
        
        ArrayList<Coche> catalogo = new ArrayList<>();
                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid","root","1213");
            System.out.println("Se conecto correctamente");
            String SQL = "Select * from coche";
            sql = cn.prepareStatement(SQL);
            registro = sql.executeQuery(SQL);
            
            while(registro.next()){
                Coche obj_coche = new Coche();
                obj_coche.setMarca(registro.getString("marca"));
                obj_coche.setModelo(registro.getString("modelo"));
                obj_coche.setMatricula(registro.getString("matricula"));
                obj_coche.setKilometraje(registro.getFloat("kilometraje"));
                obj_coche.setAno_fabricacion(registro.getInt("ano_fabricacion"));
                obj_coche.setPrecio(registro.getFloat("precio"));
                obj_coche.setCv(registro.getInt("cv"));
                obj_coche.setColor(registro.getString("color"));
                
                catalogo.add(obj_coche); 
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return catalogo;
    }
    
    public boolean eliminarCoche_BD(String matricula) {
    

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");
            System.out.println("Se conectó correctamente");

            String SQL = "DELETE FROM Coche WHERE matricula = ?";
            ps = cn.prepareStatement(SQL);
            ps.setString(1, matricula);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public DefaultTableModel obtenerTodosLosCoches() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {
            "Marca", "Modelo", "Matrícula", "Kilometraje", "Año", "Precio", "CV", "Color"
        });

        try {
            String SQL = "SELECT marca, modelo, matricula, kilometraje, ano_fabricacion, precio, cv, color FROM coche";
            ps = cn.prepareStatement(SQL);
            registro = ps.executeQuery();

            while (registro.next()) {
                modelo.addRow(new Object[] {
                    registro.getString("marca"),
                    registro.getString("modelo"),
                    registro.getString("matricula"),
                    registro.getInt("kilometraje"),
                    registro.getInt("ano_fabricacion"),
                    registro.getDouble("precio"),
                    registro.getInt("cv"),
                    registro.getString("color")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener coches: " + e.getMessage());
        }

        return modelo;
    }
    
   public void guardarRecibosEnFichero() {
        ArrayList<ReciboDeCompra> listaRecibos = new ArrayList<>();
        String query = "SELECT ID_compra, ID_cliente, ID_coche FROM recibo_de_compra";

        try {
            // ESTABLECER CONEXIÓN PRIMERO
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");
            System.out.println("Se conectó correctamente para guardar recibos.");

            sql = cn.createStatement();
            registro = sql.executeQuery(query);

            while (registro.next()) {
                ReciboDeCompra recibo = new ReciboDeCompra(
                    registro.getInt("ID_compra"),
                    registro.getInt("ID_cliente"),
                    registro.getInt("ID_coche")
                );
                listaRecibos.add(recibo);
            }

            new ArchivoObject().guardarRecibos("recibos.dat", listaRecibos);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<ReciboDeCompra> obtenerRecibosOrdenados() {
        ArrayList<ReciboDeCompra> lista = new ArrayList<>();
        try {
            String SQL = "SELECT r.ID_compra, r.ID_cliente, r.ID_coche " +
                         "FROM recibo_de_compra r " +
                         "JOIN coche c ON r.ID_coche = c.ID_coche " +
                         "ORDER BY c.marca ASC";
            ps = cn.prepareStatement(SQL);
            registro = ps.executeQuery();

            while (registro.next()) {
                int idCompra = registro.getInt("ID_compra");
                int idCliente = registro.getInt("ID_cliente");
                int idCoche = registro.getInt("ID_coche");

                lista.add(new ReciboDeCompra(idCompra, idCliente, idCoche));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    public String obtenerNombreCochePorID(int idCoche) {
        String nombre = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");

            String sql = "SELECT marca, modelo FROM coche WHERE ID_coche = ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idCoche);
            registro = ps.executeQuery();

            if (registro.next()) {
                nombre = registro.getString("marca") + " " + registro.getString("modelo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nombre;
    }
    public int obtenerIDCochePorNombre(String nombreCoche) {
        int id = -1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");

            String sql = "SELECT ID_coche FROM coche WHERE CONCAT(marca, ' ', modelo) = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombreCoche);
            registro = ps.executeQuery();

            if (registro.next()) {
                id = registro.getInt("ID_coche");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return id;
    }
    
    public boolean eliminarReciboPorNombreCocheYSesion(String nombreCoche, int idCliente) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");

            // Primero obtenemos el ID del coche por su nombre (marca + modelo)
            String sqlCoche = "SELECT ID_coche FROM coche WHERE CONCAT(marca, ' ', modelo) = ?";
            ps = cn.prepareStatement(sqlCoche);
            ps.setString(1, nombreCoche);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idCoche = rs.getInt("ID_coche");

                // Ahora borramos el recibo que tenga ese idCoche y el idCliente de sesión
                String sqlDelete = "DELETE FROM recibo_de_compra WHERE ID_coche = ? AND ID_cliente = ?";
                ps = cn.prepareStatement(sqlDelete);
                ps.setInt(1, idCoche);
                ps.setInt(2, idCliente);

                int filas = ps.executeUpdate();
                return filas > 0;
            } else {
                // No se encontró el coche
                return false;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public boolean actualizarCoche_BD(Coche obj_coche) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");

            String SQL = "UPDATE coche SET marca = ?, modelo = ?, kilometraje = ?, ano_fabricacion = ?, precio = ?, cv = ?, color = ? WHERE matricula = ?";

            ps = cn.prepareStatement(SQL);
            ps.setString(1, obj_coche.getMarca());
            ps.setString(2, obj_coche.getModelo());
            ps.setFloat(3, obj_coche.getKilometraje());
            ps.setInt(4, obj_coche.getAno_fabricacion());
            ps.setFloat(5, obj_coche.getPrecio());
            ps.setInt(6, obj_coche.getCv());
            ps.setString(7, obj_coche.getColor());
            ps.setString(8, obj_coche.getMatricula());

            int filas = ps.executeUpdate();

            return filas > 0;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
