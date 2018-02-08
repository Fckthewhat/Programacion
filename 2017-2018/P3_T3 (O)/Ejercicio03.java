/* Escribir un programa que lea la hora en notación de 24 horas y que 
 * imprima en notación de 12; por ejemplo, si la entrada es 13:45, la salida 
 * será 1:45 pm. El programa debe solicitar al usuario que introduzca 
 * exactamente cinco caracteres para especificar una hora; por ejemplo, las 
 * 9 en punto se debe introducir así: 09:00. 
 * 
 * @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio03 {

	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
		String cad, cadHora, cadMinuto, pmoam;
		int horas;
		
		do {
			System.out.println("Introduce hora con formato hh:mm: ");
			cad = sc.nextLine();
		}while (cad.length() != 5);
		
		cadHora = "" + cad.charAt(0) + cad.charAt(1);
		cadMinuto = "" + cad.charAt(3) + cad.charAt(4);
		//no cojo el cad.charAt(2) porque sería el correspondiente a los 2 puntos del formato ( : )
		horas = Integer.parseInt(cadHora);
		
		if (horas < 12)
			pmoam = "am";
		else {
			pmoam = "pm";
			if (horas != 12)
				horas = horas - 12;
			if (horas < 10)
				cadHora = "0"+horas;
			else 
				cadHora = ""+horas;
		}
		
		cad = cadHora + ":" + cadMinuto + " " + pmoam;
		System.out.println("Hora en formato am/pm--> "+cad);
		
		sc.close();
	}
}
