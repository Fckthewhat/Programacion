package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E09			/////
/////////////////////////////////
//***********************************************************************************************
//**		9.	Confeccionar una clase que represente un empleado. Definir como atributos su 	*
//**			nombre y su sueldo. Confeccionar los métodos para la carga, otro para imprimir	*
//**			sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si 	*
//**			el sueldo supera a 3000) 														*
//***********************************************************************************************
/**
 * 
 * @author begoña
 *
 */
public class EJER_09_Empleado {
	private String nombre;
	private double sueldo;
	
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public EJER_09_Empleado(){
	}
	
	/**
	 * CONSTRUCTOR DE CLASE
	 * @param nombre cadena. Nombre del empleado
	 * @param sueldo double. Salario del empleado
	 */
	public EJER_09_Empleado(String nombre, double sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	
	/**
	 * CAMBIA VALOR DEL NOMBRE
	 * @param nombre cadena. Nombre del empleado
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	/**
	 * CAMBIA EL VALOR DEL SUELDO
	 * @param sueldo doble
	 */
	public void setSueldo(double sueldo){
		this.sueldo=sueldo;
	}
	/**
	 * DEVUELVE EL VALOR DEL NOMBRE
	 * @return cadena con el valor del nombre del empleado
	 */
	public String getNombre(){
		return this.nombre;
	}
	
	/**
	 * DEVUELVE EL VALOR DEL SALDO
	 * @return un doble con el sueldo
	 */
	public double getSueldo(){
		return this.sueldo;
	}
	
	/**
	 * CONFECCIONA UNA CADENA CON LOS DATOS DEL EMPLEADO
	 * @return cadena
	 */
	public String toString(){
		return "NOMBRE EMPLEADO: "+this.nombre+"\nsUELDO: "+this.sueldo;
	}
	
	/**
	 * ESCRIBE SI EL EMPLEADO DEBE PAGAR IMPUESTOS O NO
	 */
	public void impuestos(){
		if(this.sueldo>3000)
			System.out.println("EL EMPLEADO DEBE PAGAR IMPUESTOS");
		else
			System.out.println("EL EMPLEADO DEBE PAGAR IMPUESTOS");
	}
	
	/**
	 * COMPRUEBA SI EL EMPLEADO DEBE PAGAR IMPUESTOS O NO
	 * @return verdadero si paga impuestor
	 * 			falso en caso contrario
	 * @return
	 */
	public boolean impuestos1(){
		if(this.sueldo>3000)
			return true;
		return false;
	}
	

}
