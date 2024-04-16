/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.pilasycolas;

/**
 *
 * @author jose
 */
public class PilaGenerica<T> {

    private T[] contenedor;
    private int tamaño;
    private int tope;

    public PilaGenerica(int tamaño) {
        this.tamaño = tamaño;
        contenedor = (T[]) new Object[tamaño];
        tope = -1;
    }

    public void apilar(T valor) throws PilaException {

        if (estaLlena()) {
            throw new PilaException("La pila ya esta llena cuando ingresaba el valor: " + valor);
        }

        tope++;
        contenedor[tope] = valor;
    }

    public T desapilar() throws PilaException {
        if (estaVacia()) {
            throw new PilaException("La pila ya esta vacia. ");
        }

        T valor = contenedor[tope];
        tope--;
        
        return valor;
    }

    public T verTope() throws PilaException {
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
