import java.util.Scanner;

/*
 * Programa que lea un car�cter y compruebe si es un n�mero
 */

public class P4_Ej12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String linea;
		char c;
		System.out.print("Introduce un caracter: ");
		linea = sc.nextLine();
		c = linea.charAt(0);
		if (c >= '0' && c <= '9')
			System.out.println("Si es un n�mero");
		else 
			System.out.println("No es un n�mero");
		sc.close();
	}
}

