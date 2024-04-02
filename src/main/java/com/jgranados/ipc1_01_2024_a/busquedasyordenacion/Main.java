/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenacion;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        int[] valores = new int[] {7, 8, 11, 15, 20, 22, 23, 24, 30};
        BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial(valores);
        
        busquedaSecuencial.buscarValor(22);
        busquedaSecuencial.buscarValor(4);
        
    }
}
