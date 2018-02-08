/**
 * A�ade al  siguiente programa la declaraci�n de los datos
 * que se especifican a continuaci�n. El tipo de dato elegido
 * debe ser el de menor bits posibles que puedan representar el valor.
 * Justifica tu elecci�n.
 * A) Si un empleado est� casado o no.
 * B) Valor m�ximo no modificable: 999999.
 * C) D�a de la semana.
 * D) D�a del a�o.
 * E) Sexo: con dos valores posibles 'V' o 'M'
 * F) Milisegundos transcurridos desde el 01/01/1970 hasta nuestros d�as.
 * G) Almacenar el total de una factura
 * H) Poblaci�n mundial del planeta tierra. 
 * @author Yo
 *
 */
package PRACTICA5_OBLIGATORIA;

public class PR05_EJER04 {

	public static void main(String[] args) {
		boolean casado; //verdadero si est� casado, falso si no lo est� 
		final int MAXIMO = 999999; //final porque es una constante
		byte diasemana; //es el tipo de dato entero m�s bajo que se puede usar
		short diaanual; //byte ser�a demasiado poco e int ser�a demasiado largo
		char sexo; //Solo puede tomar dos valores que adem�s deben ser 'V' o 'M'
		long milisegundos; //son demasiados, mejor representarlos con long y nos ahorramos problemas
		float totalfactura; /*una factura no suele tener m�s de dos decimales y no suele
		almacenar un n�mero muy grande (aunque depende de las unidades).*/
		long poblacion; //son muchos seres humanos, as� que int se quedaba corto.
	}
}