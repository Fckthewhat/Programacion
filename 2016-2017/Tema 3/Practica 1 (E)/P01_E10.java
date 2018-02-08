package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************************************
//*		10.	Crear un programa que valore el salario neto semanal de los  trabajadores de una 	*
//*			empresa de acuerdo a las siguientes normas:											*
//*				•	Horas semanales trabajadas <38 a una tasa.									*
//*				•	Horas extras (38 o más) a una tasa 50% superior a la ordinaria.				*
//*				•	Impuestos de 0%, si el salario bruto es menor o igual a 750 euros; 			*
//*								 10%, si el salario bruto es mayor que 750 euros.				*
//***********************************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E10 {

	public static void main(String[] args) {
		double tasa,salario;
		int nHoras;
		Scanner teclado=new Scanner(System.in);
		do{
			System.out.println("INTRODUCE TASA POR HORA");
			tasa=teclado.nextDouble();
		}while(tasa<=0);
		do{
			System.out.println("INTRODUCE HORAS TRABAJADAS");
			nHoras=teclado.nextInt();
		}while(tasa<=0);
		if(nHoras<38)
			salario=nHoras*tasa;
		else
			salario=nHoras*tasa+0.5*tasa*(nHoras-38);
		if(salario<=750)
			salario=(1-0.1)*salario;
		System.out.println("EL SALARIO A PAGAR AL EMPLEADO ES "+salario);
		teclado.close();
			
	}
}


