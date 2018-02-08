package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;
/**
 * Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
 * @author Yo
 *
 */
public class P04_E17 {

	public static void main(String[] args) {
		char caracter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un caracter.");
		caracter = sc.nextLine().charAt(0);
		
		System.out.println(caracter >= 'A' && caracter <= 'Z' || caracter == 'Ñ' ?
				"El caracter es una mayúscula." : "El caracter no es una mayúscula.");
		sc.close();
	}
}