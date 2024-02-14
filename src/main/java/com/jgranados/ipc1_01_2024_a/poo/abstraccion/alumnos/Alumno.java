/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.abstraccion.alumnos;

/**
 *
 * @author jose
 */
public class Alumno {
    String cui;
    String nombre;
    int[] notas;
    
    boolean esAprobado() {
        return calcularNotaFinal() >= 61;
    }
    
    double calcularNotaFinal() {
        int total = 0;
        for (int nota : notas) {
            total += nota;
        }
        
        return total / notas.length;
    }
    
    void imprimirDatos() {
        double notaFinal = calcularNotaFinal();
        System.out.println("CIU: " + cui);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota promedio final: " + notaFinal);
        if (esAprobado()) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: No Aprobado");
        }
    }
}
