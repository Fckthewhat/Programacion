/**
 *Construye un algoritmo que calcule e imprima las tablas 
 *de multiplicar, desde la tabla del 1 hasta la del 10.
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;

public class PR04_EJER05 {

	public static void main(String[] args) {
		
		int i, Numero, Resultado;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		Numero=sc.nextInt();
		
		for (i=1; i<=10; i++){
			Resultado = i * Numero;
			System.out.println(Numero + " x " + i+ " = " + Resultado);
		}
	sc.close();
	}
}
