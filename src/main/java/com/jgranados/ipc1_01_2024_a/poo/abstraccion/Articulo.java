/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.abstraccion;

/**
 *
 * @author jose
 */
public class Articulo {
    double costoBase;
    
    double calcularPrecioDetalle() {
        double incremento;
        incremento = costoBase * 0.3;
        return incremento + costoBase;
    }
    
    double calcularPrecioAlMayor() {
        double incremento;
        incremento = costoBase * 0.15;
        return incremento + costoBase;
    }
}
