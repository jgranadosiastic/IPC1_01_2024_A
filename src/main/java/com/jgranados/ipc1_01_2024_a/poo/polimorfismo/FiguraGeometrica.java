/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.polimorfismo;

/**
 *
 * @author jose
 */
public abstract class FiguraGeometrica {
    
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
    public abstract void pedirDatos();
}
