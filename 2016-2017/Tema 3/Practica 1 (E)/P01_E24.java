package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		Escribir un programa para mostrar mediante bucles los c�digos ASCII de 	*
//*			las letras may�sculas y min�sculas.									*
//*******************************************************************************
/**
 * 
 * @author bego�a
 *
 */

public class P01_E24 {
	public static void main(String[] a){
		char c;
		int n;
		for(c='A'; c<='z';c++){
			n=c;	
			System.out.println("EL C�DIGO ASCII DEL CARACTER "+c+" ES "+n+ " EN DECIMAL");
		}
	}

}
