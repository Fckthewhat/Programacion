/**
 * Realiza las siguientes modificaciones en el programa anterior: 
 * A) Añade comentarios, entre otros:
 * 	• Nombre de clase, descripción y autor
 * 	• Comentario para la clase main y para cada una de las llaves de cierre
 * 
 * B) Utiliza el operador de asignación para inicializar las variables a
 * 	los valores que se indican en los mensajes.
 * 
 * C) Utiliza la secuencia de escape correspondiente para generar
 * 	un tabulador al principio de cada línea salvo de la primera
 * 
 * D) Mostrar el siguiente resultado:
 * 	• Usando solo la orden println:
 * 		----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
 * 		El valor de la variable casado es true
 * 		El valor de la variable MAXIMO es 999999
 * 		El valor de la variable diasem es 1
 * 		El valor de la variable diaanual es 300
 * 		El valor de la variable miliseg es 1298332800000
 * 		El valor de la variable totalfactura es 10350.678
 * 		El valor de la variable población es 6775235741
 * 		El valor de la variable sexo es M
 * 	• Usando solo la orden printf:
 * 		----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
 * 		El valor de la variable casado es true
 * 		El valor de la variable MAXIMO es 999999
 * 		El valor de la variable diasem es 1
 * 		El valor de la variable diaanual es 300
 * 		El valor de la variable miliseg es 1298332800000
 * 		El valor de la variable totalfactura es 10350,677734
 * 		El valor de la variable totalfactura en notación científica es 1.035068E+04
 * 		El valor de la variable población es 6775235741
 * 		El valor de la variable sexo es M 
 * @author Yo
 *
 */
package PRACTICA5_OBLIGATORIA;

public class PR05_EJER05 {

	public static void main(String[] args) {
		boolean casado = true;
		final int MAXIMO = 999999; 
		byte diasem = 1;
		short diaanual = 300;
		char sexo = 'M';
		long milisegundos = 1298332800000L;
		float totalfactura = 10350.677734F;
		long poblacion = 6775235741L;
		
		System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----" +
				"\n\tEl valor de la variable casado es " + casado +
				"\n\tEl valor de la variable MAXIMO es " + MAXIMO +
				"\n\tEl valor de la variable diasem es " + diasem +
				"\n\tEl valor de la variable diaanual es " + diaanual +
				"\n\tEl valor de la variable milisegundos es " + milisegundos +
				"\n\tEl valor de la variable totalfactura es " + totalfactura +
				"\n\tEl valor de la variable población es " + poblacion +
				"\n\tEl valor de la variable sexo es " + sexo);
		
		System.out.printf("\n %s \n \t %s %b \n \t %s %d \n \t %s %d \n \t %s %d \n \t %s %d"
				+ "\n \t %s %f \n \t %s %d \n \t %s %c" ,
				"----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----" ,
				"El valor de la variable casado es " , casado ,
				"El valor de la variable MAXIMO es " , MAXIMO ,
				"El valor de la variable diasem es " , diasem ,
				"El valor de la variable diaanual es " , diaanual ,
				"El valor de la variable milisegundos es " , milisegundos ,
				"El valor de la variable totalfactura es " , totalfactura ,
				"El valor de la variable población es " , poblacion ,
				"El valor de la variable sexo es " , sexo);
	}
}