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
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class EjemploBinarios {

    private static final String PATH_CARPETA = "/home/jose/CUNOC/IPC1";

    private static final String PATH_RELATIVO_ARCHIVO = "punteos.dat";

    public static void main(String[] args) {
        String nombre1 = "j1";
        int punteo1 = 250;
        String nombre2 = "j2";
        int punteo2 = 175;
        LocalDate fecha = LocalDate.now();

        Punteo punteo = new Punteo("aaaj1", 100, "aaaj2", 505, LocalDate.now());

        EjemploBinarios ejemploBinarios = new EjemploBinarios();

        ejemploBinarios.escribirEnBinario(punteo);
        ejemploBinarios.leerDesdeBinario();

    }

    public void escribirEnBinario(Punteo punteo) {
        File fileBinario = new File(PATH_RELATIVO_ARCHIVO);
        try (FileOutputStream fileOutput = new FileOutputStream(fileBinario, true);
                DataOutputStream outputStream = new DataOutputStream(fileOutput)) {
            outputStream.writeUTF(punteo.getNombre1());
            outputStream.writeInt(punteo.getPunteo1());
            outputStream.writeUTF(punteo.getNombre2());
            outputStream.writeInt(punteo.getPunteo2());
            outputStream.writeUTF(punteo.getFecha().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerDesdeBinario() {
        File fileBinario = new File(PATH_RELATIVO_ARCHIVO);

        try (FileInputStream fileInput = new FileInputStream(fileBinario);
                DataInputStream inputStream = new DataInputStream(fileInput)) {

            while (true) {
                String nombre1 = inputStream.readUTF();
                int punteo1 = inputStream.readInt();
                String nombre2 = inputStream.readUTF();
                int punteo2 = inputStream.readInt();
                LocalDate fecha = LocalDate.parse(inputStream.readUTF());

                Punteo punteo = new Punteo(nombre1, punteo1, nombre2, punteo2, fecha);
                punteo.imprimirPunteo();
            }

        } catch (EOFException e) {
            System.out.println("ya se termino de leer el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
