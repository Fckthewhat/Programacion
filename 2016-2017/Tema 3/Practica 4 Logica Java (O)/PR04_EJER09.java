/**
 * Realizar un programa Java que permita determinar e imprima el sueldo semanal 
 * de un trabajador de una empresa; con base en las horas trabajadas y el pago por hora, 
 * considerando que a partir de la hora n�mero 41 y hasta la 45, cada hora se le paga el doble, 
 * de la hora 46 a la 50, el triple, y que trabajar m�s de 50 horas no est� permitido. 
 * El precio de la Hora es un valor constante. La empresa desea conocer el total a pagar a todos sus empleados.
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;

public class PR04_EJER09 {

	public static void main(String[] args) {
		
		int Horas,PrecioHoras;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca n�mero de horas: ");
		Horas=sc.nextInt();
		System.out.println("Introduzca el precio/hora: ");
		PrecioHoras=sc.nextInt();
		
		if (Horas>=41 && Horas<=45){
			System.out.println("El Salario total ser�an: "+(PrecioHoras * 2)*Horas+" euros mensuales. ");
		}
		
		if(Horas>=46 && Horas<50){
			System.out.println("El Salario total ser�an: "+(PrecioHoras * 3)*Horas+" euros mensuales. ");
		}
		
		if (Horas>=50){
			System.out.println("Trabajar m�s de 50 horas semanales est� prohibido. ");
		}
		
    sc.close();
	}
}
