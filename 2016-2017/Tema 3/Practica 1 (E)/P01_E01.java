package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************************************
//*		1.	Escribir un programa que lea dos enteros de tres dígitos y calcule e imprima producto, 	*
//*			cociente y resto cuando el primero se divide entre el segundo.							*
//***************************************************************************************************
/**
 * 
 * @author begoña
 *
 */
import java.util.Scanner;
public class P01_E01 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num1,num2;
		do{
			System.out.println("INTRODUZCA UN NÚMERO DE TRES CIFRAS");
			num1=teclado.nextInt();
		}while (num1<100 ||num1>999);
		do{
			System.out.println("INTRODUZCA UN NÚMERO DE TRES CIFRAS");
			num2=teclado.nextInt();
		}while (num2<100 ||num2>999);
		
//salida
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"x"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
				
		teclado.close();
	}

}
