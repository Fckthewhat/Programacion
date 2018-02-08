package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 * @author Yo
 *
 */
public class PR05_EJER10 {

	public static void main(String[] args) {
		int Num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee un número de tres cifras: ");
		Num = sc.nextInt( );
		
		System.out.println("La primera cifra de " + Num + " => " + (Num/100));
		
		System.out.println("La segunda cifra de " + Num + " => " + (Num/10)%10);
		
		System.out.println("La tercera cifra de " + Num + " => " + (Num%10));
		
		sc.close( );
		
	}
}