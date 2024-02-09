/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a.recursividad;

/**
 *
 * @author jose
 */
public class Recursividad {
    
    public static void main(String[] args) {
        //saludar(1);
        //int fact = factorialCiclo(5);
        
        int fact = factorialRecursivo(5);
        System.out.println("factorial: " + fact);
    }
    
    static void saludar(int contador) {
        System.out.println("Hola Mundo!!");
        
        if (contador < 5) {
            saludar(contador + 1);
        }
    }
    
    static int factorialCiclo(int numero) {
        int fact = 1;
        for (int i = numero; i > 1; i--) {
            fact = fact * i;
        }
        
        return fact;
    }
    
    static int factorialRecursivo(int numero) {
        
        if (numero < 0) {
            System.out.println("No definido");
            return 1;
        }
        
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        return numero * factorialRecursivo(numero - 1);
        
    }
    
    
    // Hacer un programa que utilice un subprograma recursivo
    // que solicite al usuario un numero limite .
    // El programa debe imprimir cada numero de la serie de 
    // fibonacci menor al numero limite.
    // ejemplo:
    // numero limite = 20
    // resultado
    // 0
    // 1
    // 1
    // 2
    // 3
    // 5
    // 8
    // 13
    // 21
    
    
    
    
    
    
    
}
