package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		23.	Encontrar un n�mero natural N m�s peque�o de forma que la suma de 	*
//*			los N primeros n�meros exceda una cantidad introducida por el 		*
//*			teclado.															*
//*******************************************************************************
/**
 * 
 * @author bego�a
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
		System.out.println("N�MERO DE NATURALES PARA SUPERAR EL VALOR "+valor+" ES DE "+(--i));
		teclado.close();
	}	
}


