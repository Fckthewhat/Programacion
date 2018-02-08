/* Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad máxima 
 *  de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café 
 *  que hay en la cafetera). Implementa, al menos, los siguientes métodos: 
 *    1.-Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la 
 *    actual en cero (cafetera vacía). 
 *    2.-Constructor  con  la  capacidad  máxima  de  la  cafetera;  inicializa  la  cantidad 
 *    actual de café igual a la capacidad máxima. 
 *    3.-Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual 
 *    es mayor que la capacidad máxima de la cafetera, la ajustará al máximo. 
 *    4.-Accedentes y mutadores. 
 *    5.-llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad. 
 *    6.-servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si la 
 *    cantidad actual de café  “no  alcanza”  para  llenar  la  taza,  se  sirve  lo  que quede. 
 *    7.-vaciarCafetera(): pone la cantidad de café actual en cero. 
 *    8.-agregarCafe(int): añade a la cafetera la cantidad de café indicada. 
 */
public class Ejercicio02 {

	private int capacidadMaxima;
	private int cantidadActual;
	
	//Constructor por defecto con capacidad maxima establecida a 1000 y cantidad actual establecida a 0
	public Ejercicio02() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}
	
	//Constructor con la capacidad maxima de la cafetera. Iguala capacidad maxima entrante a la variable capacidad maxima. Inicializa cantidad actual a 0
	public Ejercicio02(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		cantidadActual = 0;
	}
	
	//Constructor con capacidad maxima y cantidad actual. Evalua si la cantidad actual es mayor que la capacidad maxima, entonces la cantidad actual es 
	//igual a la capacidad maxima, sino, la cantidad actual es igual a la cantidad actual.
	public Ejercicio02(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		if (cantidadActual > capacidadMaxima)
			this.cantidadActual = capacidadMaxima;
		else 
			this.cantidadActual = cantidadActual;
	}

	//Gets y sets
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		if (cantidadActual > capacidadMaxima)
			this.cantidadActual = capacidadMaxima;
		else 
			this.cantidadActual = cantidadActual;
	}
	
	//Método para llenar cafetera
	public void llenarCafetera () {
		cantidadActual = capacidadMaxima;
	}
	
	//Método que simula la acción de servir una taza con la capacidad introducida. Evalúa si la cantidad introducida 
	//es mayor que la cantidad que se posee, se establece a 0 la cantidad actual, sino, la cantidad actual será igual 
	//a la cantidad actual menos la cantidad introducida.
	public void servirTaza (int cantidad) {
		if (cantidad > cantidadActual)
			cantidadActual = 0;
		else 
			cantidadActual = cantidadActual - cantidad;
	}
	
	//Método que vacía la cafetera, estableciendo la cantidad actual de café en 0
	public void vaciarCafetera () {
		cantidadActual = 0;
	}
	
	//Método para agregar café con una cantidad entrante. Evalúa si la cantidad actual más la cantidad introducida es mayor que 
	//la capacidad máxima, si es así, la cantidad actual es igual que la capacidad maxima y sino, la cantidad actual es igual
	//a la cantidad actual más la cantidad introducida
	public void agregarCafe (int cantidad) {
		if (cantidadActual + cantidad > capacidadMaxima)
			cantidadActual = capacidadMaxima;
		else
			cantidadActual = cantidadActual + cantidad;
	}
}
