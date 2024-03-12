/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.interfaces;

/**
 *
 * @author jose
 */
public class Carro extends Vehiculo implements Bocinar, Volar {

    @Override
    public void bocinar() {
        System.out.println("Bocinar desde carro");
    }

    @Override
    public void despegar() {
        System.out.println("Despegar desde carro");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizar desde carro");
    }
    
}
