package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E06			/////
/////////////////////////////////
//*******************************************************************************************
//*		6.	Desarrollar un programa que cargue los lados de un triángulo e implemente los 	*
//*			siguientes métodos: inicializar los atributos, imprimir el valor del lado mayor	* 
//*			y otro método que muestre si es equilátero o no.								*
//*******************************************************************************************
/**
 * 
 * @author begoña
 *
 */
public class EJER_06_Triangulo {
	private double lado1,lado2,lado3;
	
	public EJER_06_Triangulo(){
		this.lado1=1;
		this.lado2=1;
		this.lado3=1;
	}
	
	public EJER_06_Triangulo(double lado1, double lado2, double lado3){
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public void setLado1(double lado1){
		this.lado1=lado1;
	}
	public void setLado2(double lado2){
		this.lado2=lado2;
	}
	public void setLado3(double lado3){
		this.lado3=lado3;
	}
	
	public double getLado1(){
		return this.lado1;
	}
	public double getLado2(){
		return this.lado2;
	}
	public double getLado3(){
		return this.lado3;
	}
	
	public boolean valida(){
		if (this.lado1+this.lado2>this.lado3 &&this.lado2+this.lado3>this.lado1 && this.lado3+this.lado1>this.lado2)
			return true;
		return false;		
	}
	
	public boolean equilatero(){
		if(this.lado1==this.lado2 && this.lado2==this.lado3)
			return true;
		return false;
	}
	
	public double ladoMayor(){
		double maximo=0;
		if (this.lado1>maximo)
			maximo=this.lado1;
		if(this.lado2>maximo)
			maximo=this.lado2;
		if(this.lado3>maximo)
			maximo=lado3;
		return maximo;
	}

}
