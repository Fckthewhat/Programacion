package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************************************
//*			La fuerza de atracción entre dos masas, m1 y m2, separadas por una distancia d, 	*
//*			está dada por la fórmula:															*
//*				F=G*m1*m2/d^2																	*
//*																								*
//*			donde G es la constante de gravitación universal G = 6.673 × 10–8 cm3/g ∙ seg2. 	*
//*			Escribir un programa que solicite la masa de dos cuerpos y la distancia entre ellos	*
//*			para obtener su fuerza gravitacional. La salida debe ser en dinas; un dina es igual *
//*			a g  cm/seg2.																		*
//***********************************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		final double G=6.673e-8;
		double masa1, masa2, distancia;
		System.out.println("DISTANCIA?");
		distancia=teclado.nextDouble();
		System.out.println("MASA PRIMERA");
		masa1=teclado.nextDouble();
		System.out.println("MASA SEGUNDA");
		masa2=teclado.nextDouble();
		System.out.println("LA ATRACCIÓN ENTRE LOS CUERPOS DE MASA "+masa1+
				" y "+masa2+ " A UNA DISTANCIA "+distancia+" ES DE "+
				(G*masa1*masa2/Math.pow(distancia, 2)));
		teclado.close();

	}

}
