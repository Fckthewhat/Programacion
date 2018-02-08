package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		26.	Calcular todos los números de tres cifras tales que la suma de los	* 
//*			cubos de las cifras es igual al valor del número.					*
//*******************************************************************************

public class P01_E26 {
	public static void main( String[] a){
		int suma=0,aux;
		
		for(int n=100;n<1000;n++){
			suma=0;
			aux=n;
			for(int i=0;i<3;i++){
				suma+=Math.pow((aux%10),3);
				aux=aux/10;
			}
			if (suma==n)
			System.out.println(n);
		}
	}

}
