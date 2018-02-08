package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************************************
//*		7.	Escribir un programa que lea la hora en notaci�n de 24 horas y que imprima en notaci�n 	*
//*			de 12; por ejemplo, si la entrada es 13:45, la salida ser� 1:45 pm. El programa debe 	*
//*			solicitar al usuario que introduzca exactamente cinco caracteres para especificar una 	*
//*			hora; por ejemplo, las 9 en punto se debe introducir as�: 09:00							*
//***************************************************************************************************
/**
 * 
 * @author bego�a
 *
 */
import java.util.Scanner;
public class P01_E07 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String horaCadena;
		int hora=100,minuto=100;
		boolean error;
//entrada y validaci�n de datos
		do{
			error=true;
			System.out.println("INTRODUCE HORA EN FORMATO HH:MM PARA RELOJ DE 24 HORAS");
			horaCadena=teclado.nextLine();
			if(horaCadena.length()==5){
				//separamos la cadena para comprobar que es una hora v�lida
				hora=Integer.parseInt(horaCadena.substring(0,2));
				minuto=Integer.parseInt(horaCadena.substring(3,5));
				if(hora<0 ||hora>23)
					error=false;
				if(minuto<0||minuto>59)
					error=false;
			}else
				error=false;
		}while(!error);
		
		
		if(hora<12)
			System.out.println(horaCadena+" am");
		else
			System.out.println((hora-12)+":"+minuto+" pm");
		teclado.close();
		
	}

}
