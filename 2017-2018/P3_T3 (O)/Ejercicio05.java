/* Escribir un programa que resuelva la ecuaci�n cuadr�tica (ax2 + bx + c = 0) 
 * y comprobar que es exactamente una funci�n cuadr�tica.
 * 
 * @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Teclee un valor para los t�rminos a, b y c de una ecuaci�n cuadr�tica: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if(a == 0)
			System.out.println("No es una ecuaci�n de 2� grado.");
		else if(b == 0)
			System.out.println("x = " + Math.sqrt(c / a));
		else if(c == 0)
			System.out.println("x = " + (b * -1 / a));
		else if(Math.pow(b, 2) - 4 * a * c < 0)
			System.out.println("La ecuaci�n no se puede resolver.");
		else
			System.out.println("x1 = " +
				(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) +
				"\nx2 = " + (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) /
				(2 * a));
		
		sc.close();
	}
}
