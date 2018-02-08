/**
 * Ingrese un texto e indique el % de palabras que tiene menos 
 * de 5 caracteres y el % de palabras con 5 o más caracteres.
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER14 {

	public static void main(String[] args) {
	
		double porcentaje1, porcentaje2, mas5car=0, menos5car=0,con=0;
		String frase, palabra="";
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el texto que quiere que se evalúe: ");
		frase=sc.nextLine();
		frase=frase+" ";
		for(i=0;i<frase.length();i++){
            palabra+=frase.charAt(i);
            if(frase.charAt(i)==' '){
                palabra=palabra.trim();
                if(palabra.length()<5){
                    menos5car++;
                }else{
                    mas5car++;
                }
                palabra="";
                con++;
            }
        }
        porcentaje1=(double)((menos5car/con)*100);
        porcentaje2=(double)((mas5car/con)*100);
        System.out.println("El porcentaje de palabras con menos de 5 caracteres es: "+porcentaje1+" %");
        System.out.println("El porcentaje de palabras con 5 o mas caracteres es: "+porcentaje2+" %");
	}
}
