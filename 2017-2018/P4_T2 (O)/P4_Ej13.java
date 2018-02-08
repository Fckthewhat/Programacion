/*
 * Dado un número entero que se introduce por teclado, determinar si se encuentra en
 * el intervalo cerrado 51 – 100
 */
import java.util.Scanner;
public class P4_Ej13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numero;
		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();
		if (numero >= 51 && numero <= 100)
			System.out.println("El numero "+numero+" SÍ se encuentra en el intervalo 51-100");
		else 
			System.out.println("El numero "+numero+" NO se encuentra en el intervalo 51-100");
		sc.close();
	}
}