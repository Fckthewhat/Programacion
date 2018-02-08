package PRACTICA4_ENTRENAMIENTO;
/**
 * Programa Java que declare una variable entera N y asígnale un valor. A
continuación escribe las instrucciones que realicen lo siguiente:
Incrementar N en 77, Decrementarla en 3, Duplicar su valor. Mostrará
cada uno de los resultados.
 * @author diurno
 *
 */
public class P04_E10 {

	public static void main(String[] args) {
		int n = 13;
		System.out.println("N vale: " + n);
		n += 77;
		System.out.println("N vale: " + n);
		n -= 3;
		System.out.println("N vale: " + n);
		n *= 2;
		System.out.println("N vale: " + n);
	}
}