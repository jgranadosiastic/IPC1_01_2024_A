/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.polimorfismo;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Cuadrado extends FiguraGeometrica {
    private int lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    @Override
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado");
        lado = Integer.valueOf(scanner.nextLine());
    }
}
