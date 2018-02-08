/*
 * Programa Java que pida las notas de las tres evaluaciones de un alumno y 
 * calcule la nota final (media). La nota final es un numero entero
 */
import java.util.Scanner;
public class P4_Ej07 {

	public static void main(String[] args) {
		
		int nota1,nota2,nota3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca nota de la 1ª evaluación (número entero): ");
		nota1=sc.nextInt();
		System.out.println("Introduzca nota de la 2ª evaluación (número entero): ");
		nota2=sc.nextInt();
		System.out.println("Introduzca nota de la 3ª evaluación (número entero): ");
		nota3=sc.nextInt();
		System.out.println("La media de las notas es: "+(nota1+nota2+nota3)/3);
		sc.close();
	}
}
