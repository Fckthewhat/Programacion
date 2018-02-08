/**
 * Leer un array y escribirlo al derecho y al revés.
 * Nº de elementos se escriben desde teclado.
 * Ejemplo: 1 2 3 4 5 --> se escriben por teclado
 * 			5 4 3 2 1 --> resultado
 */
package Arrays_PRUEBAS_CLASE;
import java.util.Scanner;
public class EscribirDerechoYReves{

	public static void main(String[] args) {
		String hora = "123";
		int prueba;
		prueba= Integer.parseInt(hora.substring(0,2));
		System.out.println(prueba);
		//System.out.println(hora.substring(0,1));
		Scanner sc = new Scanner(System.in);
		int coleccion[], numValores;
		
		do{
			System.out.println("Teclea cuantos valores quieres introducir.");
			numValores=sc.nextInt();
		}
		
		while(numValores<0);
		
		coleccion = new int [numValores];
		for (int i=0; i<coleccion.length; i ++){
			System.out.println("Teclea un número.");
			coleccion[i] = sc.nextInt();
		}
		
		for(int var: coleccion)
			System.out.println(var);
			
		sc.close();

	}
}
/**
 * int[]vector;
 * vector=new vector int[5];
 * for (int=0;i<vector.length;i++){
 * 	vector[i]=i;
 * }
 * for (int var:vector){
 * 	syso(vector[var]);
 * }
 * for (int i=vector.lenght-1;i>=0;i--);
 * 	syso(vector[i]);
 * }
 */
