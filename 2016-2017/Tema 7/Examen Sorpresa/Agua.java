package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class Agua extends Congelados{

	private double gSalLitro;
	
	//Constructor por defecto
	public Agua(){
	}
	//Constructor de clase
	public Agua(double gSalLitro,double tempRec,String p, String numL, 
		GregorianCalendar fechaE,GregorianCalendar fechaC){
		super(tempRec,p,numL,fechaE,fechaC);
		this.gSalLitro=gSalLitro;
	}
	//Get y Set
	public double getgSalLitro(){
		return gSalLitro;
	}
	public void setgSalLitro(double gSalLitro){
		this.gSalLitro=gSalLitro;
	}
	//toString
	@Override
	public String toString(){
		return "ESTE PRODUCTO FUE CONGELADO POR AGUA.\n"+super.toString()
		+"\nGRAMOS DE SAL POR LITRO: "+this.getgSalLitro();
	}
}
