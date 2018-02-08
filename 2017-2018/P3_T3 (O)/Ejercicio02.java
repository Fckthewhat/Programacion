/* Dada una secuencia de n�meros terminada en cero (0), elaborar un 
 * algoritmo para calcular el porcentaje y la suma de los n�meros impares, 
 * el porcentaje y la suma de los n�meros pares, la suma de todos los n�meros 
 * y cuantos n�meros fueron ingresados, muestre finalmente estos resultados al usuario
 * 
 * @Fckthewhat
 */
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num,sumaimp,sumapar,contimp,contpar,totalnum,suma;
		double porcpar,porcimp;
		sumaimp=0;
		sumapar=0;
		totalnum=0;
		contimp=0;
		contpar=0;
		suma=0;
		
		System.out.println("Introduce un n�mero (0 para fin): ");
		num = sc.nextInt();
		
		while(num != 0){
			if(num % 2 == 1){
				contimp++;
				sumaimp = sumaimp + num;
			}else{
				contpar++;
				sumapar = sumapar + num;
			}
			totalnum++;
			suma = suma + num;
			System.out.println("Introduce otro n�mero (0 para fin): ");
			num = sc.nextInt();
		}
		
		totalnum = contpar + contimp;
		
		if(totalnum == 0)
			System.out.println("Error, NO hay n�meros");
		else {
			suma = sumapar + sumaimp;
			porcpar = (double) contpar / totalnum * 100;
			porcimp = (double) contimp / totalnum * 100;
			System.out.println();
			System.out.println("% de impares: "+porcimp+"%"
			+"\nSuma de impares: "+sumaimp
			+"\n"
			+"\n% de pares: "+porcpar+"%"
			+"\nSuma de pares: "+sumapar
			+"\n"
			+"\nSuma total: "+suma
			+"\n"
			+"\nTotal de n�meros: "+totalnum);
		}
		sc.close();
	}
}