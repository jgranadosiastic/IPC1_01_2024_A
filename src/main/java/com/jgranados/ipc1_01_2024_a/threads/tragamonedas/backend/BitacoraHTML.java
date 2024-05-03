/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.threads.tragamonedas.backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jose
 */
public class BitacoraHTML {
    
    private File fileSelected;

    public BitacoraHTML(File fileSelected) {
        this.fileSelected = fileSelected;
    }
    
    
    public void registrarApuesta(int cantidadMonedas) {
        String data = obtenerDataActual();
        data = data + String.format("\n<p>Se hizo apuesta de %d monedas</p>", cantidadMonedas);
        escribirEnArchivo(data);
    }
    
    public void registrarGanancia(int cantidadMonedasGanadas) {
        String data = obtenerDataActual();
        data = data + String.format("\n<p>Se ganaron %d monedas</p>", cantidadMonedasGanadas);
        escribirEnArchivo(data);
    }
    
    public void registrarPerdida(int cantidadMonedas) {
        String data = obtenerDataActual();
        data = data + String.format("\n<p>Se perdieron %d monedas</p>", cantidadMonedas);
        escribirEnArchivo(data);
    }
    
    private String obtenerDataActual() {
        if (!fileSelected.exists()) {
            return """
                   <html>
                   <head>
                   	<title>bitacora</title>
                   </head>
                   <body>
                   """;
        }
        
        return leerArchivo();
    }
    
    private String leerArchivo() {
        String contenido = "";
        try (FileReader fileReader = new FileReader(fileSelected);
                BufferedReader reader = new BufferedReader(fileReader)) {
            String linea = reader.readLine();
            while (linea != null) {
                contenido = contenido + linea + "\n";
                linea = reader.readLine();
            }
            
            contenido = contenido.substring(0, contenido.lastIndexOf("\n"));
            contenido = contenido.substring(0, contenido.lastIndexOf("\n"));
            return contenido.substring(0, contenido.lastIndexOf("\n"));
            
        }  catch (IOException e) {
            e.printStackTrace();
        }
        
        return "";
    }
    
    private void escribirEnArchivo(String contenido) {
        try (FileWriter fileWriter = new FileWriter(fileSelected);
                BufferedWriter writer = new BufferedWriter(fileWriter);) {
            writer.append(contenido);
            writer.append("\n</body>");
            writer.append("\n</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
