/**
 * Dado un número entero N, calcular e informar 
 * al usuario cuántos dígitos tiene dicho número.
 */
package P04_TEMA3_LOGICAJAVA.src;

import java.io.*;
import java.util.Scanner;

public class PR04_EJER02 {

	public static void main(String[] args) throws IOException{
		
		int Num, cifras;
		char letra;
		Scanner sc=new Scanner(System.in);
		
        do{
            System.out.print("Introduce un número entero: ");
            Num = sc.nextInt();
            cifras= 0;    		
            while (Num!=0){
        		Num = Num/10;
        		cifras++;
            }
            System.out.println("El número tiene: " + cifras+ " cifras");
            System.out.println("Para salir pulse N: ");
            letra = (char)System.in.read();
            
        }while (letra != 'n' && letra!= 'N');
        
    System.out.println("El programa llega a su fin. ");
    System.out.println("¡Gracias por utilizarme!");
	sc.close();	
   }
}

