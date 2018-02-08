package PRACTICA4_ENTRENAMIENTO;

import java.util.Scanner;

public class P04_E23 {

	public static void main(String[] args) {
		double precio;
		final double IVA = 1.21; 
		//no se pone 0.21 que sería el IVA; si pones 1.21 es como si pusieras IVA*Precio + Precio. // precio += precio * IVA / 100 si IVA == 21.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee el precio del artículo.");
		precio = sc.nextDouble();
		
		System.out.println("El precio de venta al público es " + precio * IVA);
		
		sc.close();
	}
}