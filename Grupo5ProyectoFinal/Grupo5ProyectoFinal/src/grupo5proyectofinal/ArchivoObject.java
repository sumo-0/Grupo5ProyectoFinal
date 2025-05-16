package grupo5proyectofinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoObject {
    public void guardarRecibos(String ruta, ArrayList<ReciboDeCompra> recibos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("recibos.dat"))) {
            oos.writeObject(recibos);
            System.out.println("Recibos guardados correctamente.");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<ReciboDeCompra> leerRecibos(String ruta) {
        ArrayList<ReciboDeCompra> recibos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("recibos.dat"))) {
            recibos = (ArrayList<ReciboDeCompra>) ois.readObject();
            System.out.println("Recibos leídos correctamente.");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArchivoObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recibos;
    }
}

