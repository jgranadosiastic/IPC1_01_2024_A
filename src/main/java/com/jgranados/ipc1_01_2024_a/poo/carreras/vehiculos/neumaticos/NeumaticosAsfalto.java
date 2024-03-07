/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.neumaticos;

import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.Pista;
import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.PistaAsfalto;
import com.jgranados.ipc1_01_2024_a.poo.carreras.pistas.PistaTerraceria;

/**
 *
 * @author jose
 */
public class NeumaticosAsfalto extends Neumatico {

    private static final int PENALIZACION_PISTA_ASFALTO = 0;
    private static final int PENALIZACION_PISTA_TERRACERIA = -3;
    private static final int PENALIZACION_PISTA_LODO = -6;
    
    @Override
    public int calcularPenalizacionPista(Pista pista) {
        if (pista instanceof PistaAsfalto) {
            return PENALIZACION_PISTA_ASFALTO;
        } else if (pista instanceof PistaTerraceria) {
            return PENALIZACION_PISTA_TERRACERIA;
        } else {
            return PENALIZACION_PISTA_LODO;
        }
    }
    
}
