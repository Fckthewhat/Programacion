/*
 * Dise�a un programa Java para leer las longitudes de los lados de un triangulo (L1, L2,
 * L3) y calcular el �rea del mismo de acuerdo con la siguiente f�rmula:
 * sp = (L1+L2+L3)/2       y      area= rc(sp*(sp-L1)*(sp-L2)*(sp-L3))
 */
import java.util.Scanner;
public class P4_Ej15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double l1, l2, l3, sp, area;
		System.out.println("Introduzca lados de un triangulo para el c�lculo de su �rea.");
		System.out.print("Introduce 1� lado:");
		l1 = sc.nextDouble();
		System.out.print("Introduce 2� lado:");
		l2 = sc.nextDouble();
		System.out.print("Introduce 3� lado:");
		l3 = sc.nextDouble();
		sp = (l1 + l2 + l3) / 2;
		area = Math.sqrt(sp * (sp-l1) * (sp-l2) * (sp-l3));
		System.out.println("El semiper�metro del tri�ngulo es: "+sp);
		System.out.println("El area del tri�ngulo es: "+area);
		sc.close();
	}
}
