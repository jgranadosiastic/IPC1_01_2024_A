/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.targetgame.motor;

import com.jgranados.ipc1_01_2024_a.poo.targetgame.jugador.Jugador;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.Tiro;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MotorJuego {

    private Jugador[] jugadores;
    private Diana diana;
    private int indiceEnTurno;

    public MotorJuego() {
        diana = new Diana();
        indiceEnTurno = 0;
    }

    public Jugador obtenerGanador() {
        for (Jugador jugador : jugadores) {
            if (jugador.esGanador()) {
                return jugador;
            }
        }

        return null;
    }

    public Jugador definirJugadorInicial() {
        Random random = new Random();
        int posicionInicial = random.nextInt(jugadores.length);
        Jugador jugadorIncial = jugadores[posicionInicial];
        for (int i = posicionInicial - 1; i >= 0; i--) {
            Jugador jugadorAMover = jugadores[i];
            jugadores[i + 1] = jugadorAMover;
        }
        jugadores[0] = jugadorIncial;

        return jugadorIncial;
    }

    private boolean hayGanador() {
        for (Jugador jugador : jugadores) {
            if (jugador.esGanador()) {
                return true;
            }
        }

        return false;
    }

    public void echarPunta(Jugador[] jugadores) {
        // echa punta
        this.jugadores = jugadores;
        Jugador jugadorEnTurno = definirJugadorInicial();
        Scanner scanner = new Scanner(System.in);
        do {
            imprimirJugadorEnTurno();
            Tiro tiroSeleccionado = jugadorEnTurno.seleccionarTiro();
            int puntos = diana.calcularPuntos(tiroSeleccionado);
            System.out.println("El jugador obtuvo " + puntos);
            scanner.nextLine();
            jugadorEnTurno.sumarPunteo(puntos);
            cambiarTurno();
            imprimirDetallesPuntaje();
            jugadorEnTurno = this.jugadores[indiceEnTurno];
        } while (!hayGanador());
        Jugador ganador = obtenerGanador();
        System.out.printf("El ganador es el jugador %s, con un punteo de %d puntos",
                ganador.getNombre(),
                ganador.getPuntaje());
    }
    
    private void imprimirJugadorEnTurno() {
        Jugador enTurno = jugadores[indiceEnTurno];
        
        System.out.println("Jugador en turno:");
        System.out.println(enTurno.getNombre());
    }
    
    private void imprimirDetallesPuntaje() {
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador: " + jugador.getNombre());
            System.out.println("Punteo: " + jugador.getPuntaje());
        }
    }

    private void cambiarTurno() {
        if (indiceEnTurno < jugadores.length - 1) {
            indiceEnTurno++;
        } else {
            indiceEnTurno = 0;
        }
    }
}
