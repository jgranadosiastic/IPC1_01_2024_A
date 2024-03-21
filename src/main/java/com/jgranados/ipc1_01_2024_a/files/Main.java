/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.files;

/**
 *
 * @author jose
 */
public class Main {
    
    public static void main(String[] args) {
        Ejemplo01Archivos ejemplo01Archivos = new Ejemplo01Archivos();
        ejemplo01Archivos.conectarConCarpeta();
        ejemplo01Archivos.escribirEnArchivoDeTexto("Hola Mundo!!!\nOtro Hola");
        
        ejemplo01Archivos.leerDesdeArchivoTexto();
    }
}
