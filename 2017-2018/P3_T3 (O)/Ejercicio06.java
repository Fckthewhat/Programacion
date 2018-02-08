/*  Diseñar e implementar un programa que solicite a su usuario un valor no 
 *  negativo n y visualice la siguiente salida: 
 *  1   2   3 ........   n-1   n 
 *  1   2   3 ........   n-1 
 *  ... 
 *  1   2   3 
 *  1   2 
 *  
 *  @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Teclee un valor entero (positivo y mayor que 0) para n: ");
			numero = sc.nextInt();
		}while(numero <= 0);
		
		for(; numero > 1; numero--) {
			for(int i = 1; i <= numero; i++)
				System.out.print(i + "\t");
			System.out.println();
		}
		sc.close();
	}
}