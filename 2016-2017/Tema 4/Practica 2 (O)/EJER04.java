/**
 * Se tiene una lista de N nombres de alumnos. Escribir un algoritmo que solicite 
 * el nombre de un alumno, busque en la lista (array) si el nombre está en la lista. 
 * Usar la clase que ya teneis para ordenar y buscar elementos en un array.
 */
package TEMA4_P02_OBLIGATORIA;
import java.io.*;
public class EJER04 {

	public static void main (String[]args)throws IOException{
		
		String nombre[] = new String[10];
		String buscar;
		int posicion=0,n=0,numero=0;
		boolean encontrar=true;
		
		InputStreamReader leerdato= new InputStreamReader (System.in);
		BufferedReader lados = new BufferedReader (leerdato); 
		for(int i=0;i<nombre.length;i++){
			System.out.print("Nombre ["+i+"]= ");
			nombre[ i ]=lados.readLine ();
		} 
		System.out.print("Que nombre desea buscar en el arreglo : ");
		buscar=lados.readLine();
		while (n<numero&& encontrar){
			if (nombre[n].equals(buscar)) {
				posicion=n;
				encontrar=false;
			}
			n++;
		} 
		if (!encontrar) 
			System.out.println(" El nombre esta en la posicion : "+posicion);
		else
			System.out.println("El nombre no existe");
	}
}



 
 

