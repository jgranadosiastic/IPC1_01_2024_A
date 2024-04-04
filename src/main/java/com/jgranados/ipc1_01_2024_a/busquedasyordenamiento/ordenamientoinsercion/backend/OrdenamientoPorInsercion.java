/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.backend;

import com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.frontend.Etiqueta;

/**
 *
 * @author jose
 */
public class OrdenamientoPorInsercion {

    public Etiqueta[] ordenarEtiquetas(Etiqueta[] arregloNoOrdenado) {
        Etiqueta valorActual;
        for (int i = 1; i < arregloNoOrdenado.length; i++) {
            valorActual = arregloNoOrdenado[i];
            int indiceActual = i;
            int indiceIzq = i - 1;

            Etiqueta valorIzq = arregloNoOrdenado[indiceIzq];

            while (indiceIzq >= 0 && valorActual.getValor() < valorIzq.getValor()) {
                valorIzq = arregloNoOrdenado[indiceIzq];
                arregloNoOrdenado[indiceActual] = valorIzq;
                arregloNoOrdenado[indiceIzq] = valorActual;
                indiceActual--;
                indiceIzq--;
                valorActual = arregloNoOrdenado[indiceActual];
                if (indiceIzq >= 0) {
                    valorIzq = arregloNoOrdenado[indiceIzq];
                }
            }
        }
        return arregloNoOrdenado;
    }
}
