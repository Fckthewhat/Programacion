/**
 * Escribir como cadena: 
 * 
 * -2 numeros dobles 
 * -2 caracteres 
 * -2 numeros enteros
 * 
 * Dados 2 números, comparar cual es el mayor y el menor, y mostrar el que se quiera (da igual).
 */
package ClasesGenericas;
import java.util.GregorianCalendar;
public class MetodoGenericoMain {

	public static void main(String[] args) {
	
		System.out.println("Ejemplo de método genérico: ");
		String r;
		r=MetodoGenerico.aCadena(new Integer(8), new Integer (-11));
		System.out.println("r="+r);
		System.out.println("Con tipo Double: "+MetodoGenerico.aCadena(new Double(1.38), 
				new Double(-15e3)));
		System.out.println("Con tipo char: "+MetodoGenerico.aCadena('a', 'z'));
		r=MetodoGenerico.aCadena(8, -11);
		System.out.println("r="+r);
		
		/**System.out.println("Con tipo racional: "+ MetodoGenerico.aCadena(new Racional(1,2), 
				new Racional(3,8)));
		AÑADIR MÁS TARDE(ARRIBA)*/		
		
		//Calendario Gregoriano:
		GregorianCalendar fecha1=new GregorianCalendar(2016,6,3);
		GregorianCalendar fecha2=new GregorianCalendar(2016,4,30);
		if(MetodoGenerico.MayorOMenor(fecha1, fecha2))
			GregorianCalendar resultadofechas = new GregorianCalendar(fecha1);
		
		
		
	}
	//Comparacion mayor y menor:
	/**System.out.println();
	*/
	
	
	
	
}