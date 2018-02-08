//Figuras
package Pruebas;

public class ObjGeometrico {

	protected double px,py;
	
	public ObjGeometrico(){
		px=py=0;
	}
	public ObjGeometrico(double x, double y){
		px=x;
		py=y;
	}
	public void imprimirCentro(){
		System.out.println("("+px+","+py+")");
	}
}
