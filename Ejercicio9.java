package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Programa java que lea un carácter por 
		//teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un caracter: ");
		char c = sc.next().charAt(0);
		
		if (Character.isDigit(c)) {
			System.out.println("Es un digito");			
		}else {
			System.out.println("No es un digito");
		}
		System.out.println();
		
		//Programa que lea dos números por teclado y muestre el resultado de la división del 
		//primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.
		
		System.out.print("Ingrese el dividendo: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Ingrese el divisor: ");
		double n2 = sc.nextDouble();
		
		double r = n1 / n2;
		
		if (n2 ==0) {
			System.out.println("No se puede dividir por cero");			
		}else {
				System.out.println("el resultado es: " + r);
		}
		System.out.println();
		
		//Programa java para comprobar si un año es bisiesto.
		//El programa pide que se introduzca el valor de un año por teclado y calcula 
		//si es un año bisiesto o no lo es.
		//Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.
		
		System.out.print("ingrese el año: ");
		int año = sc.nextInt();
		
		if (año%4 ==0 && año%100 !=0 || año%400==0) {
			System.out.println("El año es bisiesto");
		}else {
		System.out.println("El año no es bisiesto");	
		}
		
		//Programa java para comprobar si un número entero de tres cifras es capicúa.
		
		System.out.print("Ingrese un nomero de 3 sifras: ");
		int n = sc.nextInt();
		
		if (n>= 100 && n <= 999) {
			if (n%10 == n/100) {
				System.out.println("EL numero es capicúa");
			}else {
				System.out.println("EL numero no es capicúa");
			}
		}else {
			System.out.println("EL numero no es de tres digitos");
		}
		sc.close();
	}
}
