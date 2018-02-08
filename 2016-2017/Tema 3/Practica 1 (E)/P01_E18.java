package PRACTICA1_ENTRENAMIENTO;
//***********************************************************************
//*		18.	Escribir un programa que encuentre los tres primeros 		*
//*			n�meros perfectos pares y los tres primeros n�meros 		*
//*			perfectos impares. Un n�mero perfecto es un entero positivo *
//*			que es igual a la suma de todos los enteros positivos 		*
//*			(excluido �l mismo) que son sus divisores. El primer n�mero *
//*			perfecto es 6, ya que sus divisores son 1, 2, 3 y 1+2+3 = 6.*
//***********************************************************************
/**
 * 
 * @author bego�a
 *
 */

public class P01_E18 {
	public static void main(String[] a){
		long suma=0,cont=0,i;
	//Perfectos Pares
		System.out.print("\tN�MEROS PERFECTOS PARES\n************************************\n\t");
		for(i=2;cont<3;i+=2){
			suma=0;
			for(long j=1;j<i;j++)
				if(i%j==0)
					suma+=j;
			if(suma==i){
				cont++;
				System.out.print(i+"\t");
			}
		}
		//**************************************************************
		//OJO el proceso est� bien, pero el primer n�mero perfecto impar
		// tiene 44677235 cifras
		//**************************************************************
			System.out.print("\n\tN�MEROS PERFECTOS IMPARES\n**********************************\n\t");
			cont=0;
			for(i=1;cont<3;i+=2){
				suma=0;
				for(long j=1;j<i;j++)
					if(i%j==0)
						suma+=j;
				if(suma==i){
					cont++;
					System.out.print(i+"\t");
				}
			}
					
	}
}


