/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenacion;

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
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            if (valorBuscado == valor) {
                System.out.printf("El valor buscado %d se encuentra en el indice %d\n", valorBuscado, i);
                return;
            }
        }
        System.out.println("El valor buscado no existe en el arreglo");
    }
    
}
