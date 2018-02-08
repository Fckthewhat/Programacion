package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Productos {

	//Variables
	private String pais;
	private String numLote;
	private GregorianCalendar fechaEnvase;
	private GregorianCalendar fechaCaducidad;
	
	//Constructores
	public Productos(){
	}
	public Productos(String p, String numL, GregorianCalendar fechaE, GregorianCalendar fechaC){
		this.pais=p;
		this.numLote=numL;
		this.fechaEnvase=fechaE;
		this.fechaCaducidad=fechaC;
	}
	//Set y Get
	public void setPais(String p){ //este es el set
		this.pais=p;
	}
	public String getPais(){ //este es el get
		return this.pais;
	}
	public void setNumLote(String numL){
		this.numLote=numL;
	}
	public String getNumLote(){
		return this.numLote;
	}
	public void setFechaE(GregorianCalendar fechaE){
		this.fechaEnvase=fechaE;
	}
	public GregorianCalendar RecuperarFechaE(){
		return this.fechaEnvase;
	}
	public void setFechaCaducidad(GregorianCalendar fechaC){
		this.fechaCaducidad=fechaC;
	}
	public GregorianCalendar RecuperarFechaC(){ 
		return this.fechaCaducidad;
	}
	//toString
	public String toString(){ //sobreescribe el java.lang.Object.toString()
		return "País de origen: "+this.pais+
		"\nNúmero de Lote: "+this.numLote+
		"\nFecha de envasado: "+this.RecuperarFechaE().get(Calendar.DAY_OF_MONTH)+"-"+
		this.RecuperarFechaE().get(Calendar.MONTH+1)+"-"+this.RecuperarFechaE().get(Calendar.YEAR)+
		"\nFecha de caducidad: "+this.RecuperarFechaC().get(Calendar.DAY_OF_MONTH)+"-"+
		this.RecuperarFechaC().get(Calendar.MONTH+1)+"-"+this.RecuperarFechaC().get(Calendar.YEAR);
	}
}
