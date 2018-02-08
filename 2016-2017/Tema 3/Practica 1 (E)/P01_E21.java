package PRACTICA1_ENTRENAMIENTO;
//***************************************************************
//*			Calcular la suma de la serie 						*
//*					1/1+1/2+1/3+⋯+1/N							*
//*			donde N es un número que se introduce por teclado.	*
//***************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E21 {
	public static void main(String[] a){
		Scanner teclado=new Scanner(System.in);
		int n;
		float suma=0;
		do{
			System.out.println("INTRODUCE NÚMERO DE TERMINOS DE LA SERIE");
			n=teclado.nextInt();
		}while(n<=0);
		for(int i=1;i<=n;i++)
			suma+=1.0/i;
		System.out.println("EL VALOR DE LA SUMA DE LOS "+n+" PRIMEROS TERMINOS DE LA SERIE 1/1+1/2+1/3+⋯+1/N ES DE "+suma);
		teclado.close();
	}

}
