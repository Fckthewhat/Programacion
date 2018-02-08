package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class Nitrogeno extends Congelados{

	private String metodoCongelacion;
	private double tiempoExposicion;
	//Constructor por defecto
	public Nitrogeno(){
	}
	//Constructor de clase
	public Nitrogeno(String metodoCongelacion,double tiempoExposicion,double tempRec,String p, 
		String numL,GregorianCalendar fechaE,GregorianCalendar fechaC){
		super(tempRec,p,numL,fechaE,fechaC);
		this.metodoCongelacion=metodoCongelacion;
		this.tiempoExposicion=tiempoExposicion;
	}
	//Get y Set
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}
	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}
	public double getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	//toString
	@Override
	public String toString(){
		return "ESTE PRODUCTO FUE CONGELADO CON NITRÓGENO LÍQUIDO\n" +
			super.toString() + "\nMÉTODO DE CONGELACIÓN: " +
			this.getMetodoCongelacion() + "\nSEGUNDOS EXPUESTOS: " +
			this.getTiempoExposicion();
	}
}
