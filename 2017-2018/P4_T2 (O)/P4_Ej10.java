/*
 * Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 * Lee 315 y muestra 3 1 5
 */
import java.util.Scanner;
public class P4_Ej10 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero de 3 cifras entero: ");
		num=sc.nextInt();
		System.out.println("");
		System.out.println("La 1ª cifra de "+num+" es: "+(num/100));
		System.out.println("La 2ª cifra de "+num+" es: "+(num/10)%10);
		System.out.println("La 3ª cifra de "+num+" es: "+(num%10));
		sc.close();
	}
}
