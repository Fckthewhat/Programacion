package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

/**
 * Realizar la carga del lado de un cuadrado,
 * mostrar por pantalla el per�metro del mismo
 * (El per�metro de un cuadrado se calcula multiplicando
 * el valor del lado por cuatro)
 * @author Yo
 *
 */
public class P04_E19 {

	public static void main(String[] args) {
		double lado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee el lado del cuadrado.");
		lado = sc.nextDouble();
		
		System.out.println("El per�metro del cuadrado es de " + (lado * 4));
		
		sc.close();
	}
}