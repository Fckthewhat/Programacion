/*
 * Dado un número que se introduce por teclado, si es positivo verificar si se encuentra
 * en el intervalo abierto 60 – 90, de lo contrario emitir un mensaje de error.
 */
import java.util.Scanner;
public class P4_Ej14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Introduce un número entero: ");
		num = sc.nextInt();
		if (num > 0) {
			if (num >= 60 && num <= 90)
				System.out.println("El número "+num+" SÍ se encuentra en el intervalo 60-90.");
			else 
				System.out.println("El número "+num+" NO se encuentra en el intervalo 60-90.");
		}
		else
			System.out.println("Error, el número "+num+" es negativo.");
		sc.close();
	}
}
