package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class Congelados extends NoFrescos{

	//Constructor por defecto
	public Congelados(){
	}
	//Constructor de clase
	public Congelados(double tempRec,String p, String numL, 
		GregorianCalendar fechaE,GregorianCalendar fechaC){
		super(tempRec,p,numL,fechaE,fechaC);
	}
	//toString
	@Override
	public String toString(){
		return "PRODUCTO CONGELADO\n" + super.toString();
	}
}
