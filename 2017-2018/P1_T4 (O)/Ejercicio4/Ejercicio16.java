/*
 *  Hacer un programa que elimine todas las ocurrencias de una subcadena 
 *  dentro de una cadena.
 */
package ArraysCadenas;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena1,cadena2;
		
		System.out.println("Introduce una cadena (cadena1): ");
		cadena1 = sc.nextLine();
		
		System.out.println("Introduce la cadena a eliminar (cadena2): ");
		cadena2 = sc.nextLine();
		
		cadena1 = cadena1.replaceAll(cadena2, "");
		
		System.out.println("La cadena final es: "+cadena1);
		sc.close();
	}
}