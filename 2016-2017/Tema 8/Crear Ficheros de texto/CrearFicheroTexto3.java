package ficherostexto;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* hacer un programa que cree un fichero de texto
 * a partir de una serie de lineas leidas por teclado
 * se termina cuando la linea este vacia
 */
public class CrearFicheroTexto3 {

	public static void main(String[] args) {
		try {
			String nombre = "d:/pruebasjava/TEMA 8_Ficheros/fichero3.txt";
			DataOutputStream f = new DataOutputStream (new FileOutputStream (nombre));
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce lineas a almacenar en el fichero");
			System.out.println("Para terminar pulsa ENTER en linea vacia");
			String linea = entrada.nextLine();
			while ( ! linea.isEmpty()) {
				f.writeBytes(linea+"\r\n");
				linea = entrada.nextLine();
			}
			f.close();
		}
		catch (IOException e) {
			
		}

	}

}
