/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.poo.carreras.vehiculos.stickers;

import java.util.Random;

/**
 *
 * @author jose
 */
public class StickerFosforesente extends Sticker {
    
    private static final int LIMITE_PREMIO = 15;

    @Override
    public int calcularPremioExtra() {
        Random random = new Random();
        int valor = random.nextInt(LIMITE_PREMIO + 1);
        
        return valor * 2;
    }
    
}
