package EJER01;
import java.util.GregorianCalendar;
public class EmpleadoTemporal extends Empleado{

	//Propiedades
	private GregorianCalendar fechaAlta, fechaBaja;
	private double sueldoMensual;
	
	//Constructores
	public EmpleadoTemporal(){
		super();
	}
	public EmpleadoTemporal(GregorianCalendar fechaAlta,
			GregorianCalendar fechaBaja, double sueldoMensual,
			String nombre, String nif, int edad){
		
		super(nombre,nif,edad);
		this.fechaAlta=fechaAlta;
		this.fechaBaja=fechaBaja;
		this.sueldoMensual = sueldoMensual;
	}
	
	//Set y get
	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(GregorianCalendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public GregorianCalendar getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(GregorianCalendar fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	public double getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	//toString
	@Override
	public String toString(){
		return super.toString()+
				"Fecha de Alta del Empleado Temporal: "
				+fechaAlta+
				"\nFecha de Baja del Empleado Temporal: "
				+fechaBaja;
	}
	
	//Método para calcular el sueldo de cada Empleado Temporal
	public double calcularSueldo () {
		return sueldoMensual;
	}
}
