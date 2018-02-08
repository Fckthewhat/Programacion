package ClasesGenericas;
import java.util.GregorianCalendar;
public class MetodoGenerico {

	public static<T>String aCadena(T a,T b){
		
		String q;
		q=a.toString();
		q=q+" "+b.toString(); //Método de begoña
		return q;
	}
	//Dados 2 números, comparar cual es el mayor y el menor, 
	//y mostrar el que se quiera (da igual).
	public static <T extends Comparable> String MayorOMenor (T a, T b){
		if (a.compareTo(b)>0)
			return "El mayor es "+a.toString()+" y el menor es "+b.toString()+"";
			
		else
			return "El mayor es "+b.toString()+" y el menor es "+a.toString()+"";
		
	//calendario gregoriano
	
			
		
	}
}
