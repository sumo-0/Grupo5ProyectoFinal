/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5proyectofinal;

/**
 *
 * @author Sumo
 */
public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private float kilometraje;
    private int ano_fabricacion;
    private float precio;
    private int cv;
    private String color;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, float kilometraje, int ano_fabricacion, float precio, int cv, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.kilometraje = kilometraje;
        this.ano_fabricacion = ano_fabricacion;
        this.precio = precio;
        this.cv = cv;
        this.color = color;
    }

    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAno_fabricacion() {
        return ano_fabricacion;
    }

    public void setAno_fabricacion(int ano_fabricacion) {
        this.ano_fabricacion = ano_fabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
