package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa lea la longitud de los catetos de un triángulo rectángulo y
 * calcule la longitud de la hipotenusa según el teorema de Pitágoras. 
 * @author Yo
 *
 */
public class PR05_EJER09 {

	public static void main(String[ ] args) {
		double cateto1, cateto2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee la longitud de los catetos.");
		cateto1 = sc.nextDouble( );
		cateto2 = sc.nextDouble( );
		
		System.out.println("La longitud de la hipotenusa es " +
				Math.sqrt((Math.pow(cateto1, 2) + (Math.pow(cateto2, 2)))));
		
		sc.close();
	}
}