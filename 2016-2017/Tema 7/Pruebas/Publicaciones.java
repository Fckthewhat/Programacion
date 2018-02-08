package Pruebas;

import java.util.GregorianCalendar;

public class Publicaciones {

	private String editor;
	private GregorianCalendar fecha;
	
	public Publicaciones(){	
	}
	
	public Publicaciones(String editor, GregorianCalendar fecha){
		this.editor=editor;
		this.fecha=fecha;
	}
	//Set y get
	public void setFecha(GregorianCalendar fecha){
		this.fecha=fecha;
	}
	public void setEditor(String editor){
		this.editor=editor;
	}
	public void getFecha(GregorianCalendar fecha){
		
	}
}
