/**
 * Para saber enunciado, buscar DiscriminanteNegativo. Los dos van de lo mismo
 */
package Excepciones;

public class NoRaizRealException extends Exception {

	private double a,b,c;
	public NoRaizRealException (String m, double a, double b, double c){
		super(m);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public String getMessae(){
		return "Para los coeficientes "+(float)a+", "+(float)b+", "+(float)c +super.getMessage();
	}
	
}
