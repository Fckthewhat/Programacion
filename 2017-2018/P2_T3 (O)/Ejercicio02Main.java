public class Ejercicio02Main {

	public static void main(String[] args) {
		
		Ejercicio02 cafe1 = new Ejercicio02 ();
		Ejercicio02 cafe2 = new Ejercicio02 ();
		Ejercicio02 cafe3 = new Ejercicio02 ();
		
		System.out.println("Creación de una cafetera por defecto");
		
		System.out.println(cafe1.getCapacidadMaxima()+" "+cafe1.getCantidadActual());
		
		System.out.println("Creación de una cafetera con capacidad maxima");
		cafe2 = new Ejercicio02 (1500);
		System.out.println(cafe2.getCapacidadMaxima()+" "+cafe2.getCantidadActual());
		
		System.out.println("Creación de una cafetera con los dos datos");
		cafe3 = new Ejercicio02 (750, 200);
		System.out.println(cafe3.getCapacidadMaxima()+" "+cafe3.getCantidadActual());
		System.out.println();
		
		System.out.println("Modificando la capacidad de la primera cafetera...");
		cafe1.setCapacidadMaxima(500);
		
		System.out.println("La capacidad máxima de la primera cafetera es: "+cafe1.getCapacidadMaxima());
		System.out.println("Modificando la cantidad actual de la primera cafetera...");
		cafe2.setCantidadActual(150);
		
		System.out.println("La cantidad actual de la segunda cafetera es: "+cafe2.getCantidadActual());
		System.out.println("Llenando la tercera cafetera...");
		cafe3.llenarCafetera();
		System.out.println(cafe3.getCapacidadMaxima()+" "+cafe3.getCantidadActual());
		
		System.out.println("Llenando taza de 100cc de la tecera cafetera...");
		cafe3.servirTaza(100);
		
		System.out.println(cafe3.getCapacidadMaxima()+" "+cafe3.getCantidadActual());
		System.out.println("Vaciando la tercera cafetera...");
		cafe3.vaciarCafetera();
		System.out.println(cafe3.getCapacidadMaxima()+" "+cafe3.getCantidadActual());
		
		System.out.println("Agregando cafe 300cc a la tercera cafetera...");
		cafe3.agregarCafe(300);
		System.out.println(cafe3.getCapacidadMaxima()+" "+cafe3.getCantidadActual());	
	}
}
