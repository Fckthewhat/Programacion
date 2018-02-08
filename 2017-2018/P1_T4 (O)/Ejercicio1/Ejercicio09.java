/*
 * Hacer un programa para ingresar n valores reales en un arreglo y los muestre en 
 * la pantalla, adem�s informar� del mayor, el menor y el promedio. 
 */
package ArraysBasicosUnidimensionales;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mayor = Double.MIN_VALUE, menor = Double.MAX_VALUE, promedio = 0;
		
		System.out.println("Introduzca el tama�o del array: ");
		double []numeros = new double[sc.nextInt()];
		System.out.println();
		
		for (int i=0;i<numeros.length;i++){
			System.out.println("Introduce un n�mero real: ");
			numeros[i]=sc.nextDouble();
			promedio+=numeros[i];
			System.out.println();
			
			if(mayor<numeros[i])
				mayor=numeros[i];
			if(menor>numeros[i])
				menor=numeros[i];
		}
		promedio=promedio/numeros.length;
		
		System.out.print("El array es:\n|");
		for(double e:numeros)
			System.out.printf("%.2f|",e);
		System.out.println();
		System.out.printf("\n%s%.2f.\n%s%.2f.\n%s%.2f.",
			"El n�mero menor introducido es: ",menor,
			"El n�mero mayor introducido es: ",mayor,
			"El promedio de los n�meros introducidos es: ",promedio);
		sc.close();
	}
}