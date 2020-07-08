package com.bytesw.prueba.ejercicio2;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		String palabra="";
		
		boolean error = false;
		
		Scanner scan = new Scanner( System.in );
		
		System.out.print("Ingrese palabra: ");
		palabra = scan.next();
		
		System.out.println("Palabra["+palabra+"]");
		
		int ini = 0;
		int fin = palabra.length() - 1;
		
		
		while ((ini < fin) && !error) {
			
			if (palabra.charAt(ini) == palabra.charAt(fin)) {
				ini++; fin--;
			} else {
				error = true;
			}
		}
		
		
		if (error) {
			System.out.println("Palabra ["+palabra+"] no es un palindromo");
		} else {
			System.out.println("Palabra ["+palabra+"] es un palindromo");			
		}
	}

}
