package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

/**
 * Escribir un programa en el cual se ingresen cuatro n�meros,
 * calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 * @author Yo
 *
 */
public class P04_E20 {

	public static void main(String[] args) {
		double n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee cuatro n�meros.");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		System.out.println("La suma del primero m�s el segundo es " + (n1 + n2)); //se pondr�a par�ntesis en la suma, porque si no concatenar�a y no har�a la suma de los n�meros primero.
		
		System.out.println("El producto del tercero por el cuarto es " + (n3 * n4));
		
		sc.close();
	}
}