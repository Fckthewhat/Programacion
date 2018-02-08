/**
 * Dada una secuencia de números terminada en cero (0), elaborar un algoritmo para calcular 
 * el porcentaje y la suma de los números impares, el porcentaje y la suma de los números pares, 
 * la suma de todos los números y cuantos números fueron ingresados, 
 * muestre finalmente estos resultados al usuario.
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;
public class PR04_EJER03 {

	public static void main(String[] args) {
		
		int Numero, Numeros=0, NumPares=0, NumImpares=0, SumaPares=0, SumaImpares=0, SumaTotal=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca números a calcular (Pulse 0 para terminar el programa): ");
		do{
			Numero = sc.nextInt();
			if (Numero%2==0){
				NumPares++;
				SumaPares+=Numero;
			}
			else {
				NumImpares++;
				SumaImpares+=Numero;
			}
			Numeros++;
			
		}while(Numero!=0);
		
		SumaTotal += (SumaPares + SumaImpares);
		System.out.println("El programa ha terminado.");
		System.out.println("Los números impares son el " + (float)(NumImpares +1)* 100/Numeros +" % del total. ");
		System.out.println("La suma de los números impares es " + SumaImpares+ "."); 
		System.out.println("Los números pares son el " + (float)(NumPares -1)*  100/Numeros + " % del total. ");
		System.out.println("La suma de los números pares es " + SumaPares+ ".");	
		System.out.println("La suma de todos los números es: " +SumaTotal+ ".");	 
		System.out.println("Se introdujeron " +(Numeros-1)+ " dígitos. ");
	sc.close();
	}
}
