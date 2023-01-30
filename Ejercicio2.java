package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

//Relación Nº 2: Ejercicios 4, 5, 6 y 7

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
		//La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		//F = 32 + ( 9 * C / 5)
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("ingrese los grados centrigrados: ");
		double gradosC = sc.nextDouble();
		
		double gradosF = 32+(9*gradosC/5);
		
		System.out.println("Los grados fahrenheit son: "+gradosF);
		System.out.println();
		
		//5. Programa que lee por teclado el valor del radio de una circunferencia y calcula 
		//y muestra por pantalla la longitud y el área de la circunferencia. 
		//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		
		System.out.print("Ingressa el valor del radio: ");
		double radio = sc.nextDouble();
		
		double longi = 2 * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("la gongitud es "+ longi + " y el area es " + area);
		System.out.println();
		
		//6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		
		System.out.print("ingresa la velocidad en Km/h: ");
		double vel = sc.nextDouble();
		
		double metros = vel*1000/3600;
		
		System.out.println("la velocidad en metros son: "+metros+" m/s");
		System.out.println();
		
		//7.  Programa lea la longitud de los catetos de un triángulo rectángulo 
		//y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		
		System.out.print("ingrese la longitud del cateto A: ");
		double cA = sc.nextDouble();
		
		System.out.print("ingrese la longitud del cateto B: ");
		double cB = sc.nextDouble();
		
		double hipo = Math.pow(cA, 2) + Math.pow(cB, 2) ;
		
		System.out.println("El valor de la hipotenusa es: "+ hipo);
		
		sc.close();
	}
}
