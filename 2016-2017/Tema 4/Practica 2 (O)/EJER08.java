/**
 * Realizar un programa para intercambiar dos filas (columnas) de una matriz.
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER08 {
	
	   private Scanner sc;
	   private int[][] mat;
	   
	   public EJER08(){}
	   
	   public void cargar() {
	       sc=new Scanner(System.in);
	       System.out.print("Introduzca número de filas de la matriz: ");
	       int filas=sc.nextInt();
	       System.out.print("Introduzca número de columnas de la matriz: ");
	       int columnas=sc.nextInt();
	       mat=new int[filas][columnas];
	       for(int f=0;f<mat.length;f++) {
	           for(int c=0;c<mat[f].length;c++) {
	               System.out.print("Ingrese elementos de la matriz: ");
	               mat[f][c]=sc.nextInt();
	           }
	       }
	   }    
	   public void intercambiar() {
	       for(int c=0;c<mat[0].length;c++) {
	           int aux=mat[0][c];
	           mat[0][c]=mat[1][c];
	           mat[1][c]=aux;
	       }
	   }
	   public void imprimir() {
	       for(int f=0;f<mat.length;f++) {
	           for(int c=0;c<mat[f].length;c++) {
	               System.out.print(mat[f][c]+" ");
	           }
	           System.out.println();
	       }
	   }    
	   public static void main(String[] ar){
	       EJER08 matriz=new EJER08();
		   matriz.cargar();
	       matriz.intercambiar();
	       matriz.imprimir();
	   }   
}
	

	
	

