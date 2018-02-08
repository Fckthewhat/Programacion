/*
 * Programa que pida al usuario un valor para una variable X y 
 * calcule y escriba el valor de y en la función y = 6*x*x + 8*x - 17.
 */
import java.util.Scanner;
public class P4_Ej08 {

	public static void main(String[] args) {
		
		double x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Cálculo a realizar: y = 6*x*x + 8*x - 17 "
				+ "\nNOTA: Puede introducir decimales, pero debe utilizarse una coma" + "\nPor favor, introduzca un valor para la variable X: ");
		x=sc.nextDouble();
		System.out.println("El valor de y es: "+ (6*x*x + 8*x - 17));
		sc.close();
	}
}
