/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.threads.tragamonedas.backend;

import com.jgranados.ipc1_01_2024_a.threads.tragamonedas.frontend.Casilla;
import com.jgranados.ipc1_01_2024_a.threads.tragamonedas.frontend.TragamonedasFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class Tragamonedas {

    private Casilla casilla1;
    private Casilla casilla2 ;
    private Casilla casilla3;
    private TragamonedasFrame tragamonedasFrame;
    private int apuesta;
    private int cantidadMonedas;

    public Tragamonedas(TragamonedasFrame tragamonedasFrame) {
        this.tragamonedasFrame = tragamonedasFrame;
    }
    
    
    public void iniciarJuego(int apuesta) {
        this.apuesta = apuesta;
        casilla1 = new Casilla(this);
        casilla2 = new Casilla(this);
        casilla3 = new Casilla(this);
        tragamonedasFrame.agregarCasillas(casilla1, casilla2, casilla3);
        
        Thread casilla1Thread = new Thread(casilla1);
        Thread casilla2Thread = new Thread(casilla2);
        Thread casilla3Thread = new Thread(casilla3);
        casilla1Thread.start();
        casilla2Thread.start();
        casilla3Thread.start();
        
    }
    
    public void verificarRondaTerminada() {
        if (casilla1.yaTermine() && casilla2.yaTermine() && casilla3.yaTermine()) {
            obtenerGanancia();
            tragamonedasFrame.toggleControles();
        }
    }
    
    private void obtenerGanancia() {
        if (hayTresIguales()) {
            // ganancia es el triple
            int ganancia = apuesta * 3;
            cantidadMonedas += ganancia;
            tragamonedasFrame.avisarGanancia(ganancia, cantidadMonedas);
        } else if (hayDosIguales()) {
            // gana el doble
            int ganancia = apuesta * 3;
            cantidadMonedas += ganancia;
            tragamonedasFrame.avisarGanancia(ganancia, cantidadMonedas);
        } else {
            tragamonedasFrame.avisarPerdida(apuesta);
        }
    }
    
    private boolean hayTresIguales() {
        return casilla1.getImagenMostrada().equals(casilla2.getImagenMostrada()) &&
                casilla1.getImagenMostrada().equals(casilla3.getImagenMostrada());
    }
    
    private boolean hayDosIguales() {
        if (casilla1.getImagenMostrada().equals(casilla2.getImagenMostrada())) {
            return true;
        }
        
        if (casilla1.getImagenMostrada().equals(casilla3.getImagenMostrada())) {
            return true;
        }
        
        if (casilla2.getImagenMostrada().equals(casilla3.getImagenMostrada())) {
            return true;
        }
        
        return false;
    }
}
