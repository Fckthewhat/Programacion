/**
 * Tenemos la clase EMPLEADO definida del siguiente modo, de cada empleado guardamos:
 * 		1-String nombre
 * 		2-int edad
 * 		3-string nif
 * Los métodos de la clase son los siguientes:
 * 		1-Los constructores correspondientes
 * 		2-Los métodos de modificación y de devolución
 * 		3-Un método toString, para poder escribir los datos de la cuenta en pantalla.
 * Los empleados pueden ser de tres tipos:
 * 		1-Empleado temporal, del que nos interesa saber la fecha de alta y de baja 
 * 		en la empresa.
 * 		2-Empleado por horas. Nos interesa el precio de la hora trabajada, y el 
 * 		número de horas que ha trabajado este mes.
 * 		3-Empleado fijo. Debemos añadir a la información que almacenamos sobre él el año 
 * 		de alta en la empresa.
 * Además, debemos añadir a todos los empleados deben ser capaces de calcular el sueldo con 
 * las siguientes consideraciones:
 * 		1-En los empleados temporales el sueldo mensual es fijo.
 * 		2-En los empleados fijos el sueldo es el resultado de sumarle a la base un complemento 
 * 		anual fijo multiplicado por el número de años en la empresa.
 * 		3-En los empleados por horas el sueldo se calcula multiplicando su sueldo por hora por 
 * 		el número de horas de este mes.
 * Crea un programa principal, donde definas un empleado de cada tipo y muestra el sueldo 
 * que recibe cada uno de ellos. Los datos se introducen desde teclado y se comprobará 
 * cualquier tipo de inconsistencia.
 */
package EJER01;

public abstract class Empleado {
	
	//Propiedades
	private String nombre;
	private int edad;
	private String nif;
	
	//Constructores
	public Empleado(){
	}
	public Empleado(String nombre, String nif, int edad){
		this.nombre=nombre;
		this.nif=nif;
		this.edad=edad;
	}
	//Set y Get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//toString
	@Override
	public String toString() {
		return "Nombre: "+nombre+
				"\nNIF: "+nif+
				"\nEdad: "+edad;
	}
	
	/*
	 * Método para calcular el sueldo de cada empleado. 
	 * Lo establezco abstracto porque depende de cada tipo de Empleado.
	 * 
	 * Al ser un método abstracto, la clase Empleado también se convertirá en una clase abstracta
	 */
	public abstract double calcularSueldo ();
}
