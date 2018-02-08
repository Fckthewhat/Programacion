package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		14.	 Diseñar e implementar un programa que solicite a su usuario un		* 
//*			 valor no negativo n yvisualice la siguiente salida:				*
//*		1 	2																	*																*
//*		1	2 	3																*
//*		1 	2 	3	4															*
//*		1 	2 	3																*
//*		1	2																	*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */


import java.util.Scanner;
public class P01_E13 {
	public static void main(String[] a){
		Scanner teclado=new Scanner(System.in);
		int n;
		do{
			System.out.println("introduce un número entero positivo");
			n=teclado.nextInt();
		}while(n<=0);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j+"\t");
			System.out.println("\n");
		}
		for(int i=n-1;i>0;i--){
			for(int j=1;j<=i;j++)
				System.out.print(j+"\t");
			System.out.println("\n");
		}
		teclado.close();
	}

}
