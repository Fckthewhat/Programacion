/**
 * Hacer un programa que al recibir como datos 
 * 2 cadenas de caracteres, forme una 3ª cadena 
 * intercalando los caracteres de las palabras 
 * de las cadenas recibidas.
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER13 {

	public static void main (String[]args){
		
		String cadena1,cadena2,cadena3="";
		int i,j,l=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Teclee la 1ª cadena a introducir: ");
		cadena1=sc.nextLine();
		System.out.println("Teclee la 2ª cadena a introducir: ");
		cadena2=sc.nextLine();
		
		for(i=0;i<cadena1.length();i++){
	        cadena3+=cadena1.charAt(i);
	        for(j=l;j<cadena2.length();j++){
	           cadena3+=cadena2.charAt(j);
	           j=cadena2.length();
	           l++;
	        }
	    }
		
		System.out.println("La cadena intercalada es: "+cadena3);
	}
}