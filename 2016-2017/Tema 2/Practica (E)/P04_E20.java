package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

/**
 * Escribir un programa en el cual se ingresen cuatro números,
 * calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 * @author Yo
 *
 */
public class P04_E20 {

	public static void main(String[] args) {
		double n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee cuatro números.");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		System.out.println("La suma del primero más el segundo es " + (n1 + n2)); //se pondría paréntesis en la suma, porque si no concatenaría y no haría la suma de los números primero.
		
		System.out.println("El producto del tercero por el cuarto es " + (n3 * n4));
		
		sc.close();
	}
}