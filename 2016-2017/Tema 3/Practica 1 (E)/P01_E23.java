package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		23.	Encontrar un número natural N más pequeño de forma que la suma de 	*
//*			los N primeros números exceda una cantidad introducida por el 		*
//*			teclado.															*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E23 {
	public static void main(String [] a){
		Scanner teclado=new Scanner(System.in);
		int valor,suma=0,i=1;
		System.out.println("INTRODUCE VALOR A SUPERAR");
		valor=teclado.nextInt();
		while(suma<=valor){
			suma+=i;
			i++;
		}
		System.out.println("NÚMERO DE NATURALES PARA SUPERAR EL VALOR "+valor+" ES DE "+(--i));
		teclado.close();
	}	
}


