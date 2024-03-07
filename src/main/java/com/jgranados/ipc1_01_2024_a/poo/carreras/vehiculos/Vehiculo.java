/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos;

import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores.Motor;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos.Neumatico;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.stickers.Sticker;

/**
 *
 * @author jose
 */
public class Vehiculo {
    private Motor motor;
    private Neumatico neumatico;
    private Sticker[] stickers;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(Neumatico neumatico) {
        this.neumatico = neumatico;
    }

    public Sticker[] getStickers() {
        return stickers;
    }

    public void setStickers(Sticker[] stickers) {
        this.stickers = stickers;
    }
    
    
}
