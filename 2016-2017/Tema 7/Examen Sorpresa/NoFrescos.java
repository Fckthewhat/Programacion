package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class NoFrescos extends Productos{

	private double tempRecomendada;
	
	//Constructor por defecto
	public NoFrescos(){
	}
	//Constructor de clase
	public NoFrescos(double tempRec,String p, String numL, 
		GregorianCalendar fechaE,GregorianCalendar fechaC){
		super(p,numL,fechaE,fechaC);
		this.tempRecomendada=tempRec;
	}
	//Get y set
	public double getTempRecomendada() {
		return tempRecomendada;
	}
	public void establecerTempRecomendada(double tempRec) {
		this.tempRecomendada = tempRec;
	}
	//toString
	@Override
	public String toString(){
		return "PRODUCTO NO FRESCO\n" + super.toString() + 
			"\nTª RECOMENDADA PARA MANTENIMIENTO: " +
			this.getTempRecomendada();
	}
}
