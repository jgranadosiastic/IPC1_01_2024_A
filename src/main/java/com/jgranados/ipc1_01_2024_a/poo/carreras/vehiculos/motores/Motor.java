/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores;

import java.util.Random;

/**
 *
 * @author jose
 */
public class Motor {
    
    protected int velocidadBaja;
    protected int velocidadAlta;
    
    public int calcularMetros() {
        Random random = new Random();
        
        return random.nextInt(velocidadBaja, velocidadAlta + 1);
    }
}
