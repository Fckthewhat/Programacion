/**
 * Programa que cree un array de 1000 enteros que lea un valor y que 
 * compruebe si un número forma parte de ese array.
 */
package Arrays_PRUEBAS_CLASE;

public class Array_1000_Enteros_CompruebeValor {

	public Array_1000_Enteros_CompruebeValor(){  //Constructor
	}
	
	public boolean coincide(int vector [], int n){ //Clase de los métodos(?)
		for (int i=0;i<vector.length;i++)
			if(vector[i]==n)
				return true;
		return false;
	}
}
