/**
 * Utiliza un ciclo do while para calcular Media y utiliza el ciclo while 
 * para calcular la Varianza de un conjunto de n�meros reales no negativos;
 *  utilizando las siguientes f�rmulas.
 *  El proceso termina cuando se introduce un n�mero negativo
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;
public class PR04_EJER07 {

	public static void main(String[] args) {
		
		float Num, Media=0, Suma=0, Varianza=0;
		int cont=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("NOTA: Si introduce n�meros negativos el programa terminar�. ");
		System.out.println("Introduzca una serie de n�meros positivos para calcular la media: ");
		
		//Calculamos la Media de los n�meros introducidos por teclado:
		do{
			Num=sc.nextFloat();
			
			      if (Num>=0){
			          cont++;
			          Suma+=Num;
			       }
			      
			} while(Num>=0);
		
				Media= (float) Suma/cont;
				cont=0;
				Suma=0;
				Num=0;
	  	   
	   //Calculamos la Varianza de los n�meros introducidos por teclado:
	   while(Num>= 0){
		   
			System.out.println("Teclee n�meros positivos para hacer la varianza.");
			Num = sc.nextFloat();
			if(Num>= 0){
				cont++;
				Suma += Num;
			}
		}
	   
		Varianza = (float)((Math.pow(Suma, 2)) / (cont - Math.pow(Suma, 2) / Math.pow(cont, 2)));
		
		System.out.println((Media >= 0)? "La media es " + Media : "La media no es un n�mero. ");
		System.out.println((Varianza >= 0) ? "La varianza es " + Varianza : "La varianza no es un n�mero.");
		
		sc.close();
	}
}
