/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.abstraccion.articulos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class ArticulosMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Ingrese el costo base del articulo");

            int costoBase = Integer.valueOf(scanner.nextLine());

            Articulo elArticulo = new Articulo();
            elArticulo.cambiarCostoBase(costoBase);
            //elArticulo.costoBase = 25.5;
            System.out.println("El precio al mayor es: " + elArticulo.calcularPrecioAlMayor());
            System.out.println("El precio al detalle es: " + elArticulo.calcularPrecioDetalle());
            
            System.out.println("Desea salir? (si = 1, no = 2)");
            opcion = Integer.valueOf(scanner.nextLine());
        } while (opcion == 2);

    }
}
