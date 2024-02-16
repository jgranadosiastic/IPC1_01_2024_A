/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.abstraccion.articulos;

/**
 * modificadores de visibilidad o de acceso
 * public: acceso o visible desde cualquier parte del exterior
 * private: acceso o visibile solo desde la misma clase
 * protected: acceso o visible desde la misma, clases hijas o 
 * desde clases en el mismo paquete
 * default: acceso o visible desde la misma y desde clases en el mismo paquete
 * 
 * @author jose
 */
public class Articulo {
    
    public static final double INCREMENTO_PRECIO_DETALLE = 0.3;
    public static final double INCREMENTO_PRECIO_MAYOR = 0.15;
    
    private double costoBase;
    
    /*public Articulo(double elCostoBase) {
        costoBase = elCostoBase;
    }*/
    
    public void cambiarCostoBase(double nuevoCostoBase) {
        double quitandoIva = nuevoCostoBase * 0.12;
        costoBase = nuevoCostoBase - quitandoIva;
    }
    
    public double obtenerCostoBase() {
        return costoBase;
    }
    
    public double calcularPrecioDetalle() {
        double incremento;
        incremento = costoBase * INCREMENTO_PRECIO_DETALLE;
        return incremento + costoBase;
    }
    
    public double calcularPrecioAlMayor() {
        double incremento;
        incremento = costoBase * INCREMENTO_PRECIO_MAYOR;
        return incremento + costoBase;
    }
}
