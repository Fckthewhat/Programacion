package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea un car�cter y compruebe si es un n�mero (Car�cter
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
				"El caracter es un n�mero." : "El caracter no es un n�mero.");
		
		sc.close();
	}	
}
