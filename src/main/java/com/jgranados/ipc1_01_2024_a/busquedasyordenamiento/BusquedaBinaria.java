/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento;

/**
 *
 * @author jose
 */
public class BusquedaBinaria {

    private int[] valores;

    public BusquedaBinaria(int[] valores) {
        this.valores = valores;
    }

    public void buscarValor(int valorBuscado) {
        int indiceInicial = 0;
        int indiceFinal = valores.length - 1;
        int puntoMedio;
        int valorEncontrado;
        
        int contador = 0;

        while (indiceInicial <= indiceFinal) {
            contador++;
            puntoMedio = (indiceFinal - indiceInicial) / 2 + indiceInicial;
            valorEncontrado = valores[puntoMedio];

            if (valorBuscado == valorEncontrado) {
                System.out.printf("El valor buscado %d se encuentra en el indice %d\n", valorBuscado, puntoMedio);
                System.out.printf("Encontrado despues de %d intentos\n", contador);
                return;
            }

            if (valorBuscado < valorEncontrado) {
                indiceFinal = puntoMedio - 1;
            } else {
                indiceInicial = puntoMedio + 1;
            }
        }
        System.out.println("El valor buscado no existe en el arreglo");
        System.out.println("Intentos: " + contador);

    }

}
