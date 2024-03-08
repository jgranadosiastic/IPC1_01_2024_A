/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores;

/**
 *
 * @author jose
 */
public class MotorV8 extends Motor {
    private static final int VELOCIDAD_BAJA = 9;
    private static final int VELOCIDAD_ALTA = 15;

    public MotorV8() {
        this.velocidadBaja = VELOCIDAD_BAJA;
        this.velocidadAlta = VELOCIDAD_ALTA;
    }
    
}
