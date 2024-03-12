/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.interfaces;

/**
 *
 * @author jose
 */
public class Avion extends Vehiculo implements Volar {

    @Override
    public void despegar() {
        System.out.println("Despegando desde avion");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizando desde avion");
    }
    
}
