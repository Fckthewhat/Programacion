package EJER02;

public class Cuenta {

	//Propiedades
	private String titular, nombreDue�o;
	private double saldo=0;
	
	//Constructores
	public Cuenta(){
	}
	public Cuenta(String titular,String nombreDue�o, double saldo){
		this.titular=titular;
		this.nombreDue�o=nombreDue�o;
		this.saldo=saldo;
	}
	
	//Set y Get
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNombreDue�o() {
		return nombreDue�o;
	}
	public void setNombreDue�o(String nombreDue�o) {
		this.nombreDue�o = nombreDue�o;
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
				"\nEl due�o de la cuenta es: "+nombreDue�o+
				"\nEl saldo en cuenta es de: "+saldo+" �";
	}
	
	/*
	 * M�todo reintegro, que recibe una cantidad y lo saca de la cuenta (resta del saldo).
	 * Debemos comprobar antes que la cantidad que deseamos retirar no sea un n�mero 
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
	 * M�todo ingreso, que recibe una cantidad y lo mete en la cuenta (suma al saldo).
	 * Debemos comprobar antes que la cantidad que deseamos retirar no sea un n�mero 
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
