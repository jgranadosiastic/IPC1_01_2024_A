/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.threads.threadsyswing.backend;

import com.jgranados.ipc1_01_2024_a.threads.threadsyswing.frontend.CajeroPanel;

/**
 *
 * @author jose
 */
public class CajeroThread extends Thread {

    private int[] productos;
    private String nombre;
    private CajeroPanel frontEnd;

    public CajeroThread(int[] productos, String nombre) {
        this.productos = productos;
        this.nombre = nombre;
        frontEnd = new CajeroPanel();
    }

    @Override
    public void run() {
        procesarProductos();
    }

    private void procesarProductos() {
        try {
            for (int i = 0; i < productos.length; i++) {
                int producto = productos[i];
                frontEnd.especificarLblProducto(producto + "");
                Thread.sleep(producto * 1000);
            }
        } catch (InterruptedException e) {
            // manejar correctamente el error
            e.printStackTrace();
        }

    }
}
