/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author jose
 */
public class EjemploBinariosObjetos {

    private static final String PATH_CARPETA = "/home/jose/CUNOC/IPC1";

    private static final String PATH_RELATIVO_ARCHIVO = "punteos.obj";
    private static final String SUFIX_PATH_RELATIVO_ARCHIVO = "punteos.obj";

    public static void main(String[] args) {


        Punteo punteo = new Punteo("JUGADOR1", 1000, "JUGADOR2", 1075, LocalDate.now());
        Punteo punteo2 = new Punteo("JUGADOR1", 1000, "JUGADOR2", 1075, LocalDate.now());

        EjemploBinariosObjetos ejemploBinariosObjetos = new EjemploBinariosObjetos();

        ejemploBinariosObjetos.escribirObjeto(punteo);
        ejemploBinariosObjetos.escribirObjeto(punteo2);
        ejemploBinariosObjetos.leerObjeto();

    }

    public void escribirObjeto(Punteo punteo) {
        File fileBinario = new File(LocalDateTime.now() + "_" + SUFIX_PATH_RELATIVO_ARCHIVO);
        try (FileOutputStream fileOutput = new FileOutputStream(fileBinario);
                ObjectOutputStream objectStream = new ObjectOutputStream(fileOutput)) {
            objectStream.writeObject(punteo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerObjeto() {
        File fileBinario = new File(PATH_RELATIVO_ARCHIVO);

        try (FileInputStream fileInput = new FileInputStream(fileBinario);
                ObjectInputStream inputStream = new ObjectInputStream(fileInput)) {

            while (true) {
                Punteo punteo = (Punteo) inputStream.readObject();
                punteo.imprimirPunteo();
            }

        } catch (EOFException e) {
            System.out.println("ya se termino de leer el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
