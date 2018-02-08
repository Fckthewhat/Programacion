package Excepciones;

public class NoSegundoGradoException_JJ extends Exception{
	public NoSegundoGradoException_JJ(){
		
	}
	
	public NoSegundoGradoException_JJ(String info){
		super(info);
		System.out.println("La ecuacion no es de segundo grado");
	}
	
}
