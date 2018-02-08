package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*	  12.	Programa que resuelva la ecuación cuadrática (ax^2+bx+c=0) y 		*
//*		comprobar que es exactamente una función cuadrática.					*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E12 {
	public static void main(String[] arg){
		Scanner teclado=new Scanner(System.in);
		int a,b,c;
		System.out.println("INTRODUCE VALOR PARA EL COEFICIENTE A DE LA ECUACIÓN AX^2+BX+C=0");
		a=teclado.nextInt();
		while(a==0){
			System.out.println("EL COEFICIENTE A NO PUEDE SER 0");
			a=teclado.nextInt();
		}
		System.out.println("INTRODUCE VALOR PARA EL COEFICIENTE B DE LA ECUACIÓN AX^2+BX+C=0");
		b=teclado.nextInt();
		System.out.println("INTRODUCE VALOR PARA EL COEFICIENTE C DE LA ECUACIÓN AX^2+BX+C=0");
		c=teclado.nextInt();
		if(b*b-4*a*c<0)
			System.out.println("LA ECUACIÓN "+a+"x^2+"+b+"x+"+c+"=0\nNO TIENE SOLUCIONES REALES");
		else{
			System.out.println("LA ECUACIÓN "+a+"x^2+"+b+"x+"+c+"=0 TIENE COMO SOLUCIONES");
			System.out.println("x1="+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
			System.out.println("x2="+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
		}
		teclado.close();
	}
}
