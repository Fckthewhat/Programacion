/* Crea una clase NIF que se usará para mantener DNIs con su  correspondiente letra. Los 
 * atributos serán el número de DNI (entero largo) y la letra que le corresponde. La clase 
 * dispondrá de los siguientes métodos: 
 * 		1.-Constructor predeterminado que inicialice el nº de DNI a 0 y la letra a espacio 
 * 		en blanco (será un NIF no válido). 
 * 		2.-Constructor que reciba el DNI y establezca la letra que le corresponde. 
 * 		3.-Accedentes y mutador para el número de DNI (que ajuste automáticamente la letra). 
 * 		4.-leer(): que pida el número de DNI (ajustando automáticamente la letra) 
 * 		5.-Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en 
 * 		mayúscula; por ejemplo: 00395469-F).
 * La letra se calculará con un método auxiliar (privado) de la siguiente forma: se 
 * obtiene el resto de la división entera del número de DNI entre 23 y se usa la 
 * siguiente tabla para obtener la letra que corresponde: 
 * 
 * 		0 - T 1 - R 2 - W 3 - A 4 - G 5 - M 6 – Y 7 - F 8 - P 9 - D 10 - X 11 - B 12 - N 13 – J 14 - Z 15 - S
 * 		16 - Q 17 - V 18 - H 19 - L 20 – C 21 - K 22 – E 
 */
import java.util.Scanner;

public class Ejercicio03 {

		private long numeroDNI;
		private char letra;
		
		public Ejercicio03() {
			numeroDNI = 0;
			letra = ' ';
		}
		
		public Ejercicio03(long dni) {
			this.numeroDNI = dni;
			calcularLetraDNI ();
		}
		
		private void calcularLetraDNI () {
			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			long resto = numeroDNI % 23;
			letra = letras.charAt((int)resto);
			System.out.println("La letra de tu DNI es: "+letra);
			System.out.println();
			mostrar();
		}

		public long getDni() {
			return numeroDNI;
		}

		public void setDni(long dni) {
			this.numeroDNI = dni;
			calcularLetraDNI ();
		}

		public char getLetra() {
			return letra;
		}
		
		public void leer() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce numero de DNI: ");
			numeroDNI = sc.nextLong();
			System.out.println();
			calcularLetraDNI();
			sc.close();
		}
		
		public void mostrar() {
			String nif = numeroDNI + "-" + letra;
			System.out.println("Tu DNI es: "+nif);
	}
}
