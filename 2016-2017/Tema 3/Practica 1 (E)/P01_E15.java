package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************
//*		15.	En una empresa de ordenadores, los salarios de los empleados se	* 
//*	aumentarán según su contrato actual:									*
//*			Contrato 			Aumento %									*
//*			0 a 800€ 			20											*
//*			801€  a 1500€ 		10											*
//*			1501€ a 2000€		5											*
//*			más de 2000€		0											*
//*	Escribir un programa que solicite el salario actual de cada empleado y 	*
//*	que, además, calcule y visualice el nuevo salario.						*
//***************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E15 {
	public static void main(String[] a){
		double salario;
		Scanner teclado=new Scanner(System.in);
		do{
			System.out.println("Salario?");
			salario=teclado.nextDouble();
		}while(salario<=0);
		if(salario<=800)
			salario+=(0.2*salario);
		else if (salario<=1500)
				salario+=(0.1*salario);
			 else if(salario<=2000)
				     salario+=0.05*salario;
		System.out.println("el nuevo salario del empleado es "+salario);
		teclado.close();
	}

}
