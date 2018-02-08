/**
 * 1-Notas medias de alumnos de DAM, nombres de 
 * alumnos se introducen por teclado. 
 * 2-Hay 6 asignaturas y 3 trimestres.
 */
package Arrays_PRUEBAS_CLASE;
import java.util.Scanner;
public class Array_Notas_Alumnos {

	public static void main(String[] args) {
		
		String NombreAlumno;
		char car,S,s,N,n;
		int Opcion=0;
		double nota1=0.0, nota2=0.0,nota3=0.0;
		double Nota[][][]=new double [3][3][6], notaMedia;
		final int ASIGNATURAS=6, TRIMESTRES=3, ALUMNOS=3;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Introduzca el nombre del alumno: ");
			NombreAlumno=sc.nextLine();
			System.out.println("");
			System.out.println("Ha elegido a: "+NombreAlumno);
			System.out.println("");
			System.out.println("Introduzca las notas del alumno: ");
			System.out.println("NOTA: Para notas con decimales pulsar tecla , ");
			nota1=sc.nextDouble();
			nota2=sc.nextDouble();
			nota3=sc.nextDouble();
			
			System.out.println("");
			System.out.println("Elija una opción que quiera realizar a continuación: ");
			System.out.println("1-Mostrar las Notas actuales del alumno seleccionado.");
			System.out.println("2-Mostrar la Media de las notas del alumno seleccionado.");
			System.out.println("3-Mostrar las Notas (por asignatura) del alumno seleccionado.");
			System.out.println("4-Mostrar las Notas (por trimestre) del alumno seleccionado.");
			Opcion=sc.nextInt();
			
			switch(Opcion){ 
				case 1: 
						System.out.println("");
				break;
				
				case 2: 
					
				break;
				
				case 3: 
					
				break;
				
				case 4:
					
				break;
			}
			System.out.println("¿Desea continuar?. Pulse S o N: ");
			car=sc.nextLine().toLowerCase().charAt(0);			
		}while(car=='s'||car=='S');	
	System.out.println("El programa llega a su fin. ");
	System.out.println("Gracias por utilizarme! :) ");
	sc.close();	
	}
}
