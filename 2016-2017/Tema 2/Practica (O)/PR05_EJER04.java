/**
 * Añade al  siguiente programa la declaración de los datos
 * que se especifican a continuación. El tipo de dato elegido
 * debe ser el de menor bits posibles que puedan representar el valor.
 * Justifica tu elección.
 * A) Si un empleado está casado o no.
 * B) Valor máximo no modificable: 999999.
 * C) Día de la semana.
 * D) Día del año.
 * E) Sexo: con dos valores posibles 'V' o 'M'
 * F) Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
 * G) Almacenar el total de una factura
 * H) Población mundial del planeta tierra. 
 * @author Yo
 *
 */
package PRACTICA5_OBLIGATORIA;

public class PR05_EJER04 {

	public static void main(String[] args) {
		boolean casado; //verdadero si está casado, falso si no lo está 
		final int MAXIMO = 999999; //final porque es una constante
		byte diasemana; //es el tipo de dato entero más bajo que se puede usar
		short diaanual; //byte sería demasiado poco e int sería demasiado largo
		char sexo; //Solo puede tomar dos valores que además deben ser 'V' o 'M'
		long milisegundos; //son demasiados, mejor representarlos con long y nos ahorramos problemas
		float totalfactura; /*una factura no suele tener más de dos decimales y no suele
		almacenar un número muy grande (aunque depende de las unidades).*/
		long poblacion; //son muchos seres humanos, así que int se quedaba corto.
	}
}