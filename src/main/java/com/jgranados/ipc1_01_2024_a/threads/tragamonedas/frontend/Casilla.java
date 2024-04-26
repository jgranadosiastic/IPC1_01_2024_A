/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.threads.tragamonedas.frontend;

import com.jgranados.ipc1_01_2024_a.threads.tragamonedas.backend.Tragamonedas;
import java.awt.Dimension;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public class Casilla extends JLabel implements Runnable {

    private String imagenMostrada;
    private Tragamonedas tragamonedas;

    public static final String IMAGEN_1 = "com/jgranados/ipc1_01_2024_a/threads/tragamonedas/frontend/bell.png";
    public static final String IMAGEN_2 = "com/jgranados/ipc1_01_2024_a/threads/tragamonedas/frontend/apple.png";
    public static final String IMAGEN_3 = "com/jgranados/ipc1_01_2024_a/threads/tragamonedas/frontend/cherry.png";
    private static final String[] IMAGENES = new String[]{IMAGEN_1, IMAGEN_2, IMAGEN_3};
    
    private boolean yaTermine;

    public Casilla(Tragamonedas tragamonedas) {
        this.tragamonedas = tragamonedas;
        setSize(100, 100);
        setPreferredSize(new Dimension(100, 100));
        setBorder(BorderFactory.createEtchedBorder());
    }

    @Override
    public void run() {
        Random random = new Random();
        int vueltas = random.nextInt(10, 20);
        long espera = random.nextLong(300, 800);
        int contImagenes = 0;
        for (int i = 0; i < vueltas; i++) {
            System.out.println("cambiando imagen");
            try {
                if (contImagenes == 3) {
                    contImagenes = 0;
                }
                imagenMostrada = IMAGENES[contImagenes];
                setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagenMostrada)));
                contImagenes++;
                Thread.sleep(espera);
            } catch (InterruptedException ex) {
                Logger.getLogger(Casilla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        yaTermine = true;
        tragamonedas.verificarRondaTerminada();
    }

    public String getImagenMostrada() {
        return imagenMostrada;
    }

    public boolean yaTermine() {
        return yaTermine;
    }
    
    
}
