/*
 *  Escribir un programa que cuente el número de palabras en un texto, que 
 *  tengan al menos cuatro vocales diferentes.  
 */
package ArraysCadenas;

import java.util.Scanner;

public class Ejercicio24 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena,palabra = "";
		int cont=0, c1=0, c2=0, c3=0, c4=0, c5=0, vocales;
		
		System.out.println("Introduce una cadena: ");
		cadena = sc.nextLine();
		
		cadena = cadena.toLowerCase();
	    cadena += " ";
	    for(int i = 0;i<cadena.length();i++){
	        palabra += cadena.charAt(i);
	        if(cadena.charAt(i) == ' '){
	            palabra = palabra.trim();
	            for(int j = 0;j<palabra.length();j++){
	                if(palabra.charAt(j) == 'a'){
	                	c1++;
			                if(c1 > 1){
			                    c1 = 1;
			                }
	                }
			        if(palabra.charAt(j) == 'e'){
			           c2++;
			              if(c2 > 1){
			                  c2 = 1;
			                }
			          }
			        if(palabra.charAt(j) == 'i'){
			            c3++;
			            if(c3 > 1){
			                c3 = 1;
			            }
			        }
			        if(palabra.charAt(j) == 'o'){
			            c4++;
			            if(c4 > 1){
			               c4 = 1;
			            }
			        }
			        if(palabra.charAt(j) == 'u'){
			            c5++;
			            if(c5 > 1){
			               c5 = 1;
			            }
			        }
			    }
	            palabra = "";
	            vocales = c1 + c2 + c3 + c4 + c5;
	            c1=0; c2=0; c3=0; c4=0; c5=0;
	            if(vocales >= 4){
	                cont++;               
	            }
	        }
	    }       
	    System.out.println("Las palabras son: "+cont);
	    sc.close();
	}
}