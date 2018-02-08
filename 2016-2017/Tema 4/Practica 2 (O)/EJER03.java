/**
 * Desarrollar un programa que utilice métodos para 
 * generar dos vectores A y B de 20 valores cada uno, tal que:
 *  
 * 		a)Mediante una función calcular C(i)=A(i)+B(i) 
 * 
 * 		b) Mediante otra imprimir en pantalla los vectores A,B,C, 
 * 		incluyendo los encabezados que creas conveniente
 * 
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vA,vB,vC;
		System.out.print("Ingrese tamaño del vector A:");
		vA = sc.nextInt();
		int vectorA[] = new int[vA];
		
		for(int i1=0; i1<vectorA.length; i1++){
		      System.out.print("\nIngrese Numero Entero de la Posicion"+" " +i1+":");
		      vectorA[i1]=sc.nextInt();
		}
		
		System.out.print("\nIngrese tamaño del vector B:");
		vB = sc.nextInt();
		int vectorB[] = new int[vB];
		for(int i2=0; i2<vectorB.length; i2++){
			System.out.print("\nIngrese Numero Entero de la Posicion"+" " +i2+":");
		    vectorB[i2]=sc.nextInt();
		}
		vC=vA;
		if (vB > vA)
		   vC=vB;
		int[] vector3 = new int[vC];
		for(int i3=0; i3<vector3.length; i3++){
		      int valv1 = 0;
		      if (vectorA.length > i3){
		       valv1 = vectorA[i3];
		      }
		      int valv2 = 0;
		            if (vectorB.length > i3){
		            	valv2 = vectorB[i3];
		            }
		            vector3[i3]=valv1+valv2;
		            System.out.println("\nLa Suma de la Posicion"+" "+i3+" "+ "es:"+vector3[i3]);                      
		} 
   }
}