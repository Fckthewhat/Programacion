package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

/**
 *  Programa Java que lea un n�mero entero y calcule si es par o impar.
 * @author Yo
 *
 */
public class P04_E18 {

	public static void main(String[] args) { //da igual si ponen args o arg, est� bien igualmente.
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un n�mero entero por teclado.");
		numero = sc.nextInt();
		
		System.out.println(numero % 2 == 0 ? "El n�mero es par." : "El n�mero es impar.");
		
		sc.close();
	}
}