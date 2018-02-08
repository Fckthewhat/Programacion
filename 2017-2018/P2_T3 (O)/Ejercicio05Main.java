public class Ejercicio05Main {

	public static void main (String[]args) {
		
		/*Creo 3 objetos llamados v1, v2 y v3. 
		 * v1 no posee valores
		 * v2 posee los valores 3,5,6 (X,Y,Z)
		 * v3 va a ser un objeto de copia, es decir, va a tomar los valores que tenga v2
		 */
		Ejercicio05 v1 = new Ejercicio05();
		Ejercicio05 v2 = new Ejercicio05(3,5,6);
		Ejercicio05 v3 = new Ejercicio05(v2);
		
		//Aquí invoco al ToString para que muestre los valores de v1,2 y 3
		System.out.println("vector1 "+ v1.toString());
		System.out.println("vector2 "+ v2.toString());
		System.out.println("vector3 "+ v3.toString());
		
		System.out.println("**********************************************************");
		
		//Aquí desplazo el vector 1 una posición en el eje X
		v1.trasladar(1);
		//Aquí muestro "Vector1 + movimiento de 1 posición en eje X" + coordenadas vector1 (invocando a su ToString pertinente)
		System.out.println("Vector1 + (movimiento de 1 posición en eje X): "+v1.toString());
		
		//Aquí desplazo el vector 2 una posición en el eje X y una posición en el eje Y
		v2.trasladar(1, 1);
		//Aquí muestro "Vector2 + movimiento de 1 posición en eje X y movimiento de 1 posición en eje Y" + coordenadas vector2 (invocando a su ToString pertinente)
		System.out.println("Vector2 + (movimiento de 1 posición en eje X y movimiento de 1 posición en eje Y): "+v2.toString());
		
		//Aquí desplazo el vector 3 una posición en el eje X, una posición en el eje Y y una posición en el eje Z
		v3.trasladar(1, 1, 1);
		//Aquí muestro "Vector3 + movimiento de 1 posición en eje X, movimiento de 1 posición en eje Y y movimiento de 1 posición en eje Z" 
		//+ coordenadas vector3 (invocando a su ToString pertinente)
		System.out.println("Vector3 + (movimiento de 1 posición en eje X, movimiento de 1 posición en eje Y "
				+ "y movimiento de 1 posición en eje Z): "+v3.toString());
	}
}