package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//14. Programa que calcule el precio de venta de un producto conociendo el precio 
		//por unidad (sin IVA) del producto, el número de productos vendidos 
		//y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
		
		System.out.print("Ingrese el valor del producto por Und y sin IVA: ");
		double und = sc.nextDouble();
		
		System.out.print("Ingrese la cantidad de productos: ");
		double cant = sc.nextDouble();
		
		System.out.print("Ingrese el valor del IVA: ");
		double iva = sc.nextDouble();
		
		double valB = (und * cant);
		double valC = (valB*iva/100)+valB;
		
		System.out.println("El valor a pagar es: "+valC);
		
		 //15.  Programa que lea dos variables enteras N y m , donde m robara de N las ultimas cifras.
		 // Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234
		
		System.out.print("Ingese un numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Ingese un numero: ");
		int num2 = sc.nextInt();
		
		num1= num1/ (int) Math.pow(10, num2);//Math.pow devuelve un número de tipo double
        					 				 //es necesario convertirlo a int para hacer la división entre enteros  
		System.out.println(num1);
		
		//16. Programa que lee una temperatura en grados centígrados 
		//y nos calcula y muestra por pantalla su valor equivalente en grados Reamur y Kelvin.
		//la formila es ºC/100 = ºR/80 = ºK-273/100
		
		
		 System.out.print("Ingrese la temperatura en ºC: ");
		 double gC = sc.nextDouble();
		 
		 double gR = 80*gC/100;
		 double gK =gC+273;
		 
		 System.out.println("la convercion en ºR es: "+ gR + " y en ºK es : "+gK);
		
		sc.close();
	}

}
