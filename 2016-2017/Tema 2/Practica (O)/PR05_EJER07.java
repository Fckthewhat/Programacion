package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lee por teclado el valor del radio de una
 * circunferencia y calcula y muestra por pantalla la longitud
 * de la circunferencia, el área del círculo y el volumen de la esfera.
 * 	Longitud = 2 * PI * radio
 * 	área = PI * radio ^ 2
 * 	volumen = 4 / 3 * PI * radio ^ 3
 * @author Yo
 *
 */

public class PR05_EJER07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		System.out.println("Teclee el radio de la circunferencia.");
		radio = sc.nextDouble( );
		System.out.println("La longitud es " + 2 * Math.PI * radio);
		
		System.out.println("El área del círculo es" + Math.PI * Math.pow(radio, 2));
		
		System.out.println("El volumen de la esfera es" + 4 * Math.PI / 3 * Math.pow(radio, 3));
		
		sc.close();
	}
}