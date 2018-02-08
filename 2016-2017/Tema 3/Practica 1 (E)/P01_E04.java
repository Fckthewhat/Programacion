package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************
//*		4.	Teniendo como datos de entrada el radio y la altura de un 	*
//*			cilindro, calcular su área lateral y volumen.				*
//***********************************************************************
/**
* 
* @author begoña
*
*/

import java.util.Scanner;

public class P01_E04 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double radio,altura;
		System.out.println("Radio?");
		radio=teclado.nextDouble();
		System.out.println("ALTURA?");
		altura=teclado.nextDouble();
		System.out.println("***********************************************************");
		System.out.println("*\tEL VOLUMEN DEL CILINDRO ES "+altura*Math.PI*Math.pow(radio, 2));
		System.out.println("*\tEL ÁREA LATERAL DEL CILINDRO ES "+2*Math.PI*radio*altura);
		System.out.println("***********************************************************");
		
		teclado.close();

	}

}
