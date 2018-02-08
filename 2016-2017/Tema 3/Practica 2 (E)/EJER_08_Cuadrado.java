package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E08			/////
/////////////////////////////////
//*******************************************************************************
//**		8.	Desarrollar una clase que represente un Cuadrado y tenga los	* 
//**			siguientes métodos: cargar el valor de su lado, imprimir su 	*
//**			perímetro y su superficie.										*
//*******************************************************************************

/**
 * 
 * @author begoña
 *
 */

public class EJER_08_Cuadrado {
	private double lado;
	/**
	 * Constructor por defecto
	 */
	public EJER_08_Cuadrado(){
		this.lado=1;
	}
	/**
	 * constructor de clase
	 * @param lado double 
	 * 			corresponde al valor del lado del cuadrado
	 * 			validaciones en clase principal
	 */
	public EJER_08_Cuadrado(double lado){
		this.lado=lado;
	}

	/**
	 * 
	 * @param lado double 
	 * 			corresponde al valor del lado del cuadrado
	 * 			validaciones en clase principal
	 */
	public void setLado(double lado){
		this.lado=lado;
	}
	
	/**
	 * 
	 * @return devuelve el valor del lado un double
	 */
	public double getLado(){
		return this.lado;
	}
	/**
	 * Calcula y escribe el perimetro del cuadrado invocado
	 */
	public void perimetro(){
		System.out.println("EL PERIMETRO DEL CUADRADO ES "+(4*this.lado));
	}
	
	/**
	 * calcula el perimetro del cuadrado invocado
	 * @return devuelve el valor del perimetro
	 */
	public double perimetro1(){
		return 4*this.lado;
	}
	
	/**
	 * Calcula e imprime el valor de la superficie
	 */
	public void superficie(){
		System.out.println("LA SUPERFICIE DEL CUADRADO ES "+Math.pow(this.lado, 2));
	}
	
	/**
	 * 
	 * @return devuelve el valor de la superficie, double
	 */
	public double superficie1(){
		return Math.pow(this.lado, 2);
	}
}
