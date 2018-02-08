/**
 * Escribir el código de una clase para tratar el error que 
 * se produce cuando un argumento de un algoritmo neperiano es negativo. 
 * 
 * El constructor de la clase tendrá como argumento una cadena y el valor que generado el error.
 */
package PRACTICA1_ENTRENAMIENTO;

public class EJER06 {
	
	public static double logaritmoNep(double n) throws LogNepException{
		if(n<0)
			throw new LogNepException("No existe solucion para numeros negativos " + Math.log(n));
		return Math.log(n);
	}
}
