/**
 * Escribir un programa para que mediante funciones se llene una matriz de N filas por M columnas 
 * con Nº aleatorios reales, mostrar en pantalla la matriz, luego se sumen las diagonales de esta matriz.
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER07 {

	private Scanner sc;
	private int[][] mat;
	   
	   public EJER07(){}
	   
	   public void cargar() {
	       sc=new Scanner(System.in);
	       System.out.print("Introduzca número de filas de la matriz: ");
	       int filas=sc.nextInt();
	       System.out.print("Introduzca número de columnas de la matriz: ");
	       int columnas=sc.nextInt();
	       mat=new int[filas][columnas];
	       for (int x=0; x < mat.length; x++) {
	    	      for (int y=0; y < mat[x].length; y++) {
	    	        mat[x][y] = (int) (Math.random()*9+1);
	    	      }
	       }
	   }
}

// http://www.sc.ehu.es/sbweb/fisica/cursoJava/numerico/matrices/matriz/matriz.htm