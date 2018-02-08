package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que pase una velocidad en Km/h a m/s.
 * La velocidad se lee por teclado.
 * @author Yo
 *
 */
public class PR05_EJER08 {

	public static void main(String[] args) {
		double velocidad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee la velocidad en Km/h.");
		velocidad = sc.nextDouble( );
		
		System.out.println(velocidad + " en Km/h son " + velocidad / 3.6 + " m/s.");
		
		sc.close();
	}
}