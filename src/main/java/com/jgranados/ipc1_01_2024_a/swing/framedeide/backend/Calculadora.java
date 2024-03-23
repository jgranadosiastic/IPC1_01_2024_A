/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.swing.framedeide.backend;

import com.jgranados.ipc1_01_2024_a.swing.framedeide.excepciones.CalculadoraException;

/**
 *
 * @author jose
 */
public class Calculadora {

    /**
     * Suma dos numeros en formato string.
     * 
     * @param numero1
     * @param numero2
     * @return la suma de los dos numero
     * @throws CalculadoraException si alguno de los parametros no es un numero valido
     */
    public double sumar(String numero1, String numero2) throws CalculadoraException {
        double valor1;
        double valor2;
        try {
            valor1 = Double.valueOf(numero1);
        } catch (NumberFormatException e) {
            throw new CalculadoraException(
                    String.format("El valor '%s' del campo de texto 'Numero 1' no es un numero valido.", numero1)
            );
        }
        
        try {
            valor2 = Double.valueOf(numero2);
        } catch (NumberFormatException e) {
            throw new CalculadoraException(
                    String.format("El valor '%s' del campo de texto 'Numero 2' no es un numero valido.", numero2)
            );
        }
        
        return valor1 + valor2;
    }

    public double restar(String numero1, String numero2) throws CalculadoraException {
        double valor1;
        double valor2;
        try {
            valor1 = Double.valueOf(numero1);
        } catch (NumberFormatException e) {
            throw new CalculadoraException(
                    String.format("El valor '%s' del campo de texto 'Numero 1' no es un numero valido.", numero1)
            );
        }
        
        try {
            valor2 = Double.valueOf(numero2);
        } catch (NumberFormatException e) {
            throw new CalculadoraException(
                    String.format("El valor '%s' del campo de texto 'Numero 2' no es un numero valido.", numero2)
            );
        }
        
        return valor1 - valor2;
    }
}
