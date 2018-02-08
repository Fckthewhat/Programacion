package CLASES_INTERNAS;

public class AconMain_CambiosClase {
	int a=10;
	static int b=5;
	
	public void metodo(){ //Inicio del método
		final int x=0;//las variables aqui solo pueden ser final, no estaticas
		int y=0;
		class B{//Clase interna a método; la clase no puede ser public o abstract, pero sí final.
			//static int prueba; clase local no puede crear un miembro estático
			void otroMetodo(){//Método clase interna a método
				System.out.println(a);//variable no-estática de la clase
				System.out.println(b);//Variable estática de la clase
				System.out.println(x);//Variable local del método
			}
		}//Fin clase interna
		B in=new B();//Instancia b dentro del método
		in.otroMetodo();//Utiliza el método de la clase interna
	}//Fin del método
	//public void otrometodo2(B int y=0){}; no puedes instanciar un metodo de B (y un objeto de B tambien) fuera de la clase B porque no es visible. 
	public static void main(String[] args) {
		new AconMain_CambiosClase().metodo(); //El () de AconMain_CambiosClase es el instanciador de la clase, invocamos al constructor por defecto.
		//new AconMain_CambiosClase().B=new AconMain_CambiosClase().B; //no se puede instanciar B, porque está dentro del método "metodo" y forma parte de algo local, fuera de ese método se podría crear otro con el mismo nombre y no pasaría nada.
	}
}