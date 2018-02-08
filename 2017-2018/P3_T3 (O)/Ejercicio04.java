/* Crear un programa que valore el salario neto semanal de los  
 * trabajadores de una empresa de acuerdo a las siguientes normas: 
 * 
 * 	Horas semanales trabajadas <38 a una tasa. 
 * 
 * 	Horas extras (38 o más) a una tasa 50% superior a la ordinaria. 
 * 
 * 	Impuestos del 0%, si el salario bruto es menor o igual a 750 euros 
 * 
 * 	Impuestos del 10%, si el salario bruto es mayor que 750 euros. 
 * 
 * @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int horastrabajadas;
		double tasaporhora, salariobruto, impuestos, salarioneto;
		
		System.out.println("Introduce numero de horas trabajadas (entero): ");
		horastrabajadas = sc.nextInt();
		System.out.println("Introduce tasa por hora (puede tener decimales): ");
		tasaporhora = sc.nextDouble();
		
		if (horastrabajadas <= 38)
			salariobruto = tasaporhora * horastrabajadas;
		else 
			salariobruto = tasaporhora * 38 + tasaporhora * 1.5 * (horastrabajadas - 38);
		
		if (salariobruto <= 750)
			impuestos = 0;
		else 
			impuestos = salariobruto * 0.1;
		
		salarioneto = salariobruto - impuestos;
		System.out.println("Salario bruto: "+salariobruto+
				"\nImpuestos: "+impuestos+
				"\nSalario neto: "+salarioneto);
		
		sc.close();
	}
}
