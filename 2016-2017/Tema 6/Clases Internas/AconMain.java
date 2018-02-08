package CLASES_INTERNAS;

public class AconMain {

	int a=10;
	static int b=5;
	
	public void metodo(){ //Inicio del m�todo
		final int x=0;
		class B{//Clase interna a m�todo
			void otroMetodo(){//M�todo clase interna a m�todo
				System.out.println(a);//variable no-est�tica de la clase
				System.out.println(b);//Variable est�tica de la clase
				System.out.println(x);//Variable local del m�todo
			}
		}//Fin clase interna
		B in=new B();//Instancia b dentro del m�todo
		in.otroMetodo();//Utiliza el m�todo de la clase interna
	}//Fin del m�todo
	public static void main(String[] args) {
		new AconMain().metodo();
	}
}
