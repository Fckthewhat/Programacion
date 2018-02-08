/*
 * Realiza un programa Java que lea un número por teclado que pida el precio de un
 * producto (puede tener decimales) y calcule el precio final con IVA. El IVA será una
 * constante que será del 21%.
 */
import java.util.Scanner;
public class P4_Ej09 {

	public static void main(String[] args) {
		
		final double IVA=1.21;
		double precioin,preciofin;
		Scanner sc=new Scanner(System.in);
		System.out.println("NOTA: El precio inicial de un producto puede tener decimales. " 
				+ "\nIntroduzca precio inicial para calcular precio final con IVA: " );
		precioin=sc.nextDouble();
		preciofin=precioin*IVA;
		System.out.println("El precio final del producto es: "+preciofin);
		sc.close();
	}
}
