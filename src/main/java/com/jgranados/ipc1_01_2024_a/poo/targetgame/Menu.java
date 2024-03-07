/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.targetgame;

import com.jgranados.ipc1_01_2024_a.poo.targetgame.jugador.Jugador;
import com.jgranados.ipc1_01_2024_a.poo.targetgame.motor.MotorJuego;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Menu {
    
    public Jugador[] pedirJugadores() {
        Scanner scanner = new Scanner(System.in);
        int cantidadJugadores;
        
        // asdasd asd asd asd 
        System.out.println("Cuantos jugadores");
        cantidadJugadores = Integer.valueOf(scanner.nextLine());
        
        Jugador[] jugadores = new Jugador[cantidadJugadores];
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador");
            String nombre = scanner.nextLine();
            
            Jugador jugador = new Jugador(nombre);
            jugadores[i] = jugador;
        }
        
        return jugadores;
    }
}
