package PRACTICA4_ENTRENAMIENTO;
/**
 * Declara dos variables num�ricas (con el valor que desees), muestra por
 * consola la suma, resta, multiplicaci�n, divisi�n y m�dulo (resto de la
 * divisi�n).
 * @author diurno
 *
 */
public class P04_E11 {

	public static void main(String[] args) {
		int entero1 = 13, entero2 = 23;
		
		System.out.println("La suma de los dos n�meros es " + (entero1 + entero2));
		System.out.println("La resta de los dos n�meros es " + (entero1 - entero2));
		System.out.println("El producto de los dos n�meros es " + entero1 * entero2);
		System.out.println("El cociente de los dos n�meros es " + entero1 / entero2);
		System.out.println("El resto de los dos n�meros es " + entero1 % entero2);
		
		// \n es como poner System.out.println (frase x). Es un salto de l�nea.
		// se podr�a hacer tambi�n as�: 
		//System.out.println("La suma de los dos n�meros es " + (entero1 + entero2) + "\nLa resta de los dos n�meros es " + (entero1-entero2) + .....);
	}
}