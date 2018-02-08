/**
 * Leer una frase y encontrar la palabra de mayor longitud. 
 * El programa debe imprimir tanto la palabra como el nº 
 * de caracteres de la misma.
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER12 {

	public static void main (String[]args){
		
		int i, longitud=0;
		String frase, palabra="", palabramayor=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca la frase a evaluar: ");
		frase=sc.nextLine();
		frase+=" ";
		
		for(i=0;i<frase.length();i++){
            palabra=palabra+frase.charAt(i);
            if(frase.charAt(i)==' '){
                if(palabra.length()-1>longitud){
                    longitud=palabra.length()-1;
                    palabramayor=palabra.trim();
                }
                palabra="";
            } 
        }
		System.out.println("");
        System.out.println("La palabra de mayor longitud es: "+palabramayor);
        System.out.println("");
        System.out.println("El número de caracteres que lo forman es de: "+longitud);
	}
}