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
public class CalculadoraSimpleStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int total = 0;
        String operacion;

        System.out.println("Ingrese un numero a operar");
        numero1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese un numero a operar");
        numero2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese la operacion:");
        System.out.println("Sumar");
        System.out.println("Restar");
        System.out.println("Multiplicar");
        System.out.println("Dividir");
        operacion = scanner.nextLine();

        for (int i = 0; i < operacion.length(); i++) {
            System.out.println("Caracter: ");
            System.out.println(operacion.charAt(i));
            
        }
        
        if (operacion.equalsIgnoreCase("Sumar")) {
            total = suma(numero1, numero2);
        } else if (operacion.equalsIgnoreCase("Restar")) {

        } else if (operacion.equalsIgnoreCase("Multiplicar")) {

        } else if (operacion.equalsIgnoreCase("Dividir")) {

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
