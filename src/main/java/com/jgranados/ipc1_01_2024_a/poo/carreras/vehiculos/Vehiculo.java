/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos;

import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.Pista;
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
    
    public int calcularAvance(Pista pista) {
        int metros = motor.calcularMetros() + neumatico.calcularPenalizacionPista(pista);
        if (metros < 0) {
            metros = 0;
        }
        // En vez de un condicional tambien pudo haber sido:
        // metros = Math.abs(metros);
        
        return metros;
    }
    
    public boolean tieneStickers() {
        // se asume que si hay stickers entonces la primer casilla del arreglo
        // debe tener un sticker
        return stickers != null && stickers[0] != null;
    }
}
