/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.pilasycolas;

import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

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

            /*Accion ac1 = new Accion(5);
            PilaObjeto pilaObjetos = new PilaObjeto(5);
            pilaObjetos.apilar(ac1);
            pilaObjetos.apilar("cualquier otra cosa");

            Accion valorDesapilado = (Accion) pilaObjetos.desapilar();
            
            Accion valorDesapilado2 = (Accion) pilaObjetos.desapilar();

            System.out.println("Accion desapilada: " + valorDesapilado);
            System.out.println("Accion desapilada: " + valorDesapilado2);

            pilaObjetos.apilar("algo");*/
            
            PilaGenerica<String> pilaStrings = new PilaGenerica<>(5);
            pilaStrings.apilar("algo");
            String dato = pilaStrings.desapilar();
            
            pilaStrings.apilar(dato);
            
            PilaGenerica<JButton> pilaButtons = new PilaGenerica<>(5);
            
        } catch (PilaException e) {
            e.printStackTrace();
        }
        
        ClaseGenericaMultiple<JFrame, String, JButton> claseGenericaMultiple = new ClaseGenericaMultiple<>();
        ClaseGenericaMultiple<String, JButton, String> claseGenericaMultiple2 = new ClaseGenericaMultiple<>();
        
        claseGenericaMultiple.getClase1();
        claseGenericaMultiple2.getClase1();

    }

}
