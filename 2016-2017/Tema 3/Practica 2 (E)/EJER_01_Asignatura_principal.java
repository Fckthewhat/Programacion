/**
 * Ejercicio aparte de  EJER_01_Asignatura.java
 * Instanciar 2 objetos (constructor por defecto y constructor de clase)
 * Escribir los valores de los atributos de los 2 objetos.
 * Cambiar la asignatura y la nota del objeto instanciados por defecto 
 * Escribir número de aprobados en asignatura.
 * Escribir nombre asignatura y número de aprobados.
 */
package PRACTICA2_ENTRENAMIENTO;
import java.util.Scanner;

public class EJER_01_Asignatura_principal {

	public static void main (String[]args){
		//*****Instanciar dos objetos de la clase asignatura
		Asignaturas asignatura=new Asignaturas();
		Asignaturas asignatura1=new Asignaturas("programación",95);
				
				//escribir los valores de los atributos de cada objeto
				//Para el objeto asignatura
				System.out.println("ASIGNATURA: "+asignatura.getAsignatura()+
						"\nNOTA: "+asignatura.getNota());
				System.out.println("EL ALUMNO ESTÁ "+asignatura.aprobado_susp());
				System.out.println("**********************************");
				//Para el objeto asignatura1
						System.out.println("ASIGNATURA: "+asignatura1.getAsignatura()+
								"\nNOTA: "+asignatura1.getNota());
						System.out.print("EL ALUMNO ESTÁ "+asignatura1.aprobado_susp());
						
				//cambiamos los valores del objeto invocado por defecto
				Scanner teclado=new Scanner(System.in);
				System.out.println("\nintroducir nombre de la asignatura");
				asignatura.setAsignatura(teclado.nextLine());
				do{
					System.out.println("NOTA???(VALOR ENTRE 0_100)");
					asignatura.setNota(teclado.nextInt());
				}while(asignatura.getNota()<0||asignatura.getNota()>100);
				
				//Para el objeto asignatura
				System.out.println("ASIGNATURA: "+asignatura.getAsignatura()+
							"\nNOTA: "+asignatura.getNota());
				System.out.println("EL ALUMNO ESTÁ "+asignatura.aprobado_susp());
				System.out.println("**********************************");
				//Para el objeto asignatura1
				System.out.println("ASIGNATURA: "+asignatura1.getAsignatura()+
								"\nNOTA: "+asignatura1.getNota());
				System.out.print("EL ALUMNO ESTÁ "+asignatura1.aprobado_susp());
								
			
			// numero de aprobados
				int aprobados=0;
				if(asignatura.getAsignatura().equalsIgnoreCase("programación"))
					if (asignatura.getNota()>60)
					aprobados++;
				if(asignatura1.getAsignatura().equalsIgnoreCase("programación"))
					if (asignatura1.getNota()>60)
					aprobados++;
				System.out.println("\naprobados en programación "+aprobados);
				
	}

	
}
