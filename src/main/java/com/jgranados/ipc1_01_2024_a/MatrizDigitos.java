/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MatrizDigitos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dimension1;
        int dimension2;

        // preguntar el tamaño de la matriz (dos dimensiones)
        System.out.println("Ingrese el tamaño de la dimension 1");
        dimension1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese el tamaño de la dimension 2");
        dimension2 = Integer.valueOf(scanner.nextLine());

        int[][] matriz = new int[dimension1][dimension2];
        limpiarMatriz(matriz);

        // Se va a preguntar por un digito mientras haya espacio.
        while (hayEspacio(matriz)) {
            guardarDigito(matriz);
            dibujarMatriz(matriz);
        }
    }

    /**
     * Pide el digito a guardar y tambien pide la ubicacion dentro de la matriz.
     *
     * @param matriz
     */
    static void guardarDigito(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int fila;
        int columna;
        int digito;
        // preguntar la ubicacion del digito a guardar
        System.out.println("Ingrese la fila donde se guardara el digito: ");
        fila = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese la columna donde se guardara el digito: ");
        columna = Integer.valueOf(scanner.nextLine());

        // preguntar el digito a guardar
        System.out.println("Ingrese el digito (0-9)");
        digito = Integer.valueOf(scanner.nextLine());

        // guardar el digito
        matriz[fila][columna] = digito;
    }

    /**
     * Muestra un espacio en blanco para las casillas que estan vacias.
     *
     * @param matriz
     */
    static void dibujarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            int[] columnas = matriz[fila];
            for (int columna = 0; columna < columnas.length; columna++) {
                if (casillaVacia(matriz[fila][columna])) {
                    System.out.print("| |");
                } else {
                    System.out.printf("|%d|", matriz[fila][columna]);
                }
            }
            System.out.println("");
        }
    }

    /**
     * Se recorren las casillas para detectar alguna vacia. si hay al menos una
     * casilla vacia entonces aun hay espacio en la matriz.
     *
     * @param matriz
     * @return
     */
    static boolean hayEspacio(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int[] columnas = matriz[i];
            for (int j = 0; j < columnas.length; j++) {
                if (casillaVacia(matriz[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Cada valor dentro de la casilla se cambia -1 para indicar que está vacia.
     *
     * @param matriz
     */
    static void limpiarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int[] columnas = matriz[i];
            for (int j = 0; j < columnas.length; j++) {
                matriz[i][j] = -1;
            }
        }
    }

    /**
     * Una casilla se considera vacia si su valor es -1
     *
     * @param valor
     * @return
     */
    static boolean casillaVacia(int valor) {
        /*if (valor == -1) {
            return true;
        } else {
            return false;
        }*/
        return valor == -1;
    }

}
