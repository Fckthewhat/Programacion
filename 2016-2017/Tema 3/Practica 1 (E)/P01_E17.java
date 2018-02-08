package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************
//*		17.	Escribir un programa que determine y escriba la descomposición	*
//*			factorial de los números enteros comprendidos entre 1 900 y 	*
//*			2 000.															*
//***************************************************************************
/**
 * 
 * @author begoña
 *
 */

public class P01_E17 {
	public static void main(String[] a){
		int aux,cont;
		for(int numero=1900;numero<=2000;numero++){
			aux=numero;
			cont=0;
			System.out.print(numero+"=");
			for(int i=2;i<numero;i++)
				while(aux%i==0){
					System.out.print(i+"  ");
					aux/=i;
					cont++;
				}
			if(cont==0)
				System.out.print("primo");
			System.out.print("\n");
		}
	}
}

	