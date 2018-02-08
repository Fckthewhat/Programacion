package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************
//* 		La constante pi (3.141592) se utiliza en matemáticas; un 	*
//*			método sencillo de calcular su valor es:					*
//*			PI=2*2/1*2/3*4/3*4/5*6/5*6/7*8/7*8/9*...*2n/(2n-1)*2n/(2n+1)*
//			Escribir un programa que efectúe este cálculo con un número *
//*			de términos especificados por el usuario.					*
//**********************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E16 {
	public static void main(String[] a){
		Scanner teclado=new Scanner(System.in);
		int n;
		double suma=2;
		do{
			System.out.println("INTRODUCE NÚMERO DE TERMINOS DE LA SERIE");
			n=teclado.nextInt();
		}while(n<=0);
		for(int i=1;i<=n;i++)
			suma*=(2.0*i/(2.0*i-1)*2.0*i/(2.0*i+1));
		System.out.println("EL VALOR DE LA SUMA DE LOS "+n+" PRIMEROS TERMINOS DE LA SERIE\n2*2/1*2/3*4/3*4/5*6/5*6/7*8/7*8/9*...*2n/(2n-1)*2n/(2n+1) \nES DE "+suma);
		teclado.close();
	}

}
