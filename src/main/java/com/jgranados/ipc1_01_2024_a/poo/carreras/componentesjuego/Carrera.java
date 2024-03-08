/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.componentesjuego;

import com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores.Bot;
import com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores.Jugador;
import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.Pista;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.stickers.Sticker;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Carrera {

    private static final int PREMIO_BASE = 500;
            
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
        System.out.println("Carrera inicia en pista: " + pista.getClass().getSimpleName());
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Presione Enter para avanzar.");
            scanner.nextLine();

            int avanceJugador = jugador.getVehiculoEnUso().calcularAvance(pista);
            int avanceBot = bot.getVehiculo().calcularAvance(pista);
            
            registrarAvance(avanceJugador, avanceBot);

            System.out.println("El jugador avanzo: " + avanceJugador);
            System.out.println("El bot avanzo: " + avanceBot);
            
            System.out.println("Distancia jugador: " + distanciaRecorridaJugador);
            System.out.println("Distancia jugador: " + distanciaRecorridaBot);
        } while (!hayGanador());

        declararGanador();
        
        System.out.println("Presione Enter para finalizar la carrera.");
        scanner.nextLine();
    }
    
    private void registrarAvance(int avanceJugador, int avanceBot) {
        distanciaRecorridaJugador += avanceJugador;
        distanciaRecorridaBot += avanceBot;
    }

    private boolean hayGanador() {
        return distanciaRecorridaBot >= pista.getTamaño()
                || distanciaRecorridaJugador >= pista.getTamaño();
    }

    private boolean ganoElJugador() {
        return distanciaRecorridaJugador >= distanciaRecorridaBot;
    }

    private int calcularPremioJugador() {
        int total = PREMIO_BASE;
        if (!jugador.getVehiculoEnUso().tieneStickers()) {
            return PREMIO_BASE;
        }
        
        for (Sticker sticker :  jugador.getVehiculoEnUso().getStickers()) {
            total += sticker.calcularPremioExtra();
        }
        
        return total;
    }

    private void declararGanador() {
        Scanner scanner = new Scanner(System.in);
        if (ganoElJugador()) {
            int premio = calcularPremioJugador();
            jugador.recibirPremio(premio);
            System.out.println("Gano el jugador y ha ganado Q" + premio);
            System.out.println("El jugador ahora tiene Q" + jugador.getDinero());
        } else {
            System.out.println("El bot gana esta carrera!!");
        }
    }
}
