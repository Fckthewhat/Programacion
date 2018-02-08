package PruebasClase;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class CreaAlumno {

	File f;
	RandomAccessFile fAlumnos;
	Alumnos alumno;
	final int nAlumnos = 30;
	
	/*
	 * Constructor de clase
	 * define el fichero(File), el flujo y lo abre de forma apropiada
	 * define un objeto alumnos
	 */
	public CreaAlumno(){
		try{
			f = new File ("C:/ficheros/alumnos.dat");
			fAlumnos = new RandomAccessFile (f,"rw");
			alumno = new Alumnos ();
		}catch(IOException ioe){
			System.out.println("Error"+ioe.getMessage());
			System.out.println("Proceso terminado");
			System.exit(-1); /*Termina proceso (entre parentesis es el numero por el que empezaba el proceso).
								Lo definimos aquí: public Alumnos (){
														this.nOrden=-1;
													}*/
		}
	}
	
	/*
	 * Crea un archivo vacio (nOrden = -1), con el número de registros que le indiquemos
	 */
	public void archivoVacio(){
		
		try{
			alumno = new Alumnos();
			for(int i = 1;i<=nAlumnos; i++){
				fAlumnos.seek(alumno.desplazamiento(i));//nos posicionamos
				alumno.altaAlumno(fAlumnos);//grabamos
			}
		}catch(IOException ioe){
			System.out.println("Error al colocar el puntero");
			System.out.println("Terminamos el proceso");
			System.exit(-1);
		}
	}
	
	/*
	 * Entrada de los datos lee nOrden, nombre y nota y la guarda donde le indiquemos (nOrden)
	 */
	public void entrada(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nOrden = -9;
		String nombre = null;
		do{
			System.out.println("Número de orden:");
			try{
				nOrden = Integer.parseInt(br.readLine());
			}catch(NumberFormatException nfe){
				System.out.println("No has tecleado un número");
			}catch(IOException ioe){
				System.out.println("Error I/O");
			}
		}while(nombre == null);
		int nota = -1;
	}
}
	

