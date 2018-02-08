/**
 * Dada una secuencia de n�meros no negativos terminada en cero (0), elaborar un algoritmo 
 * que informe al usuario qu� valor tiene el n�mero mayor 
 * y qu� valor tiene el n�mero menor, sin contar el cero (0).
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;

public class PR04_EJER04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, mayor = 0, menor = Integer.MAX_VALUE;
		boolean cero = false;
		do{
			System.out.println("Teclee un n�mero positivo. Pulse 0 para terminar: ");
			numero = sc.nextInt();
			
			if(numero == 0)
				cero = true;
			
			else{
				
				if(numero > mayor)
					mayor = numero;
				if(numero < menor)
					menor = numero;
			}
		}
		
		while(numero < 0 || !cero);
		
		System.out.println("El programa termin�.");
		System.out.println((mayor > 0) ? "\nEl mayor valor introducido es " + mayor : "");
		System.out.println((menor > 0) ? "\nEl menor valor introducido es " + menor : "");
	sc.close();
	}
}