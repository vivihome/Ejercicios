package com.ipartek.formacion.ejecicios;

import java.io.IOException;
import java.util.Scanner;

 	//DE ESTRUCTURA CONDICIONAL 
public class Ejercicio6 {

	public static void main(String[] args)throws IOException {

		Scanner sc = new Scanner(System.in);
		//1. Programa Java que lea un número entero por teclado y calcule si es par o impar.   
		 	
		System.out.print("Ingrese un numero: ");
		int num = sc.nextInt();
		
		// el % calcula el resto de la division entre dos numeros enteros, 
		//y si es igual a cero nos indica que es par, de lo contrario es impar
			if (num%2 == 0) {
		 		System.out.println("el numero es par");
		 	}else {
		 		System.out.println("el numero es impar");
		 	}
		 	
			 	
//		2. Programa que lea un número entero y muestre si el número es múltiplo de 10.
//		Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo por 10 el resto 
//		de esta división es cero.
		 	
		System.out.print("Ingrese un numero: ");
		 int n = sc.nextInt();
			 	
		 	if (n%10 == 0) {
		 		System.out.println("el numero es multiplo de 10");
		 	}else {
		 		System.out.println("el numero no es multiplo de 10");
		 	}
		 
		 //3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula
		 	
		 System.out.print("introduzaca una letra: ");
		 char l = (char) System.in.read();
		  
		 if (Character.isUpperCase(l)) {
			 System.out.println("Es una letra mayúscula");
		 }else {
			 System.out.println("No es una letra mayúscula");
		 }
			 
	        
	    sc.close();

	}

}
