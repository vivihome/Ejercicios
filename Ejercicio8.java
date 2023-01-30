package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Programa Java Número múltiplo de tres y de cinco
		
		System.out.print("ingrese un numero: ");
		int n = sc.nextInt();
		
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("el numero es multiplo de 3 y 5");
		}else {
			System.out.println("el numero no es multiplo de 3 y 5");
		}
		
		//Multiplo de 2 y 3
        System.out.print("Introduzca un número entero: ");
        int X = sc.nextInt();

        if (X % 2 == 0 || X % 3 == 0) {
            System.out.println("Es múltiplo de 2 o de 3");
        } else {
            System.out.println("No es múltiplo de 2 o de 3");                                                     
        }
                // Programa java que lea dos caracteres 
        //por teclado y compruebe si los dos son letras minúsculas
        
        System.out.print("Ingrese el primer caracteres: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Ingrese el segundo caracteres: ");
        char c2 = sc.next().charAt(0);
        
        if (Character.isLowerCase(c1)) {
        	if(Character.isLowerCase(c2)) {
        		System.out.println("Ambos son letras minusculas");
        	}else {
        		System.out.println("El primero es minuscula y el segundo no");
        	}
        }else if(Character.isLowerCase(c2)) {
        		System.out.println("El segundo es minuscula");
       }else {
    	   System.out.println("ninguno es una letra minuscula");
       }
        
        sc.close();
	}
}
