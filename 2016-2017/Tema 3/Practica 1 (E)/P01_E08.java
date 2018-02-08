package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************
//*	8.	Crear un programa que acepte fechas escritas de modo usual y que 	*
//*		las visualice en tres números; por ejemplo: la entrada 15, febrero, *
//*		1989 debe producir la salida: 15 2 1989.							*
//***************************************************************************
/**
 * 
 * @author begoña
 *
 */
import java.util.Scanner;
public class P01_E08 {

	public static void main(String[] args) {
		String fechaCadena;
		int dia, mes, anyo,diaMayor=0;
		String mesCadena;
		Scanner teclado=new Scanner(System.in);
		boolean error, bisiesto=false;
		
//entrada y validación de fecha
		do{
			error=true;
			System.out.println("INTRODUCE FECHA EN EL FORMATO dd, mes aaaa (el mes en letra)");
			fechaCadena=teclado.nextLine();
	//separamos la cadena en subcadenas	
		//dia
			dia=Integer.parseInt(fechaCadena.substring(0,2));
		//mes
			
			//almacena el mes en letra
			mesCadena=fechaCadena.substring(4,fechaCadena.length()-5);
		//año
			anyo=Integer.parseInt(fechaCadena.substring(fechaCadena.length()-4, fechaCadena.length()));
	//Validamos fecha
		//Empezamos a contar desde el año que queramos
		//deberiamos hacerlo desde que se impone el calendario gregoriano(1582) 
		//pero a efectos practicos es igual
			if(anyo<1582)
				error=false;
			else
				if(anyo%400==0||anyo%4==0&&anyo%100!=0)
					bisiesto=true;
		//mes
			mesCadena=mesCadena.toLowerCase();
			switch (mesCadena){
			case "enero": mes=1;
						  diaMayor=31;			
				break;
			case "febrero":mes=2;
						   if(bisiesto)
							   diaMayor=29;
						   else
							   diaMayor=28;
				break;
			case "marzo": mes=3;
				  		diaMayor=31;			
				break;
			case "abril": mes=4;
						diaMayor=30;			
				break;
			case "mayo": mes=5;
				  		diaMayor=31;			
				break;
			case "junio": mes=6;
				  		diaMayor=30;			
		        break;
			case "julio": mes=7;
				  		diaMayor=31;			
				break;
			case "agosto": mes=8;
				  		diaMayor=31;			
				break;
			case "septiembre": mes=9;
				  		diaMayor=30;			
				break;
			case "octubre": mes=10;
				  		diaMayor=31;			
				break;
			case "noviembre": mes=11;
				  		diaMayor=30;			
				break;
			case "diciembre": mes=12;
						diaMayor=31;			
				break;
			default: mes=0;	
					error=false;
			}
			if(mes!=0 && (dia<1 || dia>diaMayor))
				error=false;
		}while(!error);
	
		//escribir resultados
		System.out.println("la fecha equivalente a "+fechaCadena+" es "+ dia+ "-"+mes+"-"+anyo);
		teclado.close();
	}

}
