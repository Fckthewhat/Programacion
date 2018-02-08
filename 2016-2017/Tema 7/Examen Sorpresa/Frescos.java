package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class Frescos extends Productos{

	//Constructor por defecto
	public Frescos(){
	}
	//Constructor de clase
	public Frescos(String p, String numL, GregorianCalendar fechaE, GregorianCalendar fechaC){
		super(p, numL, fechaE, fechaC);
	}
	//toString
	@Override
	public String toString(){
		return "Este es un producto fresco.\n" + super.toString();
	}
}
