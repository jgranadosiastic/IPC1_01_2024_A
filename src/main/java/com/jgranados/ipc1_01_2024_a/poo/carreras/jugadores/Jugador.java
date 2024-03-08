/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores;

import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.Vehiculo;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores.MotorDiesel;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos.NeumaticosAsfalto;

/**
 *
 * @author jose
 */
public class Jugador {
    private int dinero;
    private Vehiculo[] vehiculos;
    private Vehiculo vehiculoEnUso;
    
    public Jugador() {
        vehiculos = new Vehiculo[3];
        vehiculoEnUso = construirVehiculoInicial();
        vehiculos[0] = vehiculoEnUso;
    }
    
    private Vehiculo construirVehiculoInicial() {
        Vehiculo inicial = new Vehiculo();
        inicial.setMotor(new MotorDiesel());
        inicial.setNeumatico(new NeumaticosAsfalto());
        
        return inicial;
    }

    public Vehiculo getVehiculoEnUso() {
        return vehiculoEnUso;
    }

    public int getDinero() {
        return dinero;
    }
    
    public void recibirPremio(int premio) {
        dinero += premio;
    }
}
