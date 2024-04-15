/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.pilasycolas;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila(6);

        try {

            pila.apilar("x");
            pila.apilar("y");
            pila.apilar("z");
            pila.apilar("a");
            pila.apilar("b");
            pila.apilar("c");
            pila.apilar("d");
        } catch (PilaException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Viendo tope: " + pila.verTope());
                System.out.println("desapilando: " + pila.desapilar());

            } catch (PilaException e) {
                System.out.println(e.getMessage());
            }
        }

        try {

            Accion ac1 = new Accion();
            PilaObjeto pilaObjetos = new PilaObjeto(5);
            pilaObjetos.apilar(ac1);
            
            
            
            
            
            pilaObjetos.apilar("algo");
        } catch (Exception e) {
        }

    }

}
