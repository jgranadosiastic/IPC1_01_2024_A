/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.componentesjuego;

import com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores.Bot;
import com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores.Jugador;
import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.Pista;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Carrera {

    private Pista pista;
    private Jugador jugador;
    private Bot bot;
    private int distanciaRecorridaBot;
    private int distanciaRecorridaJugador;

    public Carrera(Pista pista, Jugador jugador) {
        this.pista = pista;
        this.jugador = jugador;
        bot = new Bot();
    }

    public void iniciarCarrera() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Presione Enter para avanzar.");
            scanner.nextLine();
            int avanceJugador = jugador.getVehiculoEnUso().calcularAvance();
            int avanceBot = bot.getVehiculo().calcularAvance();
            System.out.println("El jugador avanzo: " + avanceJugador);
            System.out.println("El bot avanzo: " + avanceBot);
        } while (!hayGanador());
    }

    private boolean hayGanador() {
        return distanciaRecorridaBot >= pista.getTamaño()
                || distanciaRecorridaJugador >= pista.getTamaño();
    }
}
