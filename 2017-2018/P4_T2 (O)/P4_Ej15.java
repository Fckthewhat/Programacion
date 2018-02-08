/*
 * Diseña un programa Java para leer las longitudes de los lados de un triangulo (L1, L2,
 * L3) y calcular el área del mismo de acuerdo con la siguiente fórmula:
 * sp = (L1+L2+L3)/2       y      area= rc(sp*(sp-L1)*(sp-L2)*(sp-L3))
 */
import java.util.Scanner;
public class P4_Ej15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double l1, l2, l3, sp, area;
		System.out.println("Introduzca lados de un triangulo para el cálculo de su área.");
		System.out.print("Introduce 1º lado:");
		l1 = sc.nextDouble();
		System.out.print("Introduce 2º lado:");
		l2 = sc.nextDouble();
		System.out.print("Introduce 3º lado:");
		l3 = sc.nextDouble();
		sp = (l1 + l2 + l3) / 2;
		area = Math.sqrt(sp * (sp-l1) * (sp-l2) * (sp-l3));
		System.out.println("El semiperímetro del triángulo es: "+sp);
		System.out.println("El area del triángulo es: "+area);
		sc.close();
	}
}
