/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.busquedasyordenamiento.ordenamientoinsercion.frontend;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author jose
 */
public class Etiqueta extends JLabel {
    private int valor;
    
    public Etiqueta(int valor) {
        this.valor = valor;
        setText(valor + "");
        setSize(150, 150);
        setPreferredSize(new Dimension(150, 150));
        setFont(new Font(Font.SERIF, Font.ITALIC, 25));
        
        setBorder(new EtchedBorder(EtchedBorder.RAISED));
    }

    public int getValor() {
        return valor;
    }
    
    
}
