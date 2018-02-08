package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

/**
 *  Se debe desarrollar un programa que pida el ingreso del precio
 *  de un artículo y la cantidad que lleva el cliente.
 *  Mostrar lo que debe abonar el comprador. 
 * @author Yo
 *
 */
public class P04_E22 {

	public static void main(String[] args) {
		double precio, clienteTiene;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee el precio del artículo.");
		precio = sc.nextDouble();
		
		System.out.println("¿Cuánto lleva el cliente?");
		clienteTiene = sc.nextDouble();
		
		System.out.println(clienteTiene >= precio ?
				"El cliente paga y le sobra " + (clienteTiene - precio) : "Al cliente le falta " + (precio - clienteTiene) + " para poder pagar el artículo.");
		
		sc.close();
	}
}