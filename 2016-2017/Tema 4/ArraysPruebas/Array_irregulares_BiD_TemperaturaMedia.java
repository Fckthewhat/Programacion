package Arrays_PRUEBAS_CLASE;

public class Array_irregulares_BiD_TemperaturaMedia {

	public static void main(String[] args) {
		
		double tempMedia[][]=new double[12][];
		
		int anyo=2015,mes=0,sumaTemps=0,dia=0;
		
		//el for es el que da valores de longitud a las filas:
		for (mes=0;mes<tempMedia.length;mes++){
			//aqui comprobamos que el mes que inicializamos antes corresponde 
			//a algun mes valido y comprobamos si el año es bisiesto o no:
			switch(mes+1){ 
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				dia=31;
				break;
			case 4: case 6: case 9: case 11:
				dia=30;
				break;
			case 2: if(anyo % 4==0 || anyo % 4==0 && anyo % 100!=0)
						dia=29;
					else
						dia=28;
					break;
			}
			//Indicamos aquí la longitud de cada fila:
			tempMedia[mes]=new double [dia];
			
			//Aquí imprimiremos los valores que el for anterior ha realizado:
			for (dia=0; dia<tempMedia[mes].length;dia++){
				tempMedia[mes][dia]=(double)(Math.random()*40+6);
				sumaTemps+=tempMedia[mes][dia];
				System.out.printf("%s %d %s %d %s %.2f \n","La temperatura del día " , (dia+1), " del mes "
				,(mes+1)," fue: ",tempMedia[mes][dia]);	
			}
		}
		System.out.println("La temperatura media del año fue de: " +sumaTemps/365+"ºC.");
		
		/**
		 * double mesMedia=new double[12];
		 * for (int mes=0; mes<tempMedia.length; mes++){
		 * 		sumaTemp=0;
		 * 		for (int dia=0; dia<tempMedia[mes].length; dia++)
		 * 			sumaTemp+=tempMedia[mes][dia];
		 * 
		 * 		mesMedia[mes]=sumaTemp/tempMedia[mes].length;
		 * }
		 * int cont=0;
		 * for(int mes=0;mes<tempMedia.length;mes++){
		 * 	   cont=0;
		 * 	   for(int dia=0;dia<tempMedia[mes].length;dia++)
		 * 			if(tempMedia[mes][dia]>mesMedia[mes])
		 * 				cont++;
		 * 	   Syso (cont);
		 * }		 
		 */
		
	}
}
//terminar (mostrar cuantos dias de cada mes han tenido temperaturas superiores a la media general de temperaturas).