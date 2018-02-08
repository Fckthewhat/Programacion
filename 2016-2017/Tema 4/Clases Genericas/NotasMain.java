/**
 * Crear tres objetos: uno de tipo entero,
 * otro de tipo doble y otro de tipo byte.
 * Obtener la media de las notas de los alumnos (3 alumnos con 3 notas cada uno).
 */
package ClasesGenericas;
import java.util.Scanner;
public class NotasMain {

	public static void main (String []args){
	
		int nota1_1, nota1_2,nota1_3;
		double nota2_1,nota2_2,nota2_3;
		byte nota3_1,nota3_2,nota3_3;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Este programa calcula la media de las notas de 3 alumnos distintos.");
		System.out.println("");
		
		do{
			System.out.println("Introduzca las notas del primer alumno (numeros enteros): ");
			nota1_1=sc.nextInt();
			nota1_2=sc.nextInt();
			nota1_3=sc.nextInt();
		}while((nota1_1>=0&&nota1_2>=0&&nota1_3>=0) && (nota1_1<=10&&nota1_2<=10&&nota1_3<=10));
		
		do{
			System.out.println("Introduzca las notas del segundo alumno (numeros con decimales): ");
			nota2_1=sc.nextDouble();
			nota2_2=sc.nextDouble();
			nota2_3=sc.nextDouble();
		}while((nota2_1>=0&&nota2_2>=0&&nota2_3>=0) && (nota2_1<=10&&nota2_2<=10&&nota2_3<=10));
		
		do{
			System.out.println("Introduzca las notas del tercer alumno (numeros enteros): ");
			nota3_1=sc.nextByte();
			nota3_2=sc.nextByte();
			nota3_3=sc.nextByte();
		}while((nota3_1>=0&&nota3_2>=0&&nota3_3>=0) && (nota3_1<=10&&nota3_2<=10&&nota3_3<=10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**
		Notas<Integer>alumno1=new Notas<Integer>();
		Integer nota1_1=new Integer(5);
		Integer nota1_2=new Integer(8);
		Integer nota1_3=new Integer(8);
		
		Notas<Double>alumno2=new Notas<Double>();
		Double nota2_1=new Double(6.555555555555555);
		Double nota2_2=new Double(6.555555555555555);
		Double nota2_3=new Double(6.555555555555555);
		
		Notas<Byte>alumno3=new Notas<Byte>();
		Byte nota3_1=7;
		Byte nota3_2=7;
		Byte nota3_3=7;
		*/
		
	}
}