/**
 * 
 */
package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

/**
 * Programa que lea dos caracteres por teclado y compruebe si son iguales.
 * @author diurno
 *
 */
public class P04_E16 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args){
		char caracter1, caracter2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un caracter.");
		caracter1 = sc.nextLine().charAt(0);
		
		System.out.println("Escriba otro caracter.");
		caracter2 = sc.nextLine().charAt(0);
		
		System.out.println(caracter1 == caracter2 ?
				"Los caracteres son iguales." : "Los caracteres son distintos.");
		sc.close();
	}

}
