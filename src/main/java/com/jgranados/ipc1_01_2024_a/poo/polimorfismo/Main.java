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
public class Main {

    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[5];
        System.out.println("Selecciona una figura");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Circulo");

        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.valueOf(scanner.nextLine());
        FiguraGeometrica figuraCreada = null;
        switch (opcion) {
            case 1:
                // triangulo
                figuraCreada = new Triangulo();
                break;
            case 2:
                figuraCreada = new Rectangulo();
                break;
            case 3:
                figuraCreada = new Cuadrado();
                break;
            case 4:
                figuraCreada = new Circulo();
                break;
        }

        figuraCreada.pedirDatos();
        System.out.println("Area: " + figuraCreada.calcularArea());
        System.out.println("Perimetro " + figuraCreada.calcularPerimetro());
    }
}
