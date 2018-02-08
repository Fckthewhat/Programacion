/* Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad m�xima 
 *  de caf� que puede contener la cafetera) y cantidadActual (la cantidad actual de caf� 
 *  que hay en la cafetera). Implementa, al menos, los siguientes m�todos: 
 *    1.-Constructor predeterminado: establece la capacidad m�xima en 1000 (c.c.) y la 
 *    actual en cero (cafetera vac�a). 
 *    2.-Constructor  con  la  capacidad  m�xima  de  la  cafetera;  inicializa  la  cantidad 
 *    actual de caf� igual a la capacidad m�xima. 
 *    3.-Constructor con la capacidad m�xima y la cantidad actual. Si la cantidad actual 
 *    es mayor que la capacidad m�xima de la cafetera, la ajustar� al m�ximo. 
 *    4.-Accedentes y mutadores. 
 *    5.-llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad. 
 *    6.-servirTaza(int): simula la acci�n de servir una taza con la capacidad indicada. Si la 
 *    cantidad actual de caf�  �no  alcanza�  para  llenar  la  taza,  se  sirve  lo  que quede. 
 *    7.-vaciarCafetera(): pone la cantidad de caf� actual en cero. 
 *    8.-agregarCafe(int): a�ade a la cafetera la cantidad de caf� indicada. 
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
	
	//M�todo para llenar cafetera
	public void llenarCafetera () {
		cantidadActual = capacidadMaxima;
	}
	
	//M�todo que simula la acci�n de servir una taza con la capacidad introducida. Eval�a si la cantidad introducida 
	//es mayor que la cantidad que se posee, se establece a 0 la cantidad actual, sino, la cantidad actual ser� igual 
	//a la cantidad actual menos la cantidad introducida.
	public void servirTaza (int cantidad) {
		if (cantidad > cantidadActual)
			cantidadActual = 0;
		else 
			cantidadActual = cantidadActual - cantidad;
	}
	
	//M�todo que vac�a la cafetera, estableciendo la cantidad actual de caf� en 0
	public void vaciarCafetera () {
		cantidadActual = 0;
	}
	
	//M�todo para agregar caf� con una cantidad entrante. Eval�a si la cantidad actual m�s la cantidad introducida es mayor que 
	//la capacidad m�xima, si es as�, la cantidad actual es igual que la capacidad maxima y sino, la cantidad actual es igual
	//a la cantidad actual m�s la cantidad introducida
	public void agregarCafe (int cantidad) {
		if (cantidadActual + cantidad > capacidadMaxima)
			cantidadActual = capacidadMaxima;
		else
			cantidadActual = cantidadActual + cantidad;
	}
}
