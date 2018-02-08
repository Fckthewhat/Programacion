/*
 * Hacer un programa que permita convertir un numero en arábigos a romanos.  
 */
package ArraysCadenas;

import java.util.Scanner;

public class Ejercicio17 {
	
	//Método para convertir a números romanos desde arábigo:
		public static String conversionNumerosRomanos(int numero) {
		      int i, mil, cent, dec, uni;
		      String numromano = "";
		     
		      mil = numero / 1000;
		      cent = numero / 100 % 10;
		      dec = numero / 10 % 10;
		      uni = numero % 10;

		     //Obtener millares
		      for (i = 1;i<=mil;i++) 
		             numromano = numromano + "M"; 

		     //Obtener centenas
		      if (cent == 9) {
		          numromano = numromano + "CM";
		      } else if (cent >= 5) {
		    	  numromano = numromano + "D";
		    	  for (i = 6;i<=cent;i++) 
		    		  numromano = numromano + "C";           
		      } else if (cent == 4) {
		          numromano = numromano + "CD";
		      } else {
		    	  for (i = 1;i<=cent;i++) 
		          numromano = numromano + "C";         
		      }

		     //Obtener decenas
		      if (dec == 9) {
		           numromano = numromano + "XC";
		      } else if (dec >= 5) {
		    	  numromano = numromano + "L";
		    	  for (i = 6;i<=dec;i++) 
		    		  numromano = numromano + "X";           
		      } else if (dec == 4) {
		    	  numromano = numromano + "XL";
		      } else {
		    	  for (i = 1;i<=dec;i++) 
		    		  numromano = numromano + "X";          
		      }

		     //Obtener unidades 
		      if (uni == 9) {
		           numromano = numromano + "IX";
		      } else if (uni >= 5) {
		    	  numromano = numromano + "V";
		    	  for (i = 6;i<=uni;i++) 
		    		  numromano = numromano + "I";
		      } else if (uni == 4) {
		    	  numromano = numromano + "IV";
		      } else {
		    	  for (i = 1;i<=uni;i++)
		    		  numromano = numromano + "I";          
		      }
		      return numromano;
		  }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		do {
			System.out.println("Introduce un número entre 1 y 3999: ");
			numero = sc.nextInt();
		}while(numero < 1 || numero > 3999);
		System.out.println("El número "+numero+" en números romanos es: "+conversionNumerosRomanos(numero));
		sc.close();
	}
}