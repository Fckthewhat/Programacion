package PRACTICA4_ENTRENAMIENTO;
/**
 * Indique la salida por pantalla de los siguientes programas.
 * @author Yo
 *
 */
public class P04_E08 {

	public static void main(String[] args) {
		//Cálculo 1:
		int x = 2, y = 2, z;
		z = x*y + 10 + 4 / 2 - 2 * 4 + 2;
		System.out.println("El resultado es " + z);
		
		//Cálculo 2:
		boolean w, X = true, Y = true, Z = false;
		w = X && Y || X && Z || Y && Z;
		System.out.println("El resultado es " + w);
	}

}