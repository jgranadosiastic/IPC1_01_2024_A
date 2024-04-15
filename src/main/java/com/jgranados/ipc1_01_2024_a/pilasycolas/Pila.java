/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.pilasycolas;

/**
 *
 * @author jose
 */
public class Pila {

    private String[] contenedor;
    private int tamaño;
    private int tope;

    public Pila(int tamaño) {
        this.tamaño = tamaño;
        contenedor = new String[tamaño];
        tope = -1;
    }

    public void apilar(String valor) throws PilaException {

        if (estaLlena()) {
            throw new PilaException("La pila ya esta llena cuando ingresaba el valor: " + valor);
        }

        tope++;
        contenedor[tope] = valor;
    }

    public String desapilar() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila ya esta vacia. ");
        }

        String valor = contenedor[tope];
        tope--;
        
        return valor;
    }

    public String verTope() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila ya esta vacia. ");
        }
        
        return contenedor[tope];
    }

    public boolean estaLlena() {
        return tope == tamaño - 1;
    }

    public boolean estaVacia() {
        return tope == -1;
    }
}
