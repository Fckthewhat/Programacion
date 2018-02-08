/**
 * Resolver excepciones de una ecuación de 2º grado:
 * (-b+-raiz cuadrada de (b al cuadrado - 4*a*c))/2*a
 * Controlar excepciones de que 2*a, a=0? y 
 * controlar excepcion de que el numerador sea <=0.
 */
package Excepciones;

public class DiscriminanteNegativoException extends Exception{

	//CONSTRUCTOR POR DEFECTO
	public DiscriminanteNegativoException(){	
	}
	
	//CONSTRUCTOR MENSAJE
	public DiscriminanteNegativoException(String info){
		super(info);
		System.out.println("El discriminante es negativo. ");
	}
	
	//CONSTRUCTOR BEGOÑA
	public DiscriminanteNegativoException(String m, double a, double b, double c){
		super(m);
	}
}
