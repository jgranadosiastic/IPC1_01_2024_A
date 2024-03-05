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
public class Triangulo extends FiguraGeometrica {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;

    @Override
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese la altura");
        altura = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese el lado 1");
        lado1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese el lado 2");
        lado2 = Integer.valueOf(scanner.nextLine());
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}
