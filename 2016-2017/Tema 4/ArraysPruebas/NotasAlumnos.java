/**
 * Lea las notas de los alumnos (por teclado) y calcule:
 * 1-Media del grupo
 * 2-Cuántos alumnos hay con nota superior a la media
 * 3-Cuántos alumnos hay con nota inferior a la media
 */
package Arrays_PRUEBAS_CLASE;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class NotasAlumnos {

	public static void main(String[] args) {
		
		int nAlumnos,cont=0, Media;
		double Nota;
		Scanner sc=new Scanner(System.in);
				
		do {
			System.out.println("Introduzca número de alumnos (mayor que 0): ");
			nAlumnos=sc.nextInt();
		}while(nAlumnos>=1);
		
		do{
			System.out.println("Introduzca notas de los alumnos (números positivos): ");
			Nota=sc.nextDouble();
		}while(Nota<0);
		// por terminar....
	}
}
/**
 * SOLUCIÓN DE BEGOÑA:
 * 
 *package Arrays_pruebas_clase;
 *import java.util.Scanner;
 * public class NotasAlumnos {
 * 	public static void main(String[] args) {
 * 
 * 		int nAlumnos;
 *		double Notas;
 *		Scanner sc=new Scanner(System.in);
 * 		System.out.println ("Introduzca número de alumnos: ");
 * 		nAlumnos=sc.nextInt();
 * 		while (nalumnos<=0){
 * 			System.out.println("Error");
 * 			System.out.println ("Introduzca número alumnos: ");
 * 			nAlumnos=sc.nextInt();
 * 		}
 * 		Notas=new int[nAlumnos];
 * 		for (int i=0;i<nalumnos;i++){
 * 			System.out.println ("Introduce notas entre 1 y 10: ");
 * 			Notas=sc.nextInt();
 * 
 * 			while (notas<1 || notas>10){
 * 				System.out.println ("Error");
 * 				System.out.println ("Introduce nota/s entre 1 y 10: ");
 * 				Notas=sc.nextInt();
 * 			}
 * 		}
 * 		for (int i=0;i<nalumnos; i++){
 * 			System.out.println(notas[i]+"");
 * 		}
 * 		for (int var:notas){
 * 			System.out.println (var+"");
 * 		}
 * 		System.out.println();
 * 
 * 		double Suma=0,Media;
 * 		for (int i=0;i<nAlumnos;i++){
 * 			Suma+=Notas[i];
 * 			Media=Suma/nAlumnos;
 * 		}
 * 		int Sup=0,Inf=0;
 * 		for (int i=0;i<nalumnos;i++){
 * 			if (notas[i]>media)
 * 				supp++;
 * 			if (notas[i]<media)
 * 				inf++;
 * 		}
 * 		System.out.println ("Media: "+Media+"\nNumero de alumnos con nota superior a la media es: "+Sup+
 * 		"\nNumero de alumnos con nota inferior a la media es: "+Inf);
 * 	}
 * }
 */
