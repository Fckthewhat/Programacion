package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************
//*			El valor de ex se puede aproximar por la suma siguiente:		*
//						1+ x^2/2!+x^3/3!+⋯+x^n/n!							*
//*			Escribir un programa que tome un valor de x como entrada y 		*
//*			visualice la suma para cada uno de los valores de n comprendidos* 
//*			entre 1 a 100.													*
//***************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E19 {
	public static void main(String[] a){
		Scanner teclado=new Scanner(System.in);
		double x,suma=1, factorial=1;
		System.out.println("INTRODUCE VALOR PARA X");
		x=teclado.nextDouble();
		for (int i=2; i<=100;i++){
			factorial*=i;//CALCULO DEL FACTORIAL DE i
			suma+=(Math.pow(x,i)/factorial);
		}
		System.out.println("EL VALOR DE LOS "+100+" PRIMEROS TERMINOS DE LA SERIE \n1+ x^2/2!+x^3/3!+⋯+x^n/n!, PARA EL VALOR DE \nx="+x+" ES "+suma);
		teclado.close();	
	}

}
