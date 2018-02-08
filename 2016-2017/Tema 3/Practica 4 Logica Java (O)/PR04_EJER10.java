/**
 * Realizar un programa que pida dos n�meros enteros por teclado y muestre por pantalla el siguiente men�:
 *     1-Sumar
 *     2-Restar
 *     3-Multiplicar
 *     4-Dividir
 *     5-Salir
 *      Elija otra opci�n.
 * El usuario deber� elegir una opci�n y el programa deber� mostrar el resultado por pantalla y despu�s volver al men�. 
 * El programa deber� ejecutarse hasta que se elija la opci�n 5- Salir.
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;
public class PR04_EJER10 {

	public static void main(String[] args) {
		
		int Num1, Num2,opci�n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Teclee 2 n�meros positivos: ");
		Num1=sc.nextInt();
		Num2=sc.nextInt();
		
		do{
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5-Salir");
			System.out.println("Elija opci�n: ");
			opci�n=sc.nextInt();
			
			switch(opci�n){
	
				case 1: 
					System.out.println("Ha elegido la opci�n: 1-Sumar: " + (Num1+Num2));
					break;
				case 2: 
					System.out.println("Ha elegido la opci�n: 2-Restar: " + (Num1-Num2));
					break;
				case 3: 
					System.out.println("Ha elegido la opci�n: 3-Multiplicar: " + (Num1*Num2));
					break;
				case 4: 
					System.out.println("Ha elegido la opci�n: 4-Dividir: " + (float)Num1/Num2);
					break;
				default: System.out.println("");
			}
		}while (opci�n>=1 && opci�n<5);
		
		System.out.println("Ha elegido la opci�n de Salir.");
		System.out.println("El programa llega a su fin. ");
		System.out.println("�Gracias por utilizarme! ");
	sc.close();
	}
}
