/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.pilasycolas;

/**
 *
 * @author jose
 */
public class PilaObjeto {

    private Object[] contenedor;
    private int tamaño;
    private int tope;

    public PilaObjeto(int tamaño) {
        this.tamaño = tamaño;
        contenedor = new Accion[tamaño];
        tope = -1;
    }

    public void apilar(Object valor) throws PilaException {

        if (estaLlena()) {
            throw new PilaException("La pila ya esta llena cuando ingresaba el valor: " + valor);
        }

        tope++;
        contenedor[tope] = valor;
    }

    public Object desapilar() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila ya esta vacia. ");
        }

        Object valor = contenedor[tope];
        tope--;
        
        return valor;
    }

    public Object verTope() throws PilaException {
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
