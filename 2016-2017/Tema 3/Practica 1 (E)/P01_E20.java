package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************
//*		20.	Escribir un programa que encuentre el primer número primo 	*
//*			introducido por medio del teclado.							*
//***********************************************************************
/**
 * 
 * @author begoña
 *
 */

import java.util.Scanner;
public class P01_E20 {
	public static void main(String[] a){
		int n;
		int contDivisores;
		Scanner teclado=new Scanner(System.in);
		do{
			do{
				System.out.println("INTRODUCE UN VALOR ENTERO POSITIVO");
				n=teclado.nextInt();
			}while(n<=0);
	//comprobación de primos(entre 1 y n hay exactamente dos divisores
			contDivisores=0;
			for(int i=1;i<=n;i++)
				if(n%i==0)
					contDivisores++;
		}while(contDivisores!=2);
		System.out.println(n+" ES UN NÚMERO PRIMO");
		teclado.close();
	}
	

}
