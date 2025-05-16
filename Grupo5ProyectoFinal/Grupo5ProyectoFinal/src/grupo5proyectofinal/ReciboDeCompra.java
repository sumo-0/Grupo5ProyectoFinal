package grupo5proyectofinal;

import java.io.Serializable;

public class ReciboDeCompra implements Serializable {
    private int idCompra;
    private int idCliente;
    private int idCoche;

    public ReciboDeCompra() {
    }
    
    public ReciboDeCompra(int idCompra, int idCliente, int idCoche) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.idCoche = idCoche;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdCoche() {
        return idCoche;
    }

    
}