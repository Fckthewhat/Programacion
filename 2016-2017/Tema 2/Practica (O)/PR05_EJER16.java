package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Diseña un programa Java para leer las longitudes de los lados de un triangulo
 * (L1, L2, L3) y calcular el área del mismo de acuerdo con la siguiente fórmula:
 * sp = (l1 + l2 + l3) / 2;	área = (sp * (sp - l1) * (sp - l2) * (sp - l3)) ^ (1 / 2)
 * @author Yo
 *
 */
public class PR05_EJER16 {

	public static void main(String[] args) {
		double lado1, lado2, lado3, semiPerimetro;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee la longitud de los lados del triángulo.");
		lado1 = sc.nextDouble();
		lado2 = sc.nextDouble();
		lado3 = sc.nextDouble();
		semiPerimetro = (lado1 + lado2 + lado3) / 2;
		
		System.out.println("El área del triángulo es " +
			Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2)
			* (semiPerimetro - lado3)));
		
		sc.close();
	}
}