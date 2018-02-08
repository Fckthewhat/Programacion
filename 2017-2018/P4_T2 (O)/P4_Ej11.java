/*
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final. 
 * Lee 12345 y escribe 5 4 3 2 1
 */
import java.util.Scanner;
public class P4_Ej11 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero de 5 cifras entero: ");
		num=sc.nextInt();
		if (num<=0) {
			System.out.println("Debe introducir un número POSITIVO. "
					+ "\nInténtelo de nuevo: ");
			num=sc.nextInt();
		}else {
			System.out.println("");
			System.out.println(num%10);
			System.out.println((num/10)%10);
			System.out.println((num/100)%10);
			System.out.println((num/1000)%10);
			System.out.println((num/10000)%10);
		}
		sc.close();
	}
}
