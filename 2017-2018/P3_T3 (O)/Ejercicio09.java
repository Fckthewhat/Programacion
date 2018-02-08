/*  Programa que lea un fecha de un año (1800 o posterior) y 
 *  escriba si la fecha es correcta o no. 
 *  
 *  @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anyo,mes,dia;
		
		System.out.println("NOTA: Los meses deben ser introducidos como números enteros (1,2,3 hasta 12): ");
		System.out.println("Teclee el mes de una fecha a buscar: ");
		mes = sc.nextInt();
		System.out.println();
		
		while(mes <= 0 || mes > 12) {
			System.out.println("Mes incorrecto. Por favor, vuelva a introducir un mes válido en su forma entera (1 a 12): ");
			mes = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("NOTA 2: Los días deben ser introducidos como números enteros (1 hasta 31): ");
		System.out.println("Teclee el día de una fecha a buscar: ");
		dia = sc.nextInt();
		System.out.println();
		
		while(dia <= 0 || dia > 31) {
			System.out.println("Día incorrecto. Por favor, vuelva a introducir un día válido en su forma entera (1 a 31): ");
			dia = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Teclee un año posterior o igual a 1800: ");
		anyo = sc.nextInt();
		System.out.println();
		
		while(anyo < 1800) {
			System.out.println("Año incorrecto. Por favor, vuelva a introducir un año válido (mayor o igual a 1800): ");
			anyo = sc.nextInt();
		}
		
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(dia <= 31 && dia >= 1)
				System.out.println("La fecha es correcta.");
			else
				System.out.println("La fecha no es correcta.");
		break;
		case 4: case 6: case 9: case 11:
			if(dia <= 31 && dia >= 1)
				System.out.println("La fecha es correcta.");
			else
				System.out.println("La fecha no es correcta.");
		break;
		case 2:
			if (dia <= 29 && dia >= 1)
				System.out.println("La fecha es correcta.");
			else
				System.out.println("La fecha no es correcta.");
			
			if(anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0)
				System.out.println("El año es bisiesto.");
			else
				System.out.println("El año no es bisiesto.");
			/*default:
				System.out.println("La fecha no es correcta.");*/
		}
		
		sc.close();
	}
}
