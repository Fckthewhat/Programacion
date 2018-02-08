package CLASES_INTERNAS;

public class AconMain2CambiosClase {

	int a=10;
	static int b=5;
	
	static class B{//Clase estatica Interna
		B(){
			AconMain2CambiosClase s=new AconMain2CambiosClase(); //Instancio A
			System.out.println(s.a);//Compila Ok y muestra 10
			System.out.println(b);//Compila OK y muestra 5
		}
	}
	public static void main(String[] args) {
		AconMain2CambiosClase.B ab=new AconMain2CambiosClase.B(); //Instancio la clase estatica interna
	}
}