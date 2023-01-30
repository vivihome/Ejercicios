package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
//		El programa pide que se introduzca un número por teclado y determina si el número es positivo o negativo. 
//		Si el número introducido es igual a cero se mostrará un mensaje indicándolo. 
		
		System.out.print("Ingrese un numeor Positivo o Negativo: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("El numero es positivo");
		}else if(num < 0) {
			System.out.println("El numero es negativo");
		}else if(num == 0) {
			System.out.println("EL numero es cero");
		}
		System.out.println();
		
		 
		 //Comprobar si dos números enteros son iguales o son distintos
		 //Programa que lea dos números por teclado y muestre si son o no iguales
		//Programa Java para calcular el mayor de dos números
		
		System.out.print("ingrese el primer numero: ");
		int n1 = sc.nextInt();
		 
		System.out.print("ingrese el segundo numero: ");
		int n2 = sc.nextInt();
		
		if (n1 == n2) {
			System.out.println("los numeros son iguales " + n1+", "+n2);
		}else {
			System.out.println("los numeros son diferentes "+ n1+", "+n2);
		}
		
		if (n1 > n2) {
			System.out.println(n1 +" es mayor");
		}else if (n2 > n1) {
			System.out.println(n2 +" es mayor");
		}else {
			System.out.println("son iguales");
		}
		
		//Comprobar si dos números terminan con la misma cifra
		//Programa Java que lea dos números enteros y comprueben si los dos acaban con la misma cifra
		
		System.out.print("ingrese el primer numero: ");
		int num1 = sc.nextInt();
		System.out.print("ingrese el segundo numero: ");
		int num2 = sc.nextInt();
		
		int nm1 = num1%10;
		int nm2 = num2%10;
		
		if(nm1==nm2) {
			System.out.println("las cifras finales son iguales "+nm1+", "+nm2);
		}else {
			System.out.println("las cifras finales no son iguales "+nm1+" = "+nm2);
		}
		
		sc.close();
	}
}
