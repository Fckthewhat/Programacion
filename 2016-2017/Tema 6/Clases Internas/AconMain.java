package CLASES_INTERNAS;

public class AconMain {

	int a=10;
	static int b=5;
	
	public void metodo(){ //Inicio del método
		final int x=0;
		class B{//Clase interna a método
			void otroMetodo(){//Método clase interna a método
				System.out.println(a);//variable no-estática de la clase
				System.out.println(b);//Variable estática de la clase
				System.out.println(x);//Variable local del método
			}
		}//Fin clase interna
		B in=new B();//Instancia b dentro del método
		in.otroMetodo();//Utiliza el método de la clase interna
	}//Fin del método
	public static void main(String[] args) {
		new AconMain().metodo();
	}
}
