package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;
/**
 * Programa que lea un car�cter por teclado y compruebe si es una letra may�scula.
 * @author Yo
 *
 */
public class P04_E17 {

	public static void main(String[] args) {
		char caracter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un caracter.");
		caracter = sc.nextLine().charAt(0);
		
		System.out.println(caracter >= 'A' && caracter <= 'Z' || caracter == '�' ?
				"El caracter es una may�scula." : "El caracter no es una may�scula.");
		sc.close();
	}
}