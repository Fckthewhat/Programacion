package EJER02;

public class Cuenta {

	//Propiedades
	private String titular, nombreDueño;
	private double saldo=0;
	
	//Constructores
	public Cuenta(){
	}
	public Cuenta(String titular,String nombreDueño, double saldo){
		this.titular=titular;
		this.nombreDueño=nombreDueño;
		this.saldo=saldo;
	}
	
	//Set y Get
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNombreDueño() {
		return nombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//toString
	public String toString(){
		return "El titular de la cuenta es: "+titular+
				"\nEl dueño de la cuenta es: "+nombreDueño+
				"\nEl saldo en cuenta es de: "+saldo+" €";
	}
	
	/*
	 * Método reintegro, que recibe una cantidad y lo saca de la cuenta (resta del saldo).
	 * Debemos comprobar antes que la cantidad que deseamos retirar no sea un número 
	 * negativo.
	 * 
	 */
	public boolean reintegro(double n){
		boolean reintegroCorrecto = true;
		if (n<0){
			reintegroCorrecto = false;
		}else{
			saldo = saldo - n;
		}
		return reintegroCorrecto;
	}
		
	/*
	 * Método ingreso, que recibe una cantidad y lo mete en la cuenta (suma al saldo).
	 * Debemos comprobar antes que la cantidad que deseamos retirar no sea un número 
	 * negativo.
	 */
	public boolean ingreso(double n){
		boolean ingresoCorrecto = true;
		if(n<0){
			ingresoCorrecto = false;
		}else{
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}
	
	
}
