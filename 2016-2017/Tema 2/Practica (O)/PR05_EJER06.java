package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea una cantidad de grados cent�grados y la pase
 * a grados Fahrenheit y a kelvin. La f�rmula correspondiente es:
 * F = 32 + ( 9 * C / 5) y K=C+ 273.15 
 * @author Yo
 *
 */
public class PR05_EJER06 {

	public static void main(String[] args) {
		double grados_celsius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee la temperatura en �C.");
		grados_celsius = sc.nextDouble( );
		
		System.out.println("La temperatura en �F es " + (32 + grados_celsius * 1.8)); 
		
		System.out.println("La temperatura en �K es " + (grados_celsius + 273.15));
				
		sc.close();
	}
}