/**
 * Escribe un m�todo auxiliar de nombre �caracterEn� en Java 
 * que realice la siguiente acci�n: Recibe como par�metros una cadena (String) 
 * y un entero (int). 
 * Si el entero est� entre 0 y la longitud de la cadena devuelve el car�cter 
 * en la posici�n correspondiente En caso contrario, construye y lanza una excepci�n 
 * de tipo �Exception�.
 */
package PRACTICA1_ENTRENAMIENTO;

public class EJER01 {

	public static char buscarCaracter(String cad, int entero)throws Exception{ //�IndexOutofBoundsException? //terminar (pedir a jota)
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
