/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.ipc1_01_2024_a;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class CalculadoraSimple {

    public static void main(String[] args) {
        
        for (String arg : args) {
            System.out.println("Parametro: " + arg);
        }
        
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int total = 0;
        int operacion;

        System.out.println("Ingrese un numero a operar");
        numero1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese un numero a operar");
        numero2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese la operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        operacion = Integer.valueOf(scanner.nextLine());

        if (operacion == 1) {
            total = suma(numero1, numero2);
        } else if (operacion == 2) {

        } else if (operacion == 3) {

        } else if (operacion == 4) {

        } else {
            System.out.println("Operacion incorrecta");
        }
        // comentario de una linea
        
        /*switch (operacion) {
            case 1:
                
                break;
            case 2:
                break;
            default:
                System.out.println("Operacion incorrecta");
        }*/
        System.out.println("El resultado de la operacion es");
        System.out.println(total);

    }
    
    /**
     * Este subprograma realiza la soma de dos numeros enviados como parametros.
     * 
     * @param unNumero  el primer numero de la operacion
     * @param otroNumero    xxxxxx
     * @return el resultado de la suma
     */
    static int suma(int unNumero, int otroNumero) {
        int total;
	
        total = unNumero + otroNumero;

	return total;
    }


}
