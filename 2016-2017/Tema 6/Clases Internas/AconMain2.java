package CLASES_INTERNAS;

public class AconMain2 {

	int a=10;
	static int b=5;
	
	static class B{//Clase estatica Interna
		B(){
			AconMain2 s=new AconMain2(); //Instancio A
			System.out.println(s.a);//Compila Ok y muestra 10
			System.out.println(b);//Compila OK y muestra 5
		}
	}
	public static void main(String[] args) {
		AconMain2.B ab=new AconMain2.B(); //Instancio la clase estatica interna
	}
}
