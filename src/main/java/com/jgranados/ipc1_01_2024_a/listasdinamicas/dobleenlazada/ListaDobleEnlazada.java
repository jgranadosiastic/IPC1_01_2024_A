/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.listasdinamicas.dobleenlazada;

import com.jgranados.ipc1_01_2024_a.listasdinamicas.enlazada.ListaException;
import com.jgranados.ipc1_01_2024_a.listasdinamicas.enlazada.Nodo;

/**
 *
 * @author jose
 */
public class ListaDobleEnlazada {
    private NodoDoble inicio;
    private NodoDoble fin;
    private int tamaño = 0;
    
    
    public void agregarElemento(String valor) {
        NodoDoble nuevo = new NodoDoble(valor);

        if (estaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            
            fin = nuevo;
        }
        tamaño++;
    }
    
    public boolean estaVacia() {
        return tamaño == 0;
    }
    
    public void eliminarUltimo() throws ListaException {
        if (estaVacia()) {
            throw new ListaException("La lista esta vacia");
        }
        
        if (tamaño == 1) {
            inicio = null;
            fin = null;
        } else {
            NodoDoble penultimo = fin.getAnterior();
            penultimo.setSiguiente(null);
            fin.setAnterior(null);
            fin = penultimo;
        }
        
        tamaño--;
    }

    public String obtenerContenido(int index) throws ListaException {
        return obtenerNodo(index).getValor();
    }
    
    private NodoDoble obtenerNodo(int index) throws ListaException {
        if (estaVacia()) {
            throw new ListaException("La lista esta vacia.");
        }
        if (index >= tamaño || estaVacia()) {
            throw new ListaException("El indice esta fuera del tama;o de la lista.");
        }
        
        int medio = tamaño / 2;
        if (index < medio) {
            return obtenerNodoAvanzando(index);
        } else {
            return  obtenerNodoRetrocediendo(index);
        }
        
    }
    
    private NodoDoble obtenerNodoAvanzando(int index) {
        NodoDoble actual = inicio;
        for (int i = 0; i < index; i++) {

            actual = actual.getSiguiente();
        }

        return actual;
    }
    
    private NodoDoble obtenerNodoRetrocediendo(int index) {
        int indiceFinal = tamaño - 1;
        int limite = indiceFinal - index;
        NodoDoble actual = fin;
        for (int i = 0; i < limite; i++) {
            actual = actual.getAnterior();
        }

        return actual;
    }
}
