/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.targetgame.motor;

import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.Tiro;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.TiroControlado;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.TiroRapido;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Diana {

    private static final int PUNTOS_CENTRO = 40;
    private static final int PUNTOS_30 = 30;
    private static final int PUNTOS_20 = 20;
    private static final int PUNTOS_10 = 10;

    public int calcularPuntos(Tiro tiroSeleccionado) {

        if (tiroSeleccionado instanceof TiroRapido) {
            return calcularPunteoTiroRapido();
        } else if (tiroSeleccionado instanceof TiroControlado) {
            return calcularPunteoTiroControlado();
        } else {
            return calcularPunteoTiroBajoElBrazo();
        }
        // si es tiroRapido
        // tal cosa
        // sin si es tiro controlado
        // tal otra
        // de lo contrario
        // otra
    }

    private int calcularPunteoTiroRapido() {
        Random random = new Random();
        int probabilidad = random.nextInt(101);
        if (probabilidad < 50) {
            return PUNTOS_CENTRO;
        }
        
        return 0;
    }

    private int calcularPunteoTiroControlado() {
        Random random = new Random();
        int probabilidad = random.nextInt(101);
        if (probabilidad < 33) {
            return PUNTOS_30;
        } else if (probabilidad >= 33 && probabilidad < 66) {
            return PUNTOS_20;
        } else {
            return PUNTOS_10;
        }
    }

    private int calcularPunteoTiroBajoElBrazo() {
        Random random = new Random();
        int probabilidad = random.nextInt(101);
        if (probabilidad < 20) {
            return PUNTOS_CENTRO;
        } else if (probabilidad >= 20 && probabilidad < 40) {
            return PUNTOS_30;
        } else if (probabilidad >= 40 && probabilidad < 60) {
            return PUNTOS_20;
        } else if (probabilidad >= 60 && probabilidad < 80) {
            return PUNTOS_10;
        } else {
            return 0;
        }
    }
}
