/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        int[] valores = new int[] {7, 8, 11, 15, 20, 22, 23, 24, 30};
        int[] valores1 = new int[] {8, 11, 7, 30, 20, 24, 23, 22, 15};
        BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial(valores);
        
        busquedaSecuencial.buscarValor(22);
        busquedaSecuencial.buscarValor(4);
        busquedaSecuencial.buscarValor(31);
        
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(valores);
        busquedaBinaria.buscarValor(22);
        busquedaBinaria.buscarValor(4);
        busquedaBinaria.buscarValor(31);
        
        BusquedaSecuencial busquedaSecuencial1 = new BusquedaSecuencial(valores1);
        
        busquedaSecuencial1.buscarValor(22);
        busquedaSecuencial1.buscarValor(4);
        busquedaSecuencial1.buscarValor(31);
        
        BusquedaBinaria busquedaBinaria1 = new BusquedaBinaria(valores1);
        busquedaBinaria1.buscarValor(22);
        busquedaBinaria1.buscarValor(4);
        busquedaBinaria1.buscarValor(31);
    }
}
