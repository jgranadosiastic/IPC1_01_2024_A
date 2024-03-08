/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras;

import com.jgranados.ipc1_01_2024_a.poo.carreras.componentesjuego.Carrera;
import com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores.Jugador;
import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.Pista;
import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.PistaAsfalto;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        // Prueba del juego
        Jugador jugador = new Jugador();
        Pista pista = new PistaAsfalto();
        Carrera carrera = new Carrera(pista, jugador);
        carrera.iniciarCarrera();
    }
}
