//TERMINAR
/**
 * Calculadora;
 * 
 * Programa para controlar excepciones: 
 * 1-Introducir 0 y que d� error. 
 * 2-Introducir caracter y que d� error.
 */
package Excepciones;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.io.IOException;
import java.lang.ArithmeticException;
import java.lang.NumberFormatException;
public class Ejercicio1 {

	public static void main (String[]args)throws IOException{
		
		int numero1,numero2;
		String cadena="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader sc=new BufferedReader (isr);
		/**System.out.println("Introduzca una cadena para leerla: ");
		cadena=sc.readLine();
		try{
			cadena=sc.readLine();
		}
		catch(IOException ioe){
			System.out.println("");
			System.out.println("ERROR GEN�RICO DE LECTURA DE CADENAS");
		}*/
		System.out.println("Introduzca el primer n�mero: ");
		numero1=Integer.parseInt(cadena);	
		try{
			numero1=Integer.parseInt(cadena);	
		}
		catch(ArithmeticException lecturaenteros){
			System.out.println("");
			System.out.println("ERROR, S�LO SE PUEDEN INTRODUCIR N�MEROS ENTEROS");
		}
		catch(Exception e1){
			System.out.println("");
			System.out.println("ERROR GEN�RICO");
		}
		System.out.println("Introduzca el segundo n�mero: ");
		numero2=Integer.parseInt(cadena);
		try{
			numero2=Integer.parseInt(cadena);
		}
		catch(ArithmeticException lecturaenteros1){
		 	System.out.println("");
			System.out.println("ERROR, S�LO SE PUEDEN INTRODUCIR N�MEROS ENTEROS");
		}
		catch(Exception e2){
			System.out.println("");
			System.out.println("ERROR GEN�RICO");
		}
		System.out.println("Introduzca una cadena para leerla: ");
		cadena=sc.readLine();
		try{
			cadena=sc.readLine();
		}
		catch(NumberFormatException lecturacadena){
			System.out.println("");
			System.out.println("ERROR, S�LO PUEDE INTRODUCIRSE CADENAS");
		}
		catch(IOException ioe){
			
			System.out.println("");
			System.out.println("ERROR GEN�RICO DE CADENAS");
		}
			
		System.out.println("Suma: "+numero1+" + "+numero2+" = "+(numero1+numero2));
		System.out.println("Resta: "+numero1+" - "+numero2+" = "+(numero1-numero2));
		System.out.println("Multiplicaci�n: "+numero1+" * "+numero2+" = "+(numero1*numero2));
		try{
			System.out.println("Divisi�n: "+numero1+" / "+numero2+" = "+(numero1/numero2));
		}
		catch(ArithmeticException a1){
			System.out.println("");
			System.out.println("ERROR POR DIVISI�N POR 0");
		}
		catch(Exception e3){
			System.out.println("");
			System.out.println("ERROR GEN�RICO");
		}
	}
}
