package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;
/**
 *  Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
 * @author Yo
 *
 */
public class P04_E21 {

	public static void main(String[] args) {
		double numero1, numero2, numero3, numero4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee cuatro números.");
		numero1 = sc.nextDouble();
		numero2 = sc.nextDouble();
		numero3 = sc.nextDouble();
		numero4 = sc.nextDouble();
		
		System.out.println("La suma de los valores leidos es " +
		(numero1 + numero2 + numero3 + numero4));
		
		System.out.println("El promedio es " + (numero1 + numero2 + numero3 + numero4) / 4);
		
		sc.close();
	}
}