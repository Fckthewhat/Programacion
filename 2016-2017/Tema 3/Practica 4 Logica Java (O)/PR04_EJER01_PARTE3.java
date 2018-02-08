package P04_TEMA3_LOGICAJAVA.src;

public class PR04_EJER01_PARTE3 {

	public static void main(String[] args) {
		int suma = 0;
		while (suma < 100)
			suma += 5;
			System.out.println(suma);
	}
}

//La salida de esta aplicación sería: Va aumentando el valor de suma de 5 en 5 (desde su valor inicial que es 0), hasta que suma ya no es <100,
//con lo que no entraría dentro del while y escribiría el último valor conocido de suma, en este caso:100.
