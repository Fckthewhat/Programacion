package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************************************
//*		6.	Cuatro enteros entre 0 y 100 representan las puntuaciones de un estudiante de un curso	* 
//*			de informática. Escribir un programa que encuentre la media de estas puntuaciones y que	*
//*			visualice una tabla de notas de acuerdo con el siguiente cuadro:						*
//*					Media puntuación																*
//*					90-100…… A 																	*	
//*					80-89……… B																		*
//*					70-79……… C 																		*
//*					60-69……… D																		*
//*					0-59………  E																		*
//***************************************************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E06 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int nota,suma=0;
		double media;
		char calificacion;
		for(int i=1;i<=4;i++){
			do{
				System.out.println("NOTA "+i+" (valor entre 0 y 100 ambos inclusive)");
				nota=teclado.nextInt();
			}while(nota<0 ||nota>100);
			suma+=nota;
		}
			media=suma/4.0;
			if (media<60)
				calificacion='E';
			else if(media<70)
					calificacion='D';
				else if(media<80)
						calificacion='C';
					else if (media<90)
							calificacion='B';
						else
							calificacion='A';
			System.out.println("LA MEDIA DEL ALUMNO ES "+media+" y su calificación es "+calificacion);
		
			teclado.close();
	}

}
