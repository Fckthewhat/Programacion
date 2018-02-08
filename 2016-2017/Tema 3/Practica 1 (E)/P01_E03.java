package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************************
//*		3.	Escribir un programa para convertir una medida dada en pies a sus 		*
//*			equivalentes en a) yardas, b) pulgadas, c) centímetros y d) metros 		*
//*			(1 pie=12 pulgadas, 1 yarda=3 pies, 1 pulgada=2.54 cm, 1 m=100 cm). 	*
//*			Después, ingresar el número de pies e imprimir el número de yardas, 	*
//*			pies, pulgadas, centímetros y metros.									*
//***********************************************************************************
import java.util.Scanner;
public class P01_E03 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double pie,yardas,pulgadas,centimetros,metros;
		System.out.println("INTRODUCE MEDIDA EN PIES A CONVERTIR");
		pie=teclado.nextDouble();
		pulgadas=pie*12;
		yardas=pie/3;
		centimetros=pulgadas*2.54;
		metros=centimetros/100;
		System.out.println(pie+ " pies equivalen a:");
		System.out.println(pulgadas+" pulgadas");
		System.out.println(yardas+" yardas");
		System.out.println(centimetros+" cm");
		System.out.println(metros+" m");
		
		teclado.close();

	}

}
