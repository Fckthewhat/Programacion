package PRACTICA4_ENTRENAMIENTO;
/**
 * Programa java que realice lo siguiente: declarar una variable N de tipo
int, una variable A de tipo double y una variable C de tipo char y asigna a
cada una un valor. A continuación muestra por pantalla: El valor de cada
variable, la suma de N + A, la diferencia de A - N, el valor numérico
correspondiente al carácter que contiene la variable C.
 * @author diurno
 *
 */
public class P04_E09 {

	public static void main(String[] args) {
		int n = 4;
		double a = 3.6;
		char c = 'ñ';
		
		System.out.println("El valor de n es: " + n);
		System.out.println("El valor de a es: " + a);
		System.out.println("El valor de c es: " + c);
		System.out.println("La suma de n + a es: " + (n + a));
		System.out.println("La diferencia entre a - n es: " + (a - n));
		System.out.println("El valor numérico de c es: " + (int)c);
	}
}