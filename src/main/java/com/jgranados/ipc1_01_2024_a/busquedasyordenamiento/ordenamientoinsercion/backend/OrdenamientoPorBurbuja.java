/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.backend;

import com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.frontend.Etiqueta;
import com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.frontend.OrdenamientoInsercionFrame;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class OrdenamientoPorBurbuja extends Thread {

    private Etiqueta[] arregloNoOrdenado = null;
    private OrdenamientoInsercionFrame frame = null;

    public Etiqueta[] getArregloNoOrdenado() {
        return arregloNoOrdenado;
    }

    public void setArregloNoOrdenado(Etiqueta[] arregloNoOrdenado) {
        this.arregloNoOrdenado = arregloNoOrdenado;
    }

    public OrdenamientoPorBurbuja(OrdenamientoInsercionFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        try {
            frame.desactivarBtnOrdenamiento();
            ordenarEtiquetas(arregloNoOrdenado);
            frame.activarBtnOrdenamiento();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Etiqueta[] ordenarEtiquetas(Etiqueta[] arregloNoOrdenado) throws InterruptedException {
        boolean hayamosOrdenadoPareja;

        do {
            hayamosOrdenadoPareja = false;
            for (int i = 0; i < arregloNoOrdenado.length - 1; i++) {
                int indiceA = i;
                int indiceB = i + 1;
                Etiqueta etqA = arregloNoOrdenado[indiceA];
                Etiqueta etqB = arregloNoOrdenado[indiceB];

                etqA.setForeground(Color.yellow);
                etqB.setForeground(Color.yellow);

                Thread.sleep(500);

                if (etqB.getValor() < etqA.getValor()) {
                    etqA.setForeground(Color.RED);
                    etqB.setForeground(Color.RED);
                    Thread.sleep(500);

                    arregloNoOrdenado[indiceA] = etqB;
                    arregloNoOrdenado[indiceB] = etqA;
                    etqA.setForeground(Color.GREEN);
                    etqB.setForeground(Color.GREEN);
                    frame.mostrarEtiquetas();
                    Thread.sleep(1500);

                    hayamosOrdenadoPareja = true;
                } else {
                    etqA.setForeground(Color.GREEN);
                    etqB.setForeground(Color.GREEN);

                    Thread.sleep(500);
                }

                etqA.setForeground(Color.BLACK);
                etqB.setForeground(Color.BLACK);

                Thread.sleep(500);

            }

            frame.mostrarEtiquetas();

        } while (hayamosOrdenadoPareja);

        return arregloNoOrdenado;
    }
}
