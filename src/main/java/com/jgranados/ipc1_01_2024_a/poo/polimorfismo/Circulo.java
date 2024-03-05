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
public class Circulo extends FiguraGeometrica {
    private int radio;

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = Integer.valueOf(scanner.nextLine());
    }
    
    
}
