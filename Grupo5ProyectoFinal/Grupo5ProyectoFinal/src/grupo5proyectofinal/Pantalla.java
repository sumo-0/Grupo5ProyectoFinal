package grupo5proyectofinal;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pantalla extends javax.swing.JFrame {
    Connection cn;
    Statement sql;
    ResultSet registro;
    PreparedStatement ps;
    
    int coche_x = 0;
    int coche_y = 0;
    public Pantalla() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog_Inicio_Administrador = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserField_Admin = new javax.swing.JTextField();
        PassField_Admin = new javax.swing.JPasswordField();
        Btn_Admin_Iniciar_Sesion = new javax.swing.JButton();
        Dialog_Inicio_Cliente = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UserField_Client = new javax.swing.JTextField();
        PassField_Client = new javax.swing.JPasswordField();
        Btn_Client_Iniciar_Sesion = new javax.swing.JButton();
        Dialog_UI_Admin = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Field_Marca_Admin = new javax.swing.JTextField();
        Field_Modelo_Admin = new javax.swing.JTextField();
        Field_Matricula_Admin = new javax.swing.JTextField();
        Field_Kilometraje_Admin = new javax.swing.JTextField();
        Field_AnoFabricacion_Admin = new javax.swing.JTextField();
        Field_Precio_Admin = new javax.swing.JTextField();
        Field_Cv_Admin = new javax.swing.JTextField();
        Field_Color_Admin = new javax.swing.JTextField();
        btn_LogOut_Admin = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Admin = new javax.swing.JTable();
        btn_actualizar_tabla_Admin = new javax.swing.JButton();
        Btn_Añadir_Coche = new javax.swing.JButton();
        Btn_Editar_Coche = new javax.swing.JButton();
        Btn_Eliminar_Coche = new javax.swing.JButton();
        Btn_Conducir_Coche = new javax.swing.JButton();
        Dialog_UI_Client = new javax.swing.JDialog();
        btn_LogOut_Client = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Cliente = new javax.swing.JTable();
        btn_actualizar_tabla_Cliente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btn_Comprar_Coche = new javax.swing.JButton();
        btn_Garaje = new javax.swing.JButton();
        DialogGaraje = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_Garaje = new javax.swing.JTable();
        btn_devolver_coche = new javax.swing.JButton();
        btn_actualizarTablaGaraje = new javax.swing.JButton();
        btn_SalirGaraje = new javax.swing.JButton();
        DialogConducir = new javax.swing.JDialog();
        coche = new javax.swing.JLabel();
        delim4 = new javax.swing.JLabel();
        delim2 = new javax.swing.JLabel();
        delim3 = new javax.swing.JLabel();
        delim5 = new javax.swing.JLabel();
        delim1 = new javax.swing.JLabel();
        delim7 = new javax.swing.JLabel();
        delim8 = new javax.swing.JLabel();
        delim6 = new javax.swing.JLabel();
        btn_Correr = new javax.swing.JButton();
        btn_Empezar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_Inicio_Admin = new javax.swing.JButton();
        Btn_Inicio_Cliente = new javax.swing.JButton();

        Dialog_Inicio_Administrador.setMinimumSize(new java.awt.Dimension(1300, 800));
        Dialog_Inicio_Administrador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel2.setText("INICIE SESIÓN EMPLEADO");
        Dialog_Inicio_Administrador.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("USUARIO:");
        Dialog_Inicio_Administrador.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("CONTRASEÑA:");
        Dialog_Inicio_Administrador.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        UserField_Admin.setColumns(18);
        UserField_Admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Dialog_Inicio_Administrador.getContentPane().add(UserField_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        PassField_Admin.setColumns(18);
        PassField_Admin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Dialog_Inicio_Administrador.getContentPane().add(PassField_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        Btn_Admin_Iniciar_Sesion.setText("INICIAR SESION");
        Btn_Admin_Iniciar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Admin_Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Admin_Iniciar_SesionActionPerformed(evt);
            }
        });
        Dialog_Inicio_Administrador.getContentPane().add(Btn_Admin_Iniciar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        Dialog_Inicio_Cliente.setMinimumSize(new java.awt.Dimension(1300, 800));
        Dialog_Inicio_Cliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel5.setText("INICIE SESIÓN CLIENTE");
        Dialog_Inicio_Cliente.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("USUARIO:");
        Dialog_Inicio_Cliente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");
        Dialog_Inicio_Cliente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        UserField_Client.setColumns(18);
        UserField_Client.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Dialog_Inicio_Cliente.getContentPane().add(UserField_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        PassField_Client.setColumns(18);
        PassField_Client.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Dialog_Inicio_Cliente.getContentPane().add(PassField_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        Btn_Client_Iniciar_Sesion.setText("INICIAR SESION");
        Btn_Client_Iniciar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Client_Iniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Client_Iniciar_SesionActionPerformed(evt);
            }
        });
        Dialog_Inicio_Cliente.getContentPane().add(Btn_Client_Iniciar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        Dialog_UI_Admin.setMinimumSize(new java.awt.Dimension(1300, 800));
        Dialog_UI_Admin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Marca:");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Modelo:");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Matricula:");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Kilometraje:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Año de Fabricación:");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Precio:");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Cv:");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Color:");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dialog_UI_Admin.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, -1, -1));

        Field_Marca_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Marca_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Field_Modelo_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Modelo_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        Field_Matricula_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Matricula_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        Field_Kilometraje_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Kilometraje_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        Field_AnoFabricacion_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_AnoFabricacion_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        Field_Precio_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Precio_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        Field_Cv_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Cv_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        Field_Color_Admin.setColumns(15);
        Dialog_UI_Admin.getContentPane().add(Field_Color_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, -1, -1));

        btn_LogOut_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo5proyectofinal/Cerrar_Sesion_Foto.png"))); // NOI18N
        btn_LogOut_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_LogOut_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOut_AdminActionPerformed(evt);
            }
        });
        Dialog_UI_Admin.getContentPane().add(btn_LogOut_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Snap ITC", 3, 56)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 204, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("GESTOR DE CONCESIONARIO");
        Dialog_UI_Admin.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 1090, 130));

        Tabla_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Matricula", "Kilometraje", "Año de Fabricación", "Precio", "Cv", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_Admin.getTableHeader().setReorderingAllowed(false);
        Tabla_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_AdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Admin);

        Dialog_UI_Admin.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 1060, 440));

        btn_actualizar_tabla_Admin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_actualizar_tabla_Admin.setText("ACTUALIZAR TABLA");
        btn_actualizar_tabla_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar_tabla_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_tabla_AdminActionPerformed(evt);
            }
        });
        Dialog_UI_Admin.getContentPane().add(btn_actualizar_tabla_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 660, -1, -1));

        Btn_Añadir_Coche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_Añadir_Coche.setText("AÑADIR COCHE");
        Btn_Añadir_Coche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Añadir_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Añadir_CocheActionPerformed(evt);
            }
        });
        Dialog_UI_Admin.getContentPane().add(Btn_Añadir_Coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, -1, -1));

        Btn_Editar_Coche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_Editar_Coche.setText("EDITAR COCHE");
        Btn_Editar_Coche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Editar_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Editar_CocheActionPerformed(evt);
            }
        });
        Dialog_UI_Admin.getContentPane().add(Btn_Editar_Coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, -1));

        Btn_Eliminar_Coche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_Eliminar_Coche.setText("ELIMINAR COCHE");
        Btn_Eliminar_Coche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Eliminar_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Eliminar_CocheActionPerformed(evt);
            }
        });
        Dialog_UI_Admin.getContentPane().add(Btn_Eliminar_Coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, -1, -1));

        Btn_Conducir_Coche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn_Conducir_Coche.setText("CONDUCIR COCHE");
        Btn_Conducir_Coche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Conducir_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Conducir_CocheActionPerformed(evt);
            }
        });
        Dialog_UI_Admin.getContentPane().add(Btn_Conducir_Coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 710, -1, -1));

        Dialog_UI_Client.setMinimumSize(new java.awt.Dimension(1300, 800));
        Dialog_UI_Client.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_LogOut_Client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo5proyectofinal/Cerrar_Sesion_Foto.png"))); // NOI18N
        btn_LogOut_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_LogOut_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOut_ClientActionPerformed(evt);
            }
        });
        Dialog_UI_Client.getContentPane().add(btn_LogOut_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        Tabla_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Matricula", "Kilometraje", "Año de Fabricación", "Precio", "Cv", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_Cliente.getTableHeader().setReorderingAllowed(false);
        Tabla_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_Cliente);

        Dialog_UI_Client.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 1060, 440));

        btn_actualizar_tabla_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_actualizar_tabla_Cliente.setText("ACTUALIZAR TABLA");
        btn_actualizar_tabla_Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar_tabla_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_tabla_ClienteActionPerformed(evt);
            }
        });
        Dialog_UI_Client.getContentPane().add(btn_actualizar_tabla_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 660, -1, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Snap ITC", 3, 56)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 204, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CONCESIONARIO GRUPO 5");
        Dialog_UI_Client.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 1090, 130));

        btn_Comprar_Coche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Comprar_Coche.setText("COMPRAR COCHE");
        btn_Comprar_Coche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Comprar_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Comprar_CocheActionPerformed(evt);
            }
        });
        Dialog_UI_Client.getContentPane().add(btn_Comprar_Coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        btn_Garaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Garaje.setText("GARAJE");
        btn_Garaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Garaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GarajeActionPerformed(evt);
            }
        });
        Dialog_UI_Client.getContentPane().add(btn_Garaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        DialogGaraje.setMinimumSize(new java.awt.Dimension(1300, 800));
        DialogGaraje.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Garaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COCHES COMPRADOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_Garaje.getTableHeader().setReorderingAllowed(false);
        Tabla_Garaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_GarajeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tabla_Garaje);

        DialogGaraje.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 1060, 440));

        btn_devolver_coche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_devolver_coche.setText("Devolver");
        btn_devolver_coche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_devolver_coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolver_cocheActionPerformed(evt);
            }
        });
        DialogGaraje.getContentPane().add(btn_devolver_coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        btn_actualizarTablaGaraje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_actualizarTablaGaraje.setText("ACTUALIZAR TABLA");
        btn_actualizarTablaGaraje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizarTablaGaraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarTablaGarajeActionPerformed(evt);
            }
        });
        DialogGaraje.getContentPane().add(btn_actualizarTablaGaraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, -1, -1));

        btn_SalirGaraje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_SalirGaraje.setText("Volver atras");
        btn_SalirGaraje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SalirGaraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirGarajeActionPerformed(evt);
            }
        });
        DialogGaraje.getContentPane().add(btn_SalirGaraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        DialogConducir.setMinimumSize(new java.awt.Dimension(580, 500));
        DialogConducir.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo5proyectofinal/coche.png"))); // NOI18N
        DialogConducir.getContentPane().add(coche, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        delim4.setBackground(new java.awt.Color(0, 0, 0));
        delim4.setOpaque(true);
        DialogConducir.getContentPane().add(delim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 20, 40));

        delim2.setBackground(new java.awt.Color(0, 0, 0));
        delim2.setOpaque(true);
        DialogConducir.getContentPane().add(delim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 20, 40));

        delim3.setBackground(new java.awt.Color(0, 0, 0));
        delim3.setOpaque(true);
        DialogConducir.getContentPane().add(delim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 20, 40));

        delim5.setBackground(new java.awt.Color(0, 0, 0));
        delim5.setOpaque(true);
        DialogConducir.getContentPane().add(delim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 20, 40));

        delim1.setBackground(new java.awt.Color(0, 0, 0));
        delim1.setOpaque(true);
        DialogConducir.getContentPane().add(delim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 20, 40));

        delim7.setBackground(new java.awt.Color(0, 0, 0));
        delim7.setOpaque(true);
        DialogConducir.getContentPane().add(delim7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 20, 40));

        delim8.setBackground(new java.awt.Color(0, 0, 0));
        delim8.setOpaque(true);
        DialogConducir.getContentPane().add(delim8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 20, 40));

        delim6.setBackground(new java.awt.Color(0, 0, 0));
        delim6.setOpaque(true);
        DialogConducir.getContentPane().add(delim6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 20, 40));

        btn_Correr.setText("Correr");
        btn_Correr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CorrerActionPerformed(evt);
            }
        });
        DialogConducir.getContentPane().add(btn_Correr, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        btn_Empezar.setText("Empezar Partida");
        btn_Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmpezarActionPerformed(evt);
            }
        });
        DialogConducir.getContentPane().add(btn_Empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIE SESIÓN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 70));

        Btn_Inicio_Admin.setText("INICIAR SESION COMO ADMINISTRADOR");
        Btn_Inicio_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Inicio_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Inicio_AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Inicio_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        Btn_Inicio_Cliente.setText("INICIAR SESION COMO CLIENTE");
        Btn_Inicio_Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Inicio_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Inicio_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Inicio_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Inicio_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Inicio_AdminActionPerformed
        Dialog_Inicio_Administrador.setVisible(true);
    }//GEN-LAST:event_Btn_Inicio_AdminActionPerformed

    private void Btn_Inicio_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Inicio_ClienteActionPerformed
        Dialog_Inicio_Cliente.setVisible(true);
    }//GEN-LAST:event_Btn_Inicio_ClienteActionPerformed

    private void Btn_Admin_Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Admin_Iniciar_SesionActionPerformed
        String usuario_admin = UserField_Admin.getText();
        String pass_admin = new String(PassField_Admin.getPassword());
        
        if (comprobar_credenciales_admin(usuario_admin, pass_admin)){
            JOptionPane.showMessageDialog(null, "Inicio de sesion correcto", "Succes Log In",JOptionPane.INFORMATION_MESSAGE);
            Dialog_UI_Admin.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Inicio de sesion incorrecto", "Falied Log In", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Btn_Admin_Iniciar_SesionActionPerformed

    private void Btn_Client_Iniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Client_Iniciar_SesionActionPerformed
        String usuario_cliente = UserField_Client.getText();
        String pass_cliente = new String(PassField_Client.getPassword());
        
        if (comprobar_credenciales_cliente(usuario_cliente, pass_cliente)){
            Conexion_BD obj_con = new Conexion_BD();
            obj_con.guardarRecibosEnFichero();
            JOptionPane.showMessageDialog(null, "Inicio de sesion correcto", "Succes Log In",JOptionPane.INFORMATION_MESSAGE);
            Dialog_UI_Client.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Inicio de sesion incorrecto", "Falied Log In", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Btn_Client_Iniciar_SesionActionPerformed

    private void Tabla_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_AdminMouseClicked
         int fila = Tabla_Admin.getSelectedRow();
        if (fila != -1) {
            Field_Marca_Admin.setText(Tabla_Admin.getValueAt(fila, 0).toString());
            Field_Modelo_Admin.setText(Tabla_Admin.getValueAt(fila, 1).toString());
            Field_Matricula_Admin.setText(Tabla_Admin.getValueAt(fila, 2).toString());
            Field_Kilometraje_Admin.setText(Tabla_Admin.getValueAt(fila, 3).toString());
            Field_AnoFabricacion_Admin.setText(Tabla_Admin.getValueAt(fila, 4).toString());
            Field_Precio_Admin.setText(Tabla_Admin.getValueAt(fila, 5).toString());
            Field_Cv_Admin.setText(Tabla_Admin.getValueAt(fila, 6).toString());
            Field_Color_Admin.setText(Tabla_Admin.getValueAt(fila, 7).toString());

            // Opcional: si no quieres que se edite la matrícula (clave)
            Field_Matricula_Admin.setEditable(false);
        }
    }//GEN-LAST:event_Tabla_AdminMouseClicked

    private void btn_actualizar_tabla_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_tabla_AdminActionPerformed
        Conexion_BD obj_con = new Conexion_BD();
        ArrayList<Coche> catalogo = obj_con.Consultar_coches();
        
        DefaultTableModel vaciar_tabla = (DefaultTableModel) Tabla_Admin.getModel();
        vaciar_tabla.setNumRows(0);
        Tabla_Admin.setModel(vaciar_tabla);
        
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Admin.getModel();
        for (int i = 0; i < catalogo.size(); i++){
            Object[] coche = new Object[8];
            coche[0] = catalogo.get(i).getMarca();
            coche[1] = catalogo.get(i).getModelo();
            coche[2] = catalogo.get(i).getMatricula();
            coche[3] = catalogo.get(i).getKilometraje();
            coche[4] = catalogo.get(i).getAno_fabricacion();
            coche[5] = catalogo.get(i).getPrecio();
            coche[6] = catalogo.get(i).getCv();
            coche[7] = catalogo.get(i).getColor();
            modelo.addRow(coche);
        }
        Tabla_Admin.setModel(modelo);
    }//GEN-LAST:event_btn_actualizar_tabla_AdminActionPerformed

    private void Btn_Añadir_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Añadir_CocheActionPerformed
        Coche obj_coche = new Coche();
        obj_coche.setMarca(Field_Marca_Admin.getText());
        obj_coche.setModelo(Field_Modelo_Admin.getText());
        obj_coche.setMatricula(Field_Matricula_Admin.getText());
        obj_coche.setKilometraje(Float.parseFloat(Field_Kilometraje_Admin.getText()));
        obj_coche.setAno_fabricacion(Integer.parseInt(Field_AnoFabricacion_Admin.getText()));
        obj_coche.setPrecio(Float.parseFloat(Field_Precio_Admin.getText()));
        obj_coche.setCv(Integer.parseInt(Field_Cv_Admin.getText()));
        obj_coche.setColor(Field_Color_Admin.getText());
        
        Conexion_BD obj_con = new Conexion_BD();
        obj_con.insertar_coches_bd(obj_coche);
    }//GEN-LAST:event_Btn_Añadir_CocheActionPerformed

    private void Btn_Eliminar_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Eliminar_CocheActionPerformed
        int filaSeleccionada = Tabla_Admin.getSelectedRow();

        int confirmacion = JOptionPane.showConfirmDialog(this, "Se va a eliminar ese coche de la Base de Datos, ¿Está Seguro?", "", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            
            if (filaSeleccionada != -1) {
                String matricula = Tabla_Admin.getValueAt(filaSeleccionada, 2).toString(); // cambia índice si necesario
                Conexion_BD obj_con = new Conexion_BD();

                if (obj_con.eliminarCoche_BD(matricula)) {
                    JOptionPane.showMessageDialog(null, "Coche eliminado correctamente.");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el coche.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un coche de la tabla.");
            }
        }
    }//GEN-LAST:event_Btn_Eliminar_CocheActionPerformed

    private void Btn_Editar_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Editar_CocheActionPerformed
        Coche obj_coche = new Coche();
        obj_coche.setMarca(Field_Marca_Admin.getText());
        obj_coche.setModelo(Field_Modelo_Admin.getText());
        obj_coche.setMatricula(Field_Matricula_Admin.getText());  // Clave para buscar en BD
        obj_coche.setKilometraje(Float.parseFloat(Field_Kilometraje_Admin.getText()));
        obj_coche.setAno_fabricacion(Integer.parseInt(Field_AnoFabricacion_Admin.getText()));
        obj_coche.setPrecio(Float.parseFloat(Field_Precio_Admin.getText()));
        obj_coche.setCv(Integer.parseInt(Field_Cv_Admin.getText()));
        obj_coche.setColor(Field_Color_Admin.getText());

        Conexion_BD obj_con = new Conexion_BD();

        if (obj_con.actualizarCoche_BD(obj_coche)) {
            JOptionPane.showMessageDialog(null, "Coche actualizado correctamente.");
            // Aquí refresca tabla si quieres
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el coche.");
        }
    }//GEN-LAST:event_Btn_Editar_CocheActionPerformed

    private void Tabla_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_ClienteMouseClicked

    private void btn_actualizar_tabla_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_tabla_ClienteActionPerformed
        Conexion_BD obj_con = new Conexion_BD();
        ArrayList<Coche> catalogo = obj_con.Consultar_coches();
        
        DefaultTableModel vaciar_tabla = (DefaultTableModel) Tabla_Cliente.getModel();
        vaciar_tabla.setNumRows(0);
        Tabla_Cliente.setModel(vaciar_tabla);
        
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Cliente.getModel();
        for (int i = 0; i < catalogo.size(); i++){
            Object[] coche = new Object[8];
            coche[0] = catalogo.get(i).getMarca();
            coche[1] = catalogo.get(i).getModelo();
            coche[2] = catalogo.get(i).getMatricula();
            coche[3] = catalogo.get(i).getKilometraje();
            coche[4] = catalogo.get(i).getAno_fabricacion();
            coche[5] = catalogo.get(i).getPrecio();
            coche[6] = catalogo.get(i).getCv();
            coche[7] = catalogo.get(i).getColor();
            modelo.addRow(coche);
        }
        Tabla_Cliente.setModel(modelo);
    }//GEN-LAST:event_btn_actualizar_tabla_ClienteActionPerformed

    private void btn_Comprar_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Comprar_CocheActionPerformed
    int filaSeleccionada = Tabla_Cliente.getSelectedRow();
    if (filaSeleccionada != -1) {
        try {
            String matricula = Tabla_Cliente.getValueAt(filaSeleccionada, 2).toString();

            String sqlBuscarIdCoche = "SELECT ID_coche FROM coche WHERE matricula = ?";
            ps = cn.prepareStatement(sqlBuscarIdCoche);
            ps.setString(1, matricula);
            registro = ps.executeQuery();

            if (registro.next()) {
                int idCoche = registro.getInt("ID_coche");

                // Insertar la compra en la tabla recibo_de_compra
                String sqlInsertarCompra = "INSERT INTO recibo_de_compra (ID_cliente, ID_coche) VALUES (?, ?)";
                ps = cn.prepareStatement(sqlInsertarCompra);
                ps.setInt(1, Sesion.idCliente);
                ps.setInt(2, idCoche);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Compra registrada correctamente.");
                Conexion_BD obj_con = new Conexion_BD();
                obj_con.guardarRecibosEnFichero();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el ID del coche con matrícula: " + matricula);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar la compra:\n" + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona un coche para comprar.");
    }
    }//GEN-LAST:event_btn_Comprar_CocheActionPerformed

    private void btn_GarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GarajeActionPerformed
        DialogGaraje.setVisible(true);
        Conexion_BD obj_con = new Conexion_BD();
        obj_con.guardarRecibosEnFichero();
    }//GEN-LAST:event_btn_GarajeActionPerformed

    private void Tabla_GarajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_GarajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_GarajeMouseClicked

    private void Btn_Conducir_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Conducir_CocheActionPerformed
        DialogConducir.setVisible(true);
        coche_x = coche.getX();
        coche_y = coche.getY();
    }//GEN-LAST:event_Btn_Conducir_CocheActionPerformed

    private void btn_CorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CorrerActionPerformed
        
        Carrera race = new Carrera(coche, delim1,delim2,delim3,delim4,delim5,delim6,delim7,delim8);
        race.start();

    }//GEN-LAST:event_btn_CorrerActionPerformed

    private void btn_EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmpezarActionPerformed
        coche.setLocation(coche_y, coche_x);
    }//GEN-LAST:event_btn_EmpezarActionPerformed

    private void btn_LogOut_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOut_ClientActionPerformed
        Dialog_UI_Client.setVisible(false);
    }//GEN-LAST:event_btn_LogOut_ClientActionPerformed

    private void btn_LogOut_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOut_AdminActionPerformed
        Dialog_UI_Admin.setVisible(false);
    }//GEN-LAST:event_btn_LogOut_AdminActionPerformed

    private void btn_devolver_cocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolver_cocheActionPerformed
        int filaSeleccionada = Tabla_Garaje.getSelectedRow();
        if (filaSeleccionada != -1) {
            String nombreCoche = (String) Tabla_Garaje.getValueAt(filaSeleccionada, 0);

            Conexion_BD conexion = new Conexion_BD();
            boolean eliminado = conexion.eliminarReciboPorNombreCocheYSesion(nombreCoche, Sesion.idCliente);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Coche devuelto correctamente.");
                Conexion_BD obj_con = new Conexion_BD();
                obj_con.guardarRecibosEnFichero();
            } else {
                JOptionPane.showMessageDialog(null, "Error al devolver el coche.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un coche para devolver.");
        }
    }//GEN-LAST:event_btn_devolver_cocheActionPerformed

    private void btn_actualizarTablaGarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarTablaGarajeActionPerformed
        ArchivoObject archivo = new ArchivoObject();
        ArrayList<ReciboDeCompra> recibos = archivo.leerRecibos("recibos.dat");

        Conexion_BD conexion = new Conexion_BD();
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Garaje.getModel();
        modelo.setRowCount(0); // Limpiar tabla

        for (ReciboDeCompra r : recibos) {
            if (r.getIdCliente() == Sesion.idCliente) {
                String nombreCoche = conexion.obtenerNombreCochePorID(r.getIdCoche());
                modelo.addRow(new Object[]{ nombreCoche });
            }
        }
    }//GEN-LAST:event_btn_actualizarTablaGarajeActionPerformed

    private void btn_SalirGarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirGarajeActionPerformed
        DialogGaraje.setVisible(false);
    }//GEN-LAST:event_btn_SalirGarajeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
    
    
    private boolean comprobar_credenciales_admin(String usuario, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid","root","1213");
            System.out.println("Se conecto correctamente");
            
            sql = cn.createStatement();
            
            String SQL = "SELECT * FROM cuenta_empleado WHERE usuario = '" + usuario + "' AND contrasena = '" + pass + "';";
            
        registro = sql.executeQuery(SQL);
            
            return registro.next();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar o consultar:\n" + ex.getMessage());
            return false;
        }
        
        
    }
    
    private boolean comprobar_credenciales_cliente(String usuario, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario_grupo5?serverTimezone=Europe/Madrid", "root", "1213");
            System.out.println("Se conectó correctamente");

            String SQL = "SELECT ID_cliente FROM cuenta_cliente WHERE usuario = ? AND contrasena = ?";
            ps = cn.prepareStatement(SQL);
            ps.setString(1, usuario);
            ps.setString(2, pass);

            registro = ps.executeQuery();

            if (registro.next()) {
                Sesion.idCliente = registro.getInt("ID_cliente"); // Guarda el ID del cliente logueado
                return true;
            } else {
                return false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar o consultar:\n" + ex.getMessage());
            return false;
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Admin_Iniciar_Sesion;
    private javax.swing.JButton Btn_Añadir_Coche;
    private javax.swing.JButton Btn_Client_Iniciar_Sesion;
    private javax.swing.JButton Btn_Conducir_Coche;
    private javax.swing.JButton Btn_Editar_Coche;
    private javax.swing.JButton Btn_Eliminar_Coche;
    private javax.swing.JButton Btn_Inicio_Admin;
    private javax.swing.JButton Btn_Inicio_Cliente;
    private javax.swing.JDialog DialogConducir;
    private javax.swing.JDialog DialogGaraje;
    private javax.swing.JDialog Dialog_Inicio_Administrador;
    private javax.swing.JDialog Dialog_Inicio_Cliente;
    private javax.swing.JDialog Dialog_UI_Admin;
    private javax.swing.JDialog Dialog_UI_Client;
    private javax.swing.JTextField Field_AnoFabricacion_Admin;
    private javax.swing.JTextField Field_Color_Admin;
    private javax.swing.JTextField Field_Cv_Admin;
    private javax.swing.JTextField Field_Kilometraje_Admin;
    private javax.swing.JTextField Field_Marca_Admin;
    private javax.swing.JTextField Field_Matricula_Admin;
    private javax.swing.JTextField Field_Modelo_Admin;
    private javax.swing.JTextField Field_Precio_Admin;
    private javax.swing.JPasswordField PassField_Admin;
    private javax.swing.JPasswordField PassField_Client;
    private javax.swing.JTable Tabla_Admin;
    private javax.swing.JTable Tabla_Cliente;
    private javax.swing.JTable Tabla_Garaje;
    private javax.swing.JTextField UserField_Admin;
    private javax.swing.JTextField UserField_Client;
    private javax.swing.JButton btn_Comprar_Coche;
    private javax.swing.JButton btn_Correr;
    private javax.swing.JButton btn_Empezar;
    private javax.swing.JButton btn_Garaje;
    private javax.swing.JButton btn_LogOut_Admin;
    private javax.swing.JButton btn_LogOut_Client;
    private javax.swing.JButton btn_SalirGaraje;
    private javax.swing.JButton btn_actualizarTablaGaraje;
    private javax.swing.JButton btn_actualizar_tabla_Admin;
    private javax.swing.JButton btn_actualizar_tabla_Cliente;
    private javax.swing.JButton btn_devolver_coche;
    private javax.swing.JLabel coche;
    private javax.swing.JLabel delim1;
    private javax.swing.JLabel delim2;
    private javax.swing.JLabel delim3;
    private javax.swing.JLabel delim4;
    private javax.swing.JLabel delim5;
    private javax.swing.JLabel delim6;
    private javax.swing.JLabel delim7;
    private javax.swing.JLabel delim8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
