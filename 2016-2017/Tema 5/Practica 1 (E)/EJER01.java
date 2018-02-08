/**
 * Escribe un método auxiliar de nombre “caracterEn” en Java 
 * que realice la siguiente acción: Recibe como parámetros una cadena (String) 
 * y un entero (int). 
 * Si el entero está entre 0 y la longitud de la cadena devuelve el carácter 
 * en la posición correspondiente En caso contrario, construye y lanza una excepción 
 * de tipo “Exception”.
 */
package PRACTICA1_ENTRENAMIENTO;

public class EJER01 {

	public static char buscarCaracter(String cad, int entero)throws Exception{ //¿IndexOutofBoundsException? //terminar (pedir a jota)
		char cadena[]=new char[cad.length()];
		cadena=cad.toCharArray();
		if(entero>=cadena.length)
			throw new IndexOutOfBoundsException();
			return cadena[entero];
	}
	/*
	 * public char caracterEn(String cadena, int entero) throws Exception{
		if(entero >= 0 && entero <= cadena.length())
			return cadena.charAt(entero);
		else
			throw new Exception();
	}
	 */
}
