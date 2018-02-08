/**
 * Clase para instanciar vectores 
 * de enteros de cualquier tamaño.
 * 
 * @author diurno
 */
package Arrays_PRUEBAS_CLASE;

public class Vector {
	//Atributos
	private int array[],tamanno;
	
	//Constructor por defecto (tamaño 10, 0's). Los constructores deben tener el mismo nombre que la clase.
	public Vector(){
		this.tamanno=10;
		for(int i=0;i<this.array.length;i++) //El for es para rellenar el constructor de 0's 
			array[i]=0;
	}
	//Constructor parametrizado que genera un array tamaño con valores ya leídos.
	public Vector(int tamanno){
		this.tamanno=tamanno;
	}
	//Constructor de copia que genera un array con los mismos valores que la clase Vector
	public Vector(Vector vectorInt){
		this.array=vectorInt.array;
		this.tamanno=vectorInt.tamanno;
	}
	//hacer un método que servirá para cargar todos los elementos de un vector
	//y luego modifica los valores de ese vector. 
	//Nombre del método: cargaElementos.
	public static void cargaElementos(Vector vectorInt){
		for (int i=0;i<vectorInt.tamanno;i++)
			vectorInt.array[i]=(int)(Math.random()*20+1);
	}
}
