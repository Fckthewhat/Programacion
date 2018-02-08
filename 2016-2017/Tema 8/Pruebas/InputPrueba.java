package PruebasClase;
/*Hacer ejercicios aparte:
 * 
 * 1-Hacer un programa que lea el nombre y apellidos y lo guarde en un archivo
 * 2-Añadir al fichero anterior nuestra dirección
 * 3-muestre el contenido del archivo
 * 4-crear un menu que nos permita decidir entre crear un archivo o escribir el contenido de un archivo
 * 5-copiar un archivo de bytes en otro
 * 6-añadir este ultimo al menu
 * 7-Fichero que guarde n enteros, n se lee desde teclado y lo lea byte a byte y lo lea como enteros
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputPrueba {

	public static void main (String []args){
		File f=new File ("g:/pruebasjava/TEMA 8_Ficheros/ficheros.bin");
		FileInputStream fi = null;
		try{
			fi=new FileInputStream(f);
		}catch(FileNotFoundException fnfe){
			System.out.println("No encontrado");
		}
		int n=0;
		while(n!=-1){
			try{
			n=fi.read();
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			System.out.println((char)n+" ");
		}
	}
}
