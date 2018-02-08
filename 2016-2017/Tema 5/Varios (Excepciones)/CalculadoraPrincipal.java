package Excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Calculadora calcula = new Calculadora();
		String lectura = "";
		int operador1 = 1, operador2 = 1;
		System.out.println("Teclee el primer operador.");
		try{
			lectura = br.readLine();
		}
		
		catch(IOException ioe){
			System.out.println("Error de entrada/salida.");
		}
		
		try{
			calcula.setOperador1(Integer.parseInt(lectura));
		}
		
		catch(NumberFormatException nfe){
			System.out.println("Error de tipo de datos.");
		}
		
		System.out.println("Teclee el segundo operador.");
		try{
			lectura = br.readLine();
		}
		
		catch(IOException ioe){
			System.out.println("Error de entrada/salida.");
		}
		
		try{
			calcula.setOperador2(Integer.parseInt(lectura));
		}
		
		catch(NumberFormatException nfe){
			System.out.println("Error de tipo de datos.");
			operador2 = 1;
		}
		
		System.out.print(
			"La suma de los operadores es " + calcula.suma(operador1, operador2) +
			"\nLa diferencia de los operadores es " + calcula.resta(operador1, operador2) + 
			"\nEl producto de los operadores es " + calcula.producto(operador1, operador2));
		System.out.println("\nEl cociente de los operadores es ");
		try{
			calcula.cocienteLanza(operador1, operador2);
		}
		
		catch(ArithmeticException ae){
			System.out.println("Error de tipo aritmético.");
		}
		
		System.out.println("El resto de los operadores es ");
		try{
			calcula.restoLanza(operador1, operador2);
		}
		
		catch(ArithmeticException ae){
			System.out.println("Error de tipo aritmético.");
		}
	}
}