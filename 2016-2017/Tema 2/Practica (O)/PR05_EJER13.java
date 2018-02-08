package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea un carácter y compruebe si es un número (Carácter
 * entre '0' y '9')
 * @author Javier
 */

public class PR05_EJER13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char caracter;
		
		System.out.println("Teclee un caracter cualquiera.");
		caracter = sc.nextLine().charAt(0);
		
		System.out.println(caracter >= 0 && caracter <= 9 ?
				"El caracter es un número." : "El caracter no es un número.");
		
		sc.close();
	}	
}
