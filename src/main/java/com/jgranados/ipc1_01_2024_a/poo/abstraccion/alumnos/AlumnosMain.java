/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.abstraccion.alumnos;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class AlumnosMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cui;
        String nombre;
        int[] notas = new int[3];

        Alumno[] alumnos = new Alumno[2];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese cui:");
            cui = scanner.nextLine();
            System.out.println("Ingrese nombre:");
            nombre = scanner.nextLine();
            System.out.println("Ingrese nota 1:");
            notas[0] = Integer.valueOf(scanner.nextLine());
            System.out.println("Ingrese nota 2:");
            notas[1] = Integer.valueOf(scanner.nextLine());
            System.out.println("Ingrese nota 3:");
            notas[2] = Integer.valueOf(scanner.nextLine());

            Alumno elAlumno = new Alumno();
            elAlumno.cui = cui;
            elAlumno.nombre = nombre;
            elAlumno.notas = notas;
            
            alumnos[i] = elAlumno;

        }
        
        for (Alumno alumno : alumnos) {
            alumno.imprimirDatos();
        }
    }
}
