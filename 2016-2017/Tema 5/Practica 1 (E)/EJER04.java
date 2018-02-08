/**
 * Realizar un programa que calcular el 
 * factorial de cualquier número entero positivo. 
 * El programa debe controlar entre otras excepciones 
 * que el número sea negativo y que exista desbordamiento.
 * 
 * NOTA: Factorial de un número, es la multiplicación de un número por si mismo 
 * por todos los números hasta el 1 hacia abajo. Ningún factorial de un número
 * puede ser un número negativo. El factorial de 0 es 1.
 */
package PRACTICA1_ENTRENAMIENTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
public class EJER04 {

	public static void main (String[]args)throws BufferOverflowException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String lectura = "";
		int numero = 0, resultado = 0;
		try{
			do{
				System.out.println(
					"Teclee un número del que desea conocer el factorial.");
				lectura = br.readLine();
				numero = Integer.parseInt(lectura);
			}
			
			while(numero < 0);
		}
		
		catch(IOException ioe){
			System.out.println("Error de entrada / salida.");
		}
		
		for(int i = numero; i > 1; i--)
			resultado += numero * i;
		
	}
	
	public void excepcionFueraRango (int resultado){
		if(resultado < Integer.MAX_VALUE / 2)
			System.out.println(resultado);
		
		else
			System.out.println(
				"El resultado se sale del límite de los enteros, que es "
				+ Integer.MAX_VALUE);
	}
}

