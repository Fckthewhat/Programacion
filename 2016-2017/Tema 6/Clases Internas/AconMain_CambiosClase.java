package CLASES_INTERNAS;

public class AconMain_CambiosClase {
	int a=10;
	static int b=5;
	
	public void metodo(){ //Inicio del m�todo
		final int x=0;//las variables aqui solo pueden ser final, no estaticas
		int y=0;
		class B{//Clase interna a m�todo; la clase no puede ser public o abstract, pero s� final.
			//static int prueba; clase local no puede crear un miembro est�tico
			void otroMetodo(){//M�todo clase interna a m�todo
				System.out.println(a);//variable no-est�tica de la clase
				System.out.println(b);//Variable est�tica de la clase
				System.out.println(x);//Variable local del m�todo
			}
		}//Fin clase interna
		B in=new B();//Instancia b dentro del m�todo
		in.otroMetodo();//Utiliza el m�todo de la clase interna
	}//Fin del m�todo
	//public void otrometodo2(B int y=0){}; no puedes instanciar un metodo de B (y un objeto de B tambien) fuera de la clase B porque no es visible. 
	public static void main(String[] args) {
		new AconMain_CambiosClase().metodo(); //El () de AconMain_CambiosClase es el instanciador de la clase, invocamos al constructor por defecto.
		//new AconMain_CambiosClase().B=new AconMain_CambiosClase().B; //no se puede instanciar B, porque est� dentro del m�todo "metodo" y forma parte de algo local, fuera de ese m�todo se podr�a crear otro con el mismo nombre y no pasar�a nada.
	}
}