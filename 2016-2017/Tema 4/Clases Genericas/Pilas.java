package ClasesGenericas;

public class Pilas <T>{

	final int TAM=100;
	T datos[];
	int elementos;

	public Pilas(){
		elementos=0;
		datos=(T[])new Object[TAM];
	}
	//añadir un elemento a la pila
	void insertar (T elem){
		if (elementos<TAM)
			datos[elementos++]=elem;
	}
	//numero de elementos reales en la pila
	int numero(){
		return elementos;
	}
	//obtener un elemento de la pila
	T quitar(){ //comprobar si la pila vacía en el programa llamante
		return datos [--elementos];
	}
	//está la pila vacía?
	boolean vacia(){
		return elementos==0;
	}
	//leer el elemento cima de la pila
	T cima(){ //comprobar si vacía en el programa llamante
		int p=elementos;
		return datos[--p];
	}
}
