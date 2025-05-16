    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5proyectofinal;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Sumo
 */
public class Carrera extends Thread{
    Random aleatorio = new Random();
    JLabel L;
    JLabel bloque1;
    JLabel bloque2;
    JLabel bloque3;
    JLabel bloque4;
    JLabel bloque5;
    JLabel bloque6;
    JLabel bloque7;
    JLabel bloque8;  
        
    public Carrera(JLabel L, JLabel bloque1, JLabel bloque2, JLabel bloque3, JLabel bloque4, JLabel bloque5, JLabel bloque6, JLabel bloque7, JLabel bloque8) {
        this.L = L;
        this.bloque1 = bloque1;
        this.bloque2 = bloque2;
        this.bloque3 = bloque3;
        this.bloque4 = bloque4;
        this.bloque5 = bloque5;
        this.bloque6 = bloque6;
        this.bloque7 = bloque7;
        this.bloque8 = bloque8;
    }

    @Override
    public void run() {
        int coordenadaFinX = bloque1.getX();
        int coordenadaFinY;
        int coordenadaComienzoY = L.getY();
        int coordenadaComienzoX = L.getX();
        int valor;
       
        for (int i = coordenadaComienzoX; coordenadaComienzoX < coordenadaFinX-30; i += valor) {
            valor = aleatorio.nextInt(15);
            coordenadaComienzoX = L.getX();
            L.setLocation(coordenadaComienzoX+ valor, coordenadaComienzoY );
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        coordenadaFinX = bloque2.getX();
         coordenadaComienzoY = L.getY();
         coordenadaComienzoX = L.getX();
        
        for (int i = coordenadaComienzoX; coordenadaComienzoX < coordenadaFinX-30; i += valor) {
            valor = aleatorio.nextInt(15);
            coordenadaComienzoX = L.getX();
            coordenadaComienzoY = L.getY();
            L.setLocation(coordenadaComienzoX+ valor, coordenadaComienzoY-valor );
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        coordenadaFinY = bloque3.getY();
         coordenadaComienzoY = L.getY();
         coordenadaComienzoX = L.getX();
        for (int i = coordenadaComienzoY; coordenadaComienzoY > coordenadaFinY+10; i += valor) {
            valor = aleatorio.nextInt(15);
            coordenadaComienzoY = L.getY();
            L.setLocation(coordenadaComienzoX, coordenadaComienzoY - valor);
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        coordenadaFinX = bloque4.getX();
       
         
         coordenadaComienzoX = L.getX();
         
       
        for (int i = coordenadaComienzoX; coordenadaComienzoX < coordenadaFinX; i += valor) {
            valor = aleatorio.nextInt(15);
            coordenadaComienzoX = L.getX();
            coordenadaComienzoY = L.getY();
            L.setLocation(coordenadaComienzoX- valor, coordenadaComienzoY );
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // 4. Diagonal arriba izquierda (bloque3 ➝ bloque4) – MÁS ARRIBA E IZQUIERDA
    while (L.getX() > bloque4.getX() + 15 && L.getY() > bloque4.getY() - 10) {
        valor = aleatorio.nextInt(10);
        L.setLocation(L.getX() - valor, L.getY() - valor);
        sleepThread();
    }

    // 5. Izquierda (bloque4 ➝ bloque5) – MÁS A LA IZQUIERDA
    while (L.getX() > bloque5.getX() - 10) {
        valor = aleatorio.nextInt(10);
        L.setLocation(L.getX() - valor, L.getY());
        sleepThread();
    }

    // 6. Diagonal abajo izquierda (bloque5 ➝ bloque6) – MÁS A LA IZQUIERDA
    while (L.getX() > bloque6.getX() - 10 && L.getY() < bloque6.getY() - 5) {
        valor = aleatorio.nextInt(10);
        L.setLocation(L.getX() - valor, L.getY() + valor);
        sleepThread();
    }

    // 7. Abajo (bloque6 ➝ bloque7)
    while (L.getY() < bloque7.getY() - 5) {
        valor = aleatorio.nextInt(10);
        L.setLocation(L.getX(), L.getY() + valor);
        sleepThread();
    }

    // 8. Diagonal abajo derecha (bloque7 ➝ bloque8)
    while (L.getX() < bloque8.getX() - 5 && L.getY() < bloque8.getY() - 5) {
        valor = aleatorio.nextInt(10);
        L.setLocation(L.getX() + valor, L.getY() + valor);
        sleepThread();
    }

    // Regresar al punto de partida (frente curva 1)
    while (L.getX() > bloque1.getX() + 10) {
        valor = aleatorio.nextInt(10);
        L.setLocation(L.getX() - valor, L.getY());
        sleepThread();
    }
    }
    private void sleepThread() {
    try {
        Thread.sleep(100);
    } catch (InterruptedException ex) {
        Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}

