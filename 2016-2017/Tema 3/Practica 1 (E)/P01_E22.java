package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************
//*			Calcular la suma de los términos de la siguiente serie:		*
//					1/2+2/2^2 +3/2^3 +⋯+n/2^n 							*
//***********************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E22 {
	public static void main(String[] a){
		Scanner teclado=new Scanner(System.in);
		int n;
		float suma=0;
		do{
			System.out.println("INTRODUCE NÚMERO DE TERMINOS DE LA SERIE");
			n=teclado.nextInt();
		}while(n<=0);
		for(int i=1;i<=n;i++)
			suma+=i/Math.pow(2, i);// no hace falta covertir pues Math.pow devuelve un doble
		System.out.println("EL VALOR DE LA SUMA DE LOS "+n+" PRIMEROS TERMINOS DE LA SERIE 1/2+2/2^2 +3/2^3 +...+n/2^n ES DE "+suma);
		teclado.close();
	}

}
