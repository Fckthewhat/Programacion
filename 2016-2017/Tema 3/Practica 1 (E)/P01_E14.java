package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		14.	 Diseñar e implementar un programa que solicite a su usuario un 	*
//*		valor no negativo n y	visualice la siguiente salida:					*
//*		1 	2 	3 ........	 n-1 	n											*
//*		1 	2 	3 ........ 	n-1													*
//*		...																		*
//*		1 	2 	3																*
//*		1 	2																	*
//*		1																		*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E14 {
	public static void main(String[] a){
		int n;
		Scanner teclado=new Scanner(System.in);
		do{
			System.out.println("Introduce un número positivo");
			n=teclado.nextInt();
		}while (n<=0);	
		for(int i=1;i<=n;i++){
			for(int j=1; j<=n-i+1;j++)
				System.out.print(j+"\t");
			System.out.println();
		}
		teclado.close();
	}
}


