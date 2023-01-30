package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//	8. Programa que tome como dato de entrada un número que corresponde a la longitud del radio una esfera 
		//	y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
		//	La fórmula para calcular el volumen de la esfera es
		//	v = (4/3)*PI*r^3
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("ingresa la longitud del radio: ");
		double lonRad = sc.nextDouble();
		
		double vol = (4/3)* Math.PI * Math.pow(lonRad, 3);
		
		System.out.println("El volumen es: "+vol);
		System.out.println();
		
		//9. Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados 
		//(a, b, c), según la siguiente fórmula:  
		//Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p =  (a+b+c)/2 
		//Para calcular la raíz cuadrada se utiliza el método Math.sqrt() 
		
		System.out.print("ingrese el valor de a ");
		double a = sc.nextDouble();
		System.out.print("ingrese el valor de b ");
		double b = sc.nextDouble();
		System.out.print("ingrese el valor de c ");
		double c = sc.nextDouble();
		
		double p = (a+b+c)/2;
		
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("el area del triangulo es: "+area);
		System.out.println();
		
		//10. Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
		
		System.out.print("Ingresa un numero de 3 cifras: ");
		int num = sc.nextInt();
		
		int n1 = num/100;
		int n2 = (num/10)%10;
		int n3 = num%10;
		
		System.out.println("Primer numero " + n1);
        System.out.println("Segundo numero " + n2);
        System.out.println("Tercer numero "  + n3);
        
//        System.out.println("Primera cifra de " + num + " -> " + (n1/100));
//        System.out.println("Cifra central de " + num + " -> " + (n2/10)%10);
//        System.out.println("Última cifra  de " + num + " -> " + (n3%10));
		
	
		sc.close();
	}
}
