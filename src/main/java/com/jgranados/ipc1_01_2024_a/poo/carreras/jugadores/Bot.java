/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.jugadores;

import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.Vehiculo;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores.Motor;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores.MotorDiesel;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores.MotorTurbo;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.motores.MotorV8;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos.Neumatico;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos.NeumaticosAsfalto;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos.NeumaticosLluvia;
import com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos.NeumaticosTerraceria;
import java.util.Random;

/**
 *
 * @author jose
 */
public class Bot {
    private Vehiculo vehiculo;
    
    public Bot() {
        vehiculo = new Vehiculo();
        vehiculo.setMotor(crearMotorAleatorio());
        vehiculo.setNeumatico(crearNeumaticoAleatorio());
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    private Motor crearMotorAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(3);
        switch (numero) {
            case 0:
                return new MotorDiesel();
            case 1:
                return new MotorV8();
            default:
                return new MotorTurbo();
        }
    }

    private Neumatico crearNeumaticoAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(3);
        switch (numero) {
            case 0:
                return new NeumaticosAsfalto();
            case 1:
                return new NeumaticosLluvia();
            default:
                return new NeumaticosTerraceria();
        }
    }
    
    
}
