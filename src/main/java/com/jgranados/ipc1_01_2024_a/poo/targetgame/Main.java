/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.targetgame;

import com.jgranados.ipc1_01_2024_a.poo.targetgame.jugador.Jugador;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.motor.MotorJuego;

/**
 *
 * @author jose
 */
public class Main {
    
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        Jugador[] jugadores = menu.pedirJugadores();
        
        MotorJuego motor = new MotorJuego();
        motor.echarPunta(jugadores);
    }
}
