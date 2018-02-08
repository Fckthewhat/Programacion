//Figuras
package Pruebas;

public class Circulo extends ObjGeometrico{

	private double radio,PI;
	
	public Circulo(double x, double y, double r){
		super(x,y);//llama a constructor de la clase base
		radio=r;
	}
	public double area(){
		return PI*radio*radio;
	}
}
