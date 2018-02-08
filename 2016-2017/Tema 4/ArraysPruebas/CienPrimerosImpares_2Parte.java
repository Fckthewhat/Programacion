/*
 * crea e inicializa un array con los 100 primeros naturales impares
 * */
package Arrays_PRUEBAS_CLASE;

public class CienPrimerosImpares_2Parte {

	public static void main(String[] args) {
		int numerosNaturales [], numero=1, contadorMultiplos=0, contadorNoMultiplos=0;
		numerosNaturales = new int [100];
		for (int i=0; i<numerosNaturales.length; i++){
			numerosNaturales[i]=numero;
			numero+=2;
		}
		
		for (int i=0; i<numerosNaturales.length;i++)
			if (numerosNaturales[i]%7==0)
				contadorMultiplos++;
		System.out.println(contadorMultiplos);
		
		//MEDIA MULTIPLOS DE 7
		int suma7=0; int sumaNo7=0;
		for (int i=0; i<numerosNaturales.length; i++){
			if (numerosNaturales[i]%7==0){
				suma7+=numerosNaturales[i];
				contadorMultiplos++;
			}
			else{
				sumaNo7+=numerosNaturales[i];
				contadorNoMultiplos++;
			}	
		}
		System.out.println("La media de los multiplos de 7 es:" + (suma7/contadorMultiplos));
		System.out.println("La media de los NO multiplos de 7 es: " + (sumaNo7/contadorNoMultiplos));
		
		for (int i=0;i<numerosNaturales.length; i++){
			
		}		
	}
}
