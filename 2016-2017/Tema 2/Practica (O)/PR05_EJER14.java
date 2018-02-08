package PRACTICA5_OBLIGATORIA;

import java.util.Scanner;

/**
 * Programa que lea tres números enteros H, M, S que contienen hora,
minutos y segundos respectivamente, y comprueba si la hora que
indican es una hora válida. (reloj de 24 horas)
 * @author Javier
 */

public class PR05_EJER14 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		byte hs, ms, ss;
		
		System.out.println("Teclee horas, minutos y segundos.");
		hs = sc.nextByte();
		ms = sc.nextByte();
		ss = sc.nextByte();
		
		System.out.println(hs >= 0 && hs <= 23 && ms >= 0 && ms <= 59 && ss >= 0 && ss <= 59?
				"Las " + hs + ":" + ms + ":" + ss + " es una hora válida." :
				"Las " + hs + ":" + ms + ":" + ss + " no es una hora válida.");
		
		sc.close();
		
	}
}
