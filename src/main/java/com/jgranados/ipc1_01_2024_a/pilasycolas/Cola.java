/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.pilasycolas;

/**
 *
 * @author jose
 */
public class Cola {

    private String[] contenido;
    private int tamaño;
    private int fin;

    public Cola(int tamaño) {
        this.tamaño = tamaño;
        contenido = new String[tamaño];
        fin = -1;
    }

    public void ingresar(String valor) throws ColaException {
        if (estaLlena()) {
            throw new ColaException("La cola ya esta llena.");
        }
        
        fin++;
        contenido[fin] = valor;
    }
    
    public String retirar() throws ColaException {
        if (estaVacia()) {
            throw new ColaException("La cola esta vacia.");
        }
        
        String elementoAlFrente = contenido[0];
        for (int i = 1; i <= fin; i++) {
            String valorAMover = contenido[i];
            contenido[i - 1] = valorAMover;
        }
        
        fin--;
        
        return elementoAlFrente;
    }

    public boolean estaLlena() {
        return fin == tamaño - 1;
    }

    public boolean estaVacia() {
        return fin == -1;
    }

}
