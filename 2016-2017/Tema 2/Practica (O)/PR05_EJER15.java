package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 * @author Yo
 *
 */
public class PR05_EJER15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Teclee un n�mero.");
		numero = sc.nextInt();
		
		System.out.println(numero % 10 == 0 ? "El n�mero es m�ltiplo de diez." :
			"El n�mero no es m�ltiplo de diez.");
		
		sc.close();
	}
}