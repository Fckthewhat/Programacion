package Excepciones;

public class DiscriminanteNegExceptionJJ extends Exception{
	
	//CONSTRUCTOR POR DEFECTO
	public DiscriminanteNegExceptionJJ() {
	}
	
	//CONSTRUCTOR MENSAJE
	public DiscriminanteNegExceptionJJ(String info){
		super(info);
		System.out.println("El discriminante es negativo");
	}
	
	//CONTRUCTOR BEGOÑA
	public DiscriminanteNegExceptionJJ(String m, int a, int b, int c){
		super(m);
	}
	
}
