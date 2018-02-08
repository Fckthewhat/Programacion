/**
 * Escriba un programa que lea una frase y a continuación visualice 
 * cada palabra de la frase en columnas, seguida del número de letras 
 * que tiene cada palabra
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER15 {
	
	public static String pidefrase(){
	
		String frase;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca una frase: ");
		frase=sc.nextLine();
		return frase;
	}
	public static void Resultado(String texto){
		
		String [] columnasfrase=texto.split(" ");
		for(int i=0;i<columnasfrase.length;i++)
			System.out.println(columnasfrase[i]+"\t"+columnasfrase[i].length());
	}
	public static void main(String[] args) {
		
	
		String fraseintroducida=pidefrase();
		Resultado(fraseintroducida);
	}
}

