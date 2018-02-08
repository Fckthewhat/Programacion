/*
 *  Escriba un programa que calcule la frecuencia de aparición de las 
 *  vocales de un texto proporcionado por el usuario. Esta solución se debe 
 *  presentar en forma de histograma, por ejemplo: 
 *      a   15     ***************  
 *      e    8     ********  
 */
package ArraysCadenas;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = 0, c2 = 0,c3 = 0, c4 = 0, c5 = 0;
        String cadena, m1="", m2="", m3="", m4="", m5="";

        System.out.println("Introduzca una cadena a comprobar: ");
        cadena = sc.nextLine();
        cadena = cadena.toLowerCase();
        
        for(int i =0;i<cadena.length();i++ ) {
        	if(cadena.charAt(i) == 'a') {
        		c1++;
        		m1 += "*";
        	}
        	if(cadena.charAt(i) == 'e') {
        		c2++;
        		m2 += "*";
        	}
        	if(cadena.charAt(i) == 'i') {
        		c3++;
        		m3 += "*";
        	}
        	if(cadena.charAt(i) == 'o') {
        		c4++;
        		m4 += "*";
        	}
        	if(cadena.charAt(i) == 'u') {
        		c5++;
        		m5 += "*";
        	}
        }
        System.out.println("");
        System.out.println("a"+"    "+c1+"    "+m1);
        System.out.println("e"+"    "+c2+"    "+m2);
        System.out.println("i"+"    "+c3+"    "+m3);
        System.out.println("o"+"    "+c4+"    "+m4);
        System.out.println("u"+"    "+c5+"    "+m5);
        sc.close();
	}
}
