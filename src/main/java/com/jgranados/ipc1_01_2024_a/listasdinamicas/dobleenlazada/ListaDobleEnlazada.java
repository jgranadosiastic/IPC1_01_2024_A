/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.listasdinamicas.dobleenlazada;

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
}
