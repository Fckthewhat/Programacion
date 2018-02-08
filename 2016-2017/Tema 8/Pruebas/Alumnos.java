package PruebasClase;

import java.io.IOException;
import java.io.RandomAccessFile;
public class Alumnos {

	private int nOrden;
	private String nombre;
	private int nota;
	public final int tamanno = 60;
	
	public Alumnos (){
		this.nOrden = -1;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setNota(int nota){
		this.nota = nota;
	}
	public void setNOrden(int orden, int nOrden){
		this.nOrden = nOrden;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getNota(){
		return this.nota;
	}
	public int getNOrden(){
		return this.nOrden;
	}
	
	public String toString(){
		return "Número de Orden: "+this.nOrden+
				"\nNombre del Alumno: "+this.nombre+
				"\nNota: "+this.nota+
				"\n************************************************";
	}
	
	public boolean altaAlumno(RandomAccessFile raf){
		boolean sw = true;
		try{
			raf.writeInt(this.nOrden);
			raf.writeUTF(this.nombre);
			raf.writeInt(this.nota);
		}catch(IOException ioe){
			System.out.println("Error al grabar");
			sw = false;
		}
		return sw;
	}
	
	public int tamanno(){
		return tamanno;
	}
	
	public long desplazamiento (int n){
		return tamanno * (n-1);
	}
}
