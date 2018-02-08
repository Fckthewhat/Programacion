/*
 * Crea dos arrays unidimensionales que tengan el mismo 
 * tamaño (lo pedirá por teclado), en uno de ellos 
 * almacenaras nombres de personas como cadenas, en el otro 
 * array o arreglo ira almacenando la longitud de los nombres,
 * Muestra por pantalla el nombre y la longitud que tiene
 */
package ArraysBasicosUnidimensionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca tamaño del array: ");
		int tamanio = sc.nextInt();
		String []nombres = new String[tamanio];
		int []longitud = new int[tamanio];
		for(int i = 0;i<tamanio;i++){
			nombres[i] = sc.next();
			longitud[i] = nombres[i].length();
		}
		for(int i = 0;i<tamanio;i++){
			System.out.println("El nombre "+nombres[i]+
					" tiene de longitud "+longitud[i]);
		}
		sc.close();
	}
}