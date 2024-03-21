/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.swing.basicoamano;

import com.jgranados.ipc1_01_2024_a.files.Ejemplo01Archivos;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author jose
 */
public class FrameBasicoAMano {
    
    private Ejemplo01Archivos ejemplo01Archivos = new Ejemplo01Archivos();
    
    public void crearFrameBasico() {
        JFrame primerFrame = new JFrame("Mi Primer frame");
        primerFrame.setSize(250, 250);
        primerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        primerFrame.getContentPane()
                .setLayout(new FlowLayout());
        
        JLabel etiqueta1 = new JLabel("INgrese texto:");
        etiqueta1.setSize(100, 40);
        primerFrame.add(etiqueta1);
        
        JTextField texto1 = new JTextField();
        texto1.setSize(100, 40);
        texto1.setPreferredSize(new Dimension(100, 40));
        
        JButton botonGrabar = new JButton("Grabar");
        botonGrabar.setSize(75, 40);
        
        primerFrame.add(texto1);
        
        botonGrabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejemplo01Archivos.escribirEnArchivoDeTexto(texto1.getText());
            }
        });
        
        primerFrame.add(botonGrabar);
        
        primerFrame.setVisible(true);
    }
}
