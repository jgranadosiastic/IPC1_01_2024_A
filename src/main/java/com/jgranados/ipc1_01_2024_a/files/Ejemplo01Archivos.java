/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ejemplo01Archivos {

    private static final String PATH_CARPETA = "/home/jose/CUNOC/IPC1";
    
    private static final String PATH_RELATIVO_ARCHIVO = "texto.txt";
    private static final String PATH_ABSOLUTO_ARCHIVO = "/home/jose/CUNOC/IPC1/01 2024/texto.txt";
    
    // aqui pueden cambiar de asignacion y probar con el path absoluto y relativo
    private static final String PATH_ARCHIVO = PATH_RELATIVO_ARCHIVO;
    

    public void conectarConCarpeta() {
        File carpeta = new File(PATH_CARPETA);
        System.out.println("Existe? " + carpeta.exists());
        System.out.println("Es carpeta? " + carpeta.isDirectory());
        System.out.println("Se puede modificar? " + carpeta.canWrite());
        System.out.println("Oculto? " + carpeta.isHidden());
        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("archivos ocultos dentro de carpeta: ");
            for (String fileName : carpeta.list()) {
                File archivoEnCarpeta = new File(PATH_CARPETA + File.separator + fileName);
                if (archivoEnCarpeta.isHidden()) {
                    System.out.println(fileName);
                }
            }
        }
    }
    
    public void escribirEnArchivoDeTexto(String contenido) {
        File archivoTexto = new File(PATH_ARCHIVO);
        /*FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(archivoTexto);
            fileOutputStream.write(contenido.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            // Manejar el error.
            System.out.println("El archivo no existe");
            e.printStackTrace();
        } catch (IOException e) {
            // Manejar el error cuando hay un ioexceeption
            System.out.println("El archivo no puede ser escrito");
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    // mala suerte.
                }
                
            }
        }
        
        try(FileWriter fileWriter = new FileWriter(archivoTexto, true);) {
            fileWriter.append("FileWriter" + contenido + "FileWriter");
        } catch (IOException e) {
            // manejar error
            e.printStackTrace();
        }
        */
        try(FileWriter fileWriter = new FileWriter(archivoTexto, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.newLine();
            bufferedWriter.append(contenido);
            //bufferedWriter.append(contenido);
        } catch (IOException e) {
            // manejar error
            e.printStackTrace();
        }   
    }
    
    public void leerDesdeArchivoTexto() {
        File archivoTexto = new File(PATH_ARCHIVO);
        try (FileInputStream fileInputStream = new FileInputStream(archivoTexto);) {
            int byteEnArchivo = fileInputStream.read();
            while (byteEnArchivo != -1) {
                char caracter = (char) byteEnArchivo;
                System.out.println(caracter);
                byteEnArchivo = fileInputStream.read();
            }
        } catch (IOException e) {
            // manejar error
            e.printStackTrace();
        }
        
        try (FileReader fileReader = new FileReader(archivoTexto);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String linea = bufferedReader.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
        } catch (IOException e) {
        }
        
        try (Scanner scannerFile = new Scanner(archivoTexto)) {
            while (true) {
                String linea = scannerFile.nextLine();
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchElementException ex) {
            System.out.println("no hay mas lineas por leer");
        }
    }
}
