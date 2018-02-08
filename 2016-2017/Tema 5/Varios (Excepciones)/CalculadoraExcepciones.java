package Excepciones;
//import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ArithmeticException;
/**
 * programa que calcule dos números tratando excepciones
 * @author diurno
 *
 */
public class CalculadoraExcepciones {

	public static void main(String[] args) {

		int operador1 = 0, operador2 = 0;
		byte opcion;
		String lectura = "";
		//String opcion;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Teclee 1 para suma, 2 para resta, 3 para producto," 
				+ " 4 para cociente, 5 para resto y 0 para salir.");
			try{
				lectura = br.readLine();
			}
			
			catch(Exception e){
				System.out.println("Error.");
			}
			
			opcion = Byte.parseByte(lectura); //sc.nextByte();
			//sc.nextLine();
			System.out.println("Teclee el operador 1.");
			try{
				lectura = br.readLine();
				operador1 = Integer.parseInt(lectura);
			}
			
			catch(InputMismatchException ime){
				System.out.println("Solo se pueden leer números enteros.");
				operador1 = Integer.parseInt(lectura);
			}
			
			catch(Exception e){
				System.out.println("Error.");
			}
			
			System.out.println("Teclee el operador 2.");
			try{
				lectura = br.readLine();
				operador2 = Integer.parseInt(lectura);
			}
			
			catch(InputMismatchException ime){
				System.out.println("Solo se pueden leer números enteros.");
				operador2 = Integer.parseInt(lectura);
			}
			
			catch(Exception e){
				System.out.println("Error.");
			}
			
			switch(opcion){
			case 1:
				System.out.println("El resultado es " + (operador1 + operador2));
			break;
			case 2:
				System.out.println("El resultado es " + (operador1 - operador2));
			break;
			case 3:
				System.out.println("El resultado es " + (operador1 * operador2));
			break;
			case 4:
				try{
					System.out.println("El resultado es " + (operador1 / operador2));
				}
				
				catch(ArithmeticException ae){
					System.out.println("Dividir entre cero resulta en indeterminación");
				}
				
				catch(Exception e){
					System.out.println("Error genérico.");
				}
				
			break;
			case 5:
				try{
					System.out.println("El resultado es " + (operador1 % operador2));
				}
				
				catch(ArithmeticException ae){
					System.out.println("Dividir entre cero resulta en indeterminación");
				}
				
				catch(Exception e){
					System.out.println("Error genérico.");
				}
				
			break;
			}
			
		}
		
		while(opcion > 5 || opcion < 0);
		
		System.out.println("El programa terminó.");
		//sc.close();
	}
}