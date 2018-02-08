/**
 * Crear un array de 1000 enteros, leer un entero y 
 * comprobar que ese entero esté dentro del array.
 */
package Arrays_PRUEBAS_CLASE;
import java.util.Scanner;

public class Array_1000_Enteros_Mio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		boolean coincidencias=false;
		int array[]=new int [1000];
		
		for (int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*1000+1);
		}
		System.out.println("Introduzca un número del 0 al 1000 (para comprobar si coincide con algún elemento del array): ");
		numero=sc.nextInt();
		
		for (int i=0;i<array.length; i++){ //otra opción mas abajo en comentarios
			if(numero==array[i])
				coincidencias=true;
		}
		System.out.println((coincidencias? "El programa no encontró coincidencias" : "El programa encontró coincidencias"));
		
		sc.close();
	}
}
/**
*for (int i=0;i<1000 && numero!=[i];i++)
*	if(numero==x[i]);
*/