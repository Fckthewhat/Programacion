/*  Dado un n�mero entero que se lee desde teclado, indicar el n�mero de 
 *  d�gitos que contiene y escribir los d�gitos del n�mero cada uno 
 *  en una l�nea empezando por la unidad 
 *  
 *  @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n,resto;
		
		System.out.println("Introduce n�mero entero: ");
		n = sc.nextInt();
		
		if (n == 0) {
			System.out.println("Error, 0 no es un n�mero v�lido.");
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
