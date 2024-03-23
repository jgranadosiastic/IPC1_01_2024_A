/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.threads;

/**
 *
 * @author jose
 */
public class CajeroThread extends Thread {
    
    private int[] productos;
    private String nombre;

    public CajeroThread(int[] productos, String nombre) {
        this.productos = productos;
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        procesarProductos();
        System.out.println(nombre + ": Ya finalizo.");
    }
    
    private void procesarProductos() {
        try {
            for (int i = 0; i < productos.length; i++) {
            int producto = productos[i];
            System.out.println(nombre + ": Procesando producto en posicion: " + i);
            Thread.sleep(producto * 1000);
            System.out.println(nombre + ": Procesado producto en posicion: " + i);
        }
        } catch (InterruptedException e) {
            // manejar correctamente el error
            e.printStackTrace();
        }
        
    }
}
