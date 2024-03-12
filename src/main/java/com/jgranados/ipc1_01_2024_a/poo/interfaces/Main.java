/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.interfaces;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Camion camion = new Camion();
        Avion avion = new Avion();
        
        Bocinar[] vehiculosQueBocinan = new Bocinar[2];
        
        Main main = new Main();
        main.moverVehiculo(carro);
        main.moverVehiculo(camion);
        main.moverVehiculo(avion);
        
        main.tocarBocina(carro);
        main.tocarBocina(camion);
        
        main.volar(avion);
        main.volar(carro);
        //main.volar(camion);
    }
    
    public void moverVehiculo(Vehiculo vehiculo)  {
        vehiculo.avanzar();
    }
    
    public void tocarBocina(Bocinar vehiculoQueBocina) {
        vehiculoQueBocina.bocinar();
    }
    
    /*public void volar(Vehiculo vehiculoQueVuela) {
        Volar vehiculoVolador = (Volar) vehiculoQueVuela;
        vehiculoVolador.despegar();
        vehiculoQueVuela.avanzar();
    }*/
    
    public void volar(Volar vehiculoQueVuela) {
        Vehiculo vehiculo = (Vehiculo) vehiculoQueVuela;
        vehiculoQueVuela.despegar();
        vehiculo.avanzar();
    }
    /*
    public void volar(Vehiculo vehiculoQueVuela) {
        if (vehiculoQueVuela instanceof Volar) {
            Volar vehiculoVolador = (Volar) vehiculoQueVuela;
            vehiculoVolador.despegar();
        }
        vehiculoQueVuela.avanzar();
    }*/
}
