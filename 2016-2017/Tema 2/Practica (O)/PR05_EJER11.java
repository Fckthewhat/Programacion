package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras 
 * desde el principio.
 * @author Javier
 */
public class PR05_EJER11 {

	public static void main(String[] args) {
		int Num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee un número de cinco cifras: ");
		Num = sc.nextInt( );
		
		System.out.println(Num/10000);
		
		System.out.println(Num/1000);
		
		System.out.println(Num/100);
		
		System.out.println(Num/10);
		
		System.out.println(Num);
				
		sc.close( );
	}

}

