package EJER01;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class EmpleadoFijo extends Empleado{

	//Propiedades
	private GregorianCalendar fechaDeAlta;
	private double sueldoBase;
	private double complementoAnual;
	
	//Constructores
	public EmpleadoFijo(){
		super();
	}
	public EmpleadoFijo(GregorianCalendar fechaDeAlta,
			double sueldoBase, double complementoAnual, String nombre, 
			String nif, int edad){
		super(nombre,nif,edad);
		this.fechaDeAlta=fechaDeAlta;
		this.sueldoBase = sueldoBase;
		this.complementoAnual = complementoAnual;
	}
	
	//Get y set 
	public GregorianCalendar getFechaDeAlta() {
		return fechaDeAlta;
	}
	public void setFechaDeAlta(GregorianCalendar fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getComplementoAnual() {
		return complementoAnual;
	}
	public void setComplementoAnual(double complementoAnual) {
		this.complementoAnual = complementoAnual;
	}
	
	//toString
	@Override
	public String toString(){
		return super.toString()+
				"El año de Alta del Empleado Fijo es: "+fechaDeAlta;
	}
	
	//Método para calcular el sueldo de cada Empleado Fijo
	public double calcularSueldo () {
		GregorianCalendar actual = new GregorianCalendar();
		Calendar diferencia = GregorianCalendar.getInstance();
		diferencia.setTimeInMillis(actual.getTime().getTime() -
					fechaDeAlta.getTime().getTime());
		int anios = diferencia.get(GregorianCalendar.YEAR);
		return sueldoBase + complementoAnual * anios;
	}
}
