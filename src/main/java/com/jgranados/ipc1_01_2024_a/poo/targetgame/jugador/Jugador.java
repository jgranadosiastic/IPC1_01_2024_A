/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.targetgame.jugador;

import com.jgranados.ipc1_01_2024_a.poo.targetgame.motor.MotorJuego;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.Tiro;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.TiroBajoElBrazo;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.TiroControlado;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.tiros.TiroRapido;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Jugador {
    
    private static final int PUNTAJE_MAXIMO = 50;

    private int puntaje;
    private String nombre;

    public int getPuntaje() {
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Tiro seleccionarTiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un tiro:");
        System.out.println("1. Tiro Rapido");
        System.out.println("2. Tiro Controlado");
        System.out.println("3. Tiro bajo el brazo:");
        int opcion = Integer.valueOf(scanner.nextLine());

        switch (opcion) {
            case 1:
                // casteo implicito
                return new TiroRapido();
            case 2:
                return new TiroControlado();
            default:
                return new TiroBajoElBrazo();
        }
    }
    
    public void sumarPunteo(int punteoAAgregar) {
        puntaje = puntaje + punteoAAgregar;
    }
    
    public boolean esGanador() {
        return puntaje >= PUNTAJE_MAXIMO;
    }
}
