package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class Aire extends Congelados{
	
	private double nitrogeno, oxigeno, H2O,CO2;
	
	//Constructor por defecto
	public Aire(){
	}
	//Constructor de clase
	public Aire(double nitrogeno, double oxigeno,double H2O, double CO2,double tempRec,
		String p, String numL,GregorianCalendar fechaE,GregorianCalendar fechaC){
		super(tempRec,p,numL,fechaE,fechaC);
		this.nitrogeno=nitrogeno;
		this.oxigeno=oxigeno;
		this.H2O=H2O;
		this.CO2=CO2;
	}
	//Get y Set
	public double getNitrogeno() {
		return nitrogeno;
	}
	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}
	public double getOxigeno() {
		return oxigeno;
	}
	public void establecerOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}
	public double getCO2() {
		return CO2;
	}
	public void setCO2(double CO2) {
		this.CO2 = CO2;
	}
	public double getH2O() {
		return H2O;
	}
	public void setH2O(double H2O) {
		this.H2O=H2O;
	}
	//toString
	@Override
	public String toString(){
		return "ESTE PRODUCTO FUE CONGELADO POR AIRE.\n" + super.toString() + 
			"\n%NITRÓGENO: " + this.getNitrogeno() + 
			"\n%OXÍGENO: " + this.getOxigeno() + 
			"\n%DIÓXIDO DE CARBONO: " + this.getCO2() + 
			"\n%VAPOR DE AGUA: " + this.getH2O();
	}
}
