package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea un número entero y muestre si el número es múltiplo de 10.
 * @author Yo
 *
 */
public class PR05_EJER15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Teclee un número.");
		numero = sc.nextInt();
		
		System.out.println(numero % 10 == 0 ? "El número es múltiplo de diez." :
			"El número no es múltiplo de diez.");
		
		sc.close();
	}
}