/* Encontrar y mostrar todos los números de cuatro cifras que cumplan la 
 * condición de que la suma de las cifras de orden impar es igual a la suma 
 * de las cifras de orden par.
 * 
 * @Fckthewhat
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		
		int i,sumpares,sumimpares;
		
		for(i = 1000;i<10000; i++) {
			sumpares = i % 10 + i % 1000 / 100;
			sumimpares = i / 1000 + i % 100 / 10;
			System.out.print(sumpares == sumimpares ? "\n" + i : "");
		}
	}
}