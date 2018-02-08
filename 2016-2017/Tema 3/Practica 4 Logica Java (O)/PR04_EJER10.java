/**
 * Realizar un programa que pida dos números enteros por teclado y muestre por pantalla el siguiente menú:
 *     1-Sumar
 *     2-Restar
 *     3-Multiplicar
 *     4-Dividir
 *     5-Salir
 *      Elija otra opción.
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y después volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5- Salir.
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;
public class PR04_EJER10 {

	public static void main(String[] args) {
		
		int Num1, Num2,opción;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Teclee 2 números positivos: ");
		Num1=sc.nextInt();
		Num2=sc.nextInt();
		
		do{
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5-Salir");
			System.out.println("Elija opción: ");
			opción=sc.nextInt();
			
			switch(opción){
	
				case 1: 
					System.out.println("Ha elegido la opción: 1-Sumar: " + (Num1+Num2));
					break;
				case 2: 
					System.out.println("Ha elegido la opción: 2-Restar: " + (Num1-Num2));
					break;
				case 3: 
					System.out.println("Ha elegido la opción: 3-Multiplicar: " + (Num1*Num2));
					break;
				case 4: 
					System.out.println("Ha elegido la opción: 4-Dividir: " + (float)Num1/Num2);
					break;
				default: System.out.println("");
			}
		}while (opción>=1 && opción<5);
		
		System.out.println("Ha elegido la opción de Salir.");
		System.out.println("El programa llega a su fin. ");
		System.out.println("¡Gracias por utilizarme! ");
	sc.close();
	}
}
