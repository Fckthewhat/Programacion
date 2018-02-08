package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E03			/////
/////////////////////////////////
//*******************************************************************************
//*		3.	Construir una clase Complejo con dos atributos:						*
//*				•	pReal: parte real de tipo double							*
//*				•	pImag: parte imaginaria también de tipo double				*
//*		y los métodos publicos:													*
//*				•	Constructor por defecto: (pReal y pImag valen 0)			*
//*				•	Constructor de clase: con los argumentos pReal y pImag 		*
//*						valores argumentos.										*
//*				•	Métodos get y set.											*
//*				•	void asignar(double x, double y)							*
//*				•	void sumar(Complejo b) 										*
//*				•	void imprimir: (toString)									*
//*				•	y construir una clase PruebaComplejo que contenga un método	*.
//*						principal que trabaje con instancias de la clase 		*
//*						Complejo.												*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */

public class EJER_03_Complejo {
	private double pImag,pReal;
	
//*****CONSTRUCTORES
	public EJER_03_Complejo(){
		this.pReal=0;
		this.pImag=0;
	}
	
	public EJER_03_Complejo(double pReal,double pImag){
		this.pReal=pReal;
		this.pImag=pImag;
	}
	
//*****Métodos get y set
	public void setPReal(double pReal){
		this.pReal=pReal;
	}
	
	public void setPImag(double pImag){
		this.pImag=pImag;
	}
	
	public double getPReal(){
		return this.pReal;
	}
	
	public double getPImag(){
		return this.pImag;
	}
	
//*****MÉTODO ASIGNAR(otro set, pero asigna valores al complejo completo)
	public void asignar(double pReal,double pImag){
		this.pReal=pReal;
		this.pImag=pImag;
	}
	
//*****Método sumar(suma complejos)al complejo invocador le suma el parámetro
//*****		guardando el valor de la suma en el complejo invocador
	public void sumar(EJER_03_Complejo complejo){
		this.pReal+=complejo.pReal;
		this.pImag+=complejo.pImag;
	}
	
//******METODO IMPRIMIR (Equivale a un toString, el propio método escribe el valor)
	public void imprimir(){
		System.out.println(this.pImag+"i+"+this.pReal);
	}

}
