package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

//RELACIÓN Nº 1: EJERCICIOS 1, 2 Y 3
//
//Empezaremos por unos ejercicios básicos de programas Java con estructura secuencial, es decir, 
//en estos programas no hay instrucciones condicionales ni repetitivas. 
//En la mayoría de ellos las operaciones a realizar son: lectura de datos por teclado, 
//realizar alguna operación con esos datos y mostrar resultados por pantalla.
//
//EJERCICIOS BÁSICOS RESUELTOS CON ESTRUCTURA SECUENCIAL

public class Ejercicio1 {
	public static void main(String[] args) {
		
		// 1.recibe dos numeros y los imprime 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer numero: ");
		String num1 = sc.nextLine();
		
		System.out.print("Escribe el segundo numero: ");
		String num2 = sc.nextLine();
		
		System.out.println("El primer numero es "+num1 + ", el segundo numero es " + num2);
		System.out.println();
		
		
		//2.recibe un numero entero y imprime el doble y el triple del mismo
		
		System.out.print("Escribe un numero entero: ");
		int num = sc.nextInt();
		
		System.out.println("El numero es "+num);
		System.out.println("El doble numero "+num *2);
		System.out.println("El triple del numero "+num*3);
		
		//3.Recibir el nombre y imprimirlo en pantalla
		
		System.out.print("dime tu nombre: ");
		String nom = sc.nextLine();
		
		System.out.println("hola "+nom);
		
		sc.close();
	}
}
