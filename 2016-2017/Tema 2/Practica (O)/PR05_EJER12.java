package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 *Programa que lea un número entero N de 5 cifras y muestre sus cifras 
 *desde el final.
 * @author Javier
  */
public class PR05_EJER12 {

	public static void main(String[] args) {
		int Num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee un número de cinco cifras: ");
		Num = sc.nextInt( );
		
		System.out.println(Num%10);
		
		System.out.printf("%02d %n",Num%100);
		
		System.out.printf("%03d %n",Num%1000);
		
		System.out.printf("%04d %n",Num%10000);
		
		System.out.printf("%05d %n",Num);
				
		sc.close( );
	}	
}
