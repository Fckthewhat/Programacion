/**
 * Ingresar una cadena y determinar cuantas palabras se 
 * encuentran en la cadena. Cada palabra se separa por 
 * medio de un espacio en blanco.
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER11 {

	public static void main (String[]args){
		
		int i, contador=1;
		String cadena;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese la cadena que desea contar: ");
		cadena=sc.nextLine();
		for(i=0;i<cadena.length();i++){
		    if(cadena.charAt(i)==' '){
		        contador++;
		    }
		}
		System.out.println("");
		if(contador==1)
			System.out.println("La cadena contiene: "+contador+" palabra.");
		else
			System.out.println("La cadena contiene: "+contador+" palabras.");
	}
}
