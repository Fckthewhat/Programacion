package PruebasClase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputPrueba {
	public static void main (String []args){
		File f=new File("g:/pruebasjava/TEMA 8_Ficheros/ficheros.bin");
		FileOutputStream fe=null;
		do{
			try{
				fe=new FileOutputStream(f);
			}catch(IOException ioe){
				System.out.println("NO SE HA PODIDO ARIR EL ARCHIVO");
			}
		}while(fe==null);
		String nombre="Javier Caparrós León";
		byte[]nombreBytes=nombre.getBytes();
		try{
			fe.write(nombreBytes);
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}
}
