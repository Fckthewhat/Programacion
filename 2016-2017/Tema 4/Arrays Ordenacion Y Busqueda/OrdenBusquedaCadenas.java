/**
 * 1-Dada una cadena ordenadla alfabeticamente todos los caracteres utilizando los metodos
 * de ordenacion que vimos en su momento, pero colocando la ñ en su lugar.
 * 2-En una cadena, búsqueda lineal y dicotómica.
 * 3-Repetir los métodos utilizados en OrdenBusqueda (clase) para un array de cadenas.
 * 4-Modificar el método "compare to" para adaptarlo al alfabeto castellano.
 */
package Ordenacion_Busqueda;

public class OrdenBusquedaCadenas {

	String cad="qwertyuiopasdfghjklñzxcvbnm";
	
	//metodo intercambio:
	public static String intercambio(String cad){
		char[]vector=new char [cad.length()];
		cad.toLowerCase().getChars(0, cad.length(), vector, 0);
		for (int i=0;i<vector.length-1;i++){
			for (int j=i+1; j<vector.length;j++){
				if(vector[j]<vector[i]){
					char aux=vector[j];
					vector [j]=vector[i];
					vector[i]=aux;
				}
			}
		}
		
	}
	
	//metodo seleccion:
	public static String seleccion(String cadena){
		char aux;
		int min;
		char[]array = cadena.toUpperCase().toCharArray();
	}
	
	
}
