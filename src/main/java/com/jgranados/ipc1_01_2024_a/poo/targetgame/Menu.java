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
        boolean hayError = true;
        Jugador[] jugadores = null;
        Scanner scanner = new Scanner(System.in);

        int cantidadJugadores = 0;

        // asdasd asd asd asd 
        do {
            try {
                System.out.println("Cuantos jugadores");
                cantidadJugadores = Integer.valueOf(scanner.nextLine());
                hayError = false;
            } catch (NumberFormatException ex) {
                System.out.println("Se equivocó al indicar cantidad de jugadores y no ingresó un numero válido!");
                System.out.println("Presione Enter para intentar de nuevo.");
                scanner.nextLine();
            }
        } while (hayError);

        jugadores = new Jugador[cantidadJugadores];
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador");
            String nombre = scanner.nextLine();

            Jugador jugador = new Jugador(nombre);
            jugadores[i] = jugador;

            try {
                System.out.println("ingrese numero: ");
                int data = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Se equivocó XXXXX y no ingresó un numero válido!");
                System.out.println("Presione Enter para intentar de nuevo.");
                scanner.nextLine();
            }
        }

        return jugadores;

    }
}
