package com.ipartek.formacion.ejecicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		11. Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
//		Por ejemplo para un número N = 12345   La salida debe ser:
//		1
//		12
//		123
//		1234
//		12345
		
		System.out.print("Ingresa un numero de 5 cifras: ");
		int num = sc.nextInt();
		
		int num1 = num / 10000;
		int num2 = num / 1000;
		int num3 = num / 100;
		int num4 = num / 10;
		
		System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num);
		
//		String[][] t= new String[5][5];
//		
//		for (int fila =0; fila < t.length;fila++) {
//			for (int colum =0; colum < t[fila].length; colum++) {
//				t[fila][colum]=" ";
//			}	
//		}
//		
//		t [0][0] = "t";
//		t [0][1] = "c";
//		t [0][2] = "a";
//		t [1][0] = "p";
//		t [7][3] = "r";
        
        
//        12. Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
//        Por ejemplo para un número N = 12345    La salida debe ser:
//        5
//        45
//        345
//        2345
//        12345
        
        System.out.print("Ingresa un numero de 5 cifras: ");
		int n = sc.nextInt();
		
		int n1 = n % 10;
		int n2 = n % 100;
		int n3 = n % 1000;
		int n4 = n % 10000;
		
		System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n);
        
//        13. Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y 
//        calcule su número de la suerte.
//        El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y 
//        a continuación sumando las cifras obtenidas en la suma.
//        Por ejemplo:
//        Si la fecha de nacimiento es 12/07/1980 
//        Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
//        Número de la suerte: 28
        
        System.out.println("ingrese fecha de nacimiento");
        System.out.print("dia: ");
        int dia = sc.nextInt();
        System.out.print("mes: ");
        int mes = sc.nextInt();
        System.out.print("año: ");
        int año = sc.nextInt();
        
        int nS = dia + mes + año;
        
        int nS1 = nS/1000;
        int nS2 = nS/100%10;
        int nS3 = nS/10%10;
        int nS4 = nS%10;
        
        //System.out.println(""+nS1+""+nS2+""+nS3+""+nS4);
        
        int numSue = nS1 + nS2 + nS3 + nS4;
        
        System.out.println("Su numero de suerte es: "+ numSue);
        
        
        sc.close();
	}

}
