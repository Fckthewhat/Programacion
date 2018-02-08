package PRACTICA4_ENTRENAMIENTO;
/**
 * Declara dos variables numéricas (con el valor que desees), muestra por
 * consola la suma, resta, multiplicación, división y módulo (resto de la
 * división).
 * @author diurno
 *
 */
public class P04_E11 {

	public static void main(String[] args) {
		int entero1 = 13, entero2 = 23;
		
		System.out.println("La suma de los dos números es " + (entero1 + entero2));
		System.out.println("La resta de los dos números es " + (entero1 - entero2));
		System.out.println("El producto de los dos números es " + entero1 * entero2);
		System.out.println("El cociente de los dos números es " + entero1 / entero2);
		System.out.println("El resto de los dos números es " + entero1 % entero2);
		
		// \n es como poner System.out.println (frase x). Es un salto de línea.
		// se podría hacer también así: 
		//System.out.println("La suma de los dos números es " + (entero1 + entero2) + "\nLa resta de los dos números es " + (entero1-entero2) + .....);
	}
}