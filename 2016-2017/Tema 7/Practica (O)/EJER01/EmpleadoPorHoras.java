package EJER01;

import java.util.GregorianCalendar;

public class EmpleadoPorHoras extends Empleado{

	//Propiedades
	private double precioHora,numHoras;
	
	//Constructores
	public EmpleadoPorHoras(){
		super();
	}
	public EmpleadoPorHoras(double precioHora,double numHoras,
							String nombre, String nif, int edad){
		super(nombre,nif,edad);
		this.precioHora=precioHora;
		this.numHoras=numHoras;
	}
	
	//Get y set
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public double getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(double numHoras) {
		this.numHoras = numHoras;
	}
	
	//toString
	@Override
	public String toString(){
		return super.toString()+
				"Precio por hora: "+precioHora+
				"\nNúmero de horas: "+numHoras;
	}
	
	//Método para calcular el sueldo de cada Empleado por Horas
	public double calcularSueldo () {
		return precioHora * numHoras;
	}
}
