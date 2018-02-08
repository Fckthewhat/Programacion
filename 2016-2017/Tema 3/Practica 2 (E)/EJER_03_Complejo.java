package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E03			/////
/////////////////////////////////
//*******************************************************************************
//*		3.	Construir una clase Complejo con dos atributos:						*
//*				�	pReal: parte real de tipo double							*
//*				�	pImag: parte imaginaria tambi�n de tipo double				*
//*		y los m�todos publicos:													*
//*				�	Constructor por defecto: (pReal y pImag valen 0)			*
//*				�	Constructor de clase: con los argumentos pReal y pImag 		*
//*						valores argumentos.										*
//*				�	M�todos get y set.											*
//*				�	void asignar(double x, double y)							*
//*				�	void sumar(Complejo b) 										*
//*				�	void imprimir: (toString)									*
//*				�	y construir una clase PruebaComplejo que contenga un m�todo	*.
//*						principal que trabaje con instancias de la clase 		*
//*						Complejo.												*
//*******************************************************************************
/**
 * 
 * @author bego�a
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
	
//*****M�todos get y set
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
	
//*****M�TODO ASIGNAR(otro set, pero asigna valores al complejo completo)
	public void asignar(double pReal,double pImag){
		this.pReal=pReal;
		this.pImag=pImag;
	}
	
//*****M�todo sumar(suma complejos)al complejo invocador le suma el par�metro
//*****		guardando el valor de la suma en el complejo invocador
	public void sumar(EJER_03_Complejo complejo){
		this.pReal+=complejo.pReal;
		this.pImag+=complejo.pImag;
	}
	
//******METODO IMPRIMIR (Equivale a un toString, el propio m�todo escribe el valor)
	public void imprimir(){
		System.out.println(this.pImag+"i+"+this.pReal);
	}

}
