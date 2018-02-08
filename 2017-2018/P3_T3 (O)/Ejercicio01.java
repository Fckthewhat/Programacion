/*  Dado un número entero que se lee desde teclado, indicar el número de 
 *  dígitos que contiene y escribir los dígitos del número cada uno 
 *  en una línea empezando por la unidad 
 *  
 *  @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n,resto;
		
		System.out.println("Introduce número entero: ");
		n = sc.nextInt();
		
		if (n == 0) {
			System.out.println("Error, 0 no es un número válido.");
		}
		System.out.println();
		while(n != 0){
			resto = n % 10;
			n = n / 10;
			System.out.println("Las cifras son: "+resto);
		}
		sc.close();
	}
}
