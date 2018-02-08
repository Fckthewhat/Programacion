/*
 * Array de 10 elementos el cual calcula la media de los 
 * números negativos y positivos del mismo, números 
 * ingresados por teclado. 
 */
package ArraysBasicosUnidimensionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double []a = new double[10];
		double numpos=0,numneg=0,totalpos=0,totalneg=0;
		double mediapos=0,medianeg=0;
		for(int i = 0;i<a.length;i++){
			do{
				System.out.println("Introduzca números: ");
				a[i] = sc.nextInt();
			}while(a[i] == 0);
				if(a[i] < 0){
					numneg++;
					totalneg += a[i];
				}else{ 
					numpos++;
					totalpos += a[i];
				}
		}
		mediapos = numpos / totalpos;
		medianeg = numneg / totalneg;
		System.out.println("La media de los números positivos es: "+mediapos);
		System.out.println("La media de los números negativos es: "+medianeg);
		sc.close();
	}
}