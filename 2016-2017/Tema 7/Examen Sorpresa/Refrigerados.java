package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class Refrigerados extends NoFrescos{

	private String codSupervision;
	
	//Constructor por defecto
	public Refrigerados(){
	}
	//Constructor de clase
	public Refrigerados(String codSuperv,double tempRec,String p, String numL, 
			GregorianCalendar fechaE,GregorianCalendar fechaC){
		super(tempRec,p,numL,fechaE,fechaC);
		this.codSupervision=codSuperv;
	}
	//Get y Set
	public String getCodSupervision() {
		return codSupervision;
	}

	public void setCodSupervision(String codSuperv) {
		this.codSupervision = codSuperv;
	}

	@Override
	public String toString(){
		return "PRODUCTO REFRIGERADO\n" + super.toString() + 
			"\nCÓDIGO DE SUPERVISIÓN: " + this.getCodSupervision();
	}
}
