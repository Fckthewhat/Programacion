package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E10			/////
/////////////////////////////////

//***********************************************************************************************
//*		10.	Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su	* 
//*			suma, resta, multiplicación y división, cada una en un método, imprimir dichos 		*
//*			resultados. 																		*
//***********************************************************************************************

/**
 * 
 * @author begoña
 *
 */
public class EJER_10_Operaciones {
	private double operando1,operando2;
	
	/**
	 * CONSTRUCTRO POR DEFECTO
	 */
	public EJER_10_Operaciones(){
	}
	
	/**
	 * CONSTRUCTOR DE CLASE
	 * @param operando1 doble
	 * @param operando2 doble
	 */
	public EJER_10_Operaciones(double operando1, double operando2){
		this.operando1=operando1;
		this.operando2=operando2;
	}
	/**
	 * MÉTODO SET PRIMER OPERANDO
	 * @param operando1 doble
	 */
	public void setOperando1(double operando1){
		this.operando1=operando1;
	}
	
	/**
	 * METODO SET SEGUNDO OPERANDO
	 * @param operando2 doble
	 */
	public void setOperando2(double operando2){
		this.operando2=operando2;
	}
	
	/**
	 * METODO GET PRIMER OPERANDO
	 * @return valor del primer operando doble
	 */
	public double getOperando1(){
		return this.operando1;
	}
	
	/**
	 * METODO GET SEGUNDO OPERANDO
	 * @return valor del segundo operando doble
	 */
	public double getOperando2(){
		return this.operando2;
	}
	
	public double suma(){
		return this.operando1+this.operando2;
	}
	
	public double diferencia(){
		return this.operando1-this.operando2;
	}
	
	public double producto(){
		return this.operando1*this.operando2;
	}
	
	/**
	 * CALCULA Y DEVUELVE EL VALOR DE LA DIVISIÓN O MENSAJE DE ERROR
	 * @return cadena el valor de la division si el divisor<>0
	 * 			mensaje de error en caso contrario
	 */
	public String división(){
		if(this.operando2==0)
			return "ERROR DIVISIÓN POR O";
		return ""+this.operando1/this.operando2;
	}
}
