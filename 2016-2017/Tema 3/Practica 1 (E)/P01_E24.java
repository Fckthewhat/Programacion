package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*		Escribir un programa para mostrar mediante bucles los códigos ASCII de 	*
//*			las letras mayúsculas y minúsculas.									*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */

public class P01_E24 {
	public static void main(String[] a){
		char c;
		int n;
		for(c='A'; c<='z';c++){
			n=c;	
			System.out.println("EL CÓDIGO ASCII DEL CARACTER "+c+" ES "+n+ " EN DECIMAL");
		}
	}

}
