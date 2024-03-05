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
public class Rectangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    @Override
    public double calcularArea() {
        return base * altura;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * base + 2 *  altura;
    }
    
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el base");
        base = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese ela altura");
        altura = Integer.valueOf(scanner.nextLine());
    }
}
