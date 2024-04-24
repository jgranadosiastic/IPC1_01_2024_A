/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.listasdinamicas.enlazada;

import javax.swing.JButton;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarElemento("val1");
        lista.agregarElemento("val2");
        lista.agregarElemento("val3");
        lista.agregarElemento("val4");
        
        System.out.println("Tamaño: " + lista.getTamaño());
        try {
            System.out.println("Elemento eliminado: " + lista.eliminarUltimo());
            System.out.println("Tamaño: " + lista.getTamaño());
            System.out.println("Elemento eliminado: " + lista.eliminarUltimo());
            System.out.println("Tamaño: " + lista.getTamaño());
            System.out.println("Elemento eliminado: " + lista.eliminarUltimo());
            System.out.println("Tamaño: " + lista.getTamaño());
            System.out.println("Elemento eliminado: " + lista.eliminarUltimo());
            System.out.println("Tamaño: " + lista.getTamaño());
            System.out.println("Elemento eliminado: " + lista.eliminarUltimo());
            System.out.println("Tamaño: " + lista.getTamaño());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ListaEnlazadaGenerica<String> listaEnlazadaStrings = new ListaEnlazadaGenerica<>();
        listaEnlazadaStrings.agregarElemento("valor");
        
        ListaEnlazadaGenerica<JButton> listaEnlazadaB = new ListaEnlazadaGenerica<>();
        listaEnlazadaB.agregarElemento(new JButton());
    }
}
