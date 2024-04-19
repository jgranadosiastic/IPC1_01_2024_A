/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.listasdinamicas.enlazada;

/**
 *
 * @author jose
 */
public class ListaEnlazada {

    private Nodo inicio;
    private Nodo fin;
    private int tamaño = 0;

    public void agregarElemento(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (estaVacia()) {
            fin = nuevo;
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamaño++;
    }

    public void agregarElemento(int index, String valor) throws ListaException {
        if (index >= tamaño || estaVacia()) {
            throw new ListaException("Indice fuera de rango: " + index);
        }

        Nodo nuevo = new Nodo(valor);

        if (index == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else {

            Nodo anterior = obtenerNodo(index - 1);

            Nodo siguiente = anterior.getSiguiente();
            nuevo.setSiguiente(siguiente);

            anterior.setSiguiente(nuevo);
        }
        tamaño++;

    }

    public String obtenerValor(int index) throws ListaException {
        return obtenerNodo(index).getValor();
    }

    public Nodo obtenerNodo(int index) throws ListaException {
        if (index >= tamaño || estaVacia()) {
            throw new ListaException("Indice fuera de rango: " + index);
        }

        Nodo actual = inicio;
        for (int i = 0; i < index; i++) {
            Nodo siguiente = actual.getSiguiente();
            actual = siguiente;
        }
        return actual;
    }

    public String eliminarUltimo() throws ListaException {
        if (estaVacia()) {
            throw new ListaException("La lista esta vacia");
        }
        if (tamaño == 1) {
            String valorUltimo = inicio.getValor();
            inicio = null;
            fin = null;

            tamaño--;

            return valorUltimo;
        }

        Nodo penultimo = obtenerNodo(tamaño - 2);
        String valorUltimo = fin.getValor();

        penultimo.setSiguiente(null);
        fin = penultimo;

        tamaño--;

        return valorUltimo;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public int getTamaño() {
        return tamaño;
    }

}
