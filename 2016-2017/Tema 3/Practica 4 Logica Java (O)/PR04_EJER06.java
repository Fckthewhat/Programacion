//Calcule n términos de la sucesión de Fibonacci con n > 0 suministrado por el usuario.
//La sucesión de Fibonacci viene dada por:
//F 0 = 0
//F 1 = 1
//F n = F n−1 + F n−2
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;

public class PR04_EJER06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la cantidad de términos de la serie Fibonacci: ");
		int i, n=sc.nextInt();
		long F0=0, F1=1, F2;
		System.out.println("F0=0");
		for (i=0; i<n; i++){
			System.out.println("F" + (i+1)+ "=" + F1);
			F2=F0+F1;
			F0=F1;
			F1=F2;
		}
		System.out.println();
	sc.close();
	}
}
