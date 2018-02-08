package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		25.	Encontrar y mostrar todos los números de cuatro cifras que cumplan 	*
//*			la condición de que la suma de las cifras de orden impar es igual 	*
//*			a la suma de las cifras de orden par.								*
//*******************************************************************************
/**
* 
* @author begoña
*
*/


public class P01_E25 {
	public static void main(String[] a){
		int sumaPar,sumaImpar;
		int aux, pos;//posición par o impar
		for(int i=1000;i<10000;i++){
			sumaPar=0;
			sumaImpar=0;
			aux=i;
			pos=1;
			while(aux>0){
				if(pos%2==0)
					sumaPar+=(aux%10);
				
				else
					sumaImpar+=(aux%10);
				pos++;
				aux/=10;
			}
			if(sumaPar==sumaImpar)
				System.out.println(i+"\t");
		}
	}

}
