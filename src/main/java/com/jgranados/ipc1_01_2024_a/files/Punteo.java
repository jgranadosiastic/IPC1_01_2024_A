/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.files;

import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class Punteo {

    private String nombre1 ;
    private int punteo1 ;
    private String nombre2 ;
    private int punteo2 ;
    private LocalDate fecha;

    public Punteo(String nombre1, int punteo1, String nombre2, int punteo2, LocalDate fecha) {
        this.nombre1 = nombre1;
        this.punteo1 = punteo1;
        this.nombre2 = nombre2;
        this.punteo2 = punteo2;
        this.fecha = fecha;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public int getPunteo1() {
        return punteo1;
    }

    public void setPunteo1(int punteo1) {
        this.punteo1 = punteo1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getPunteo2() {
        return punteo2;
    }

    public void setPunteo2(int punteo2) {
        this.punteo2 = punteo2;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public void imprimirPunteo() {
        System.out.println("Punteo:");
        System.out.println("Nombre1: " + nombre1);
        System.out.println("Punteo1: " + punteo1);
        System.out.println("Nombre2: " + nombre2);
        System.out.println("Punteo2: " + punteo2);
        System.out.println("Fecha: " + fecha);
        
    }

   
    
    
}
