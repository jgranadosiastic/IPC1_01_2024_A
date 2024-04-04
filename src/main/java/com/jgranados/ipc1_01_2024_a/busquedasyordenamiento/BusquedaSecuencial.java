/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento;

/**
 *
 * @author jose
 */
public class BusquedaSecuencial {
    
    private int[] valores;

    public BusquedaSecuencial(int[] valores) {
        this.valores = valores;
    }
    
    public void buscarValor(int valorBuscado) {
        int contador = 0;
        for (int i = 0; i < valores.length; i++) {
            contador++;
            int valor = valores[i];
            if (valorBuscado == valor) {
                System.out.printf("El valor buscado %d se encuentra en el indice %d\n", valorBuscado, i);
                System.out.printf("Encontrado despues de %d intentos\n", contador);
                return;
            }
        }
        System.out.println("El valor buscado no existe en el arreglo");
        System.out.println("Intentos: " + contador);
    }
    
}
