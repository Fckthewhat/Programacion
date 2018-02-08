/**
 * Una fruter�a ofrece las manzanas con descuento seg�n la siguiente tabla:
NUM. DE KILOS COMPRADOS          % DESCUENTO
0 � 2                                                                0%,
2.01 � 5                                                         10%,
5.01 � 10                                                      15%,
10.01 en adelante                                     20%
Determinar cu�nto pagara una persona que compre manzanas es esa fruter�a
 */
package P04_TEMA3_LOGICAJAVA.src;
import java.util.Scanner;
public class PR04_EJER08 {

	public static void main(String[] args) {
		
		double NumKilos, TotalCompra;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el coste total de la compra: ");
		TotalCompra=sc.nextFloat();
		System.out.println("Introduzca el n�mero de kilos que se han comprado: ");
		NumKilos=sc.nextFloat();
		
		if(NumKilos>=0 && NumKilos<=2){
			System.out.println("El total de la compra ser�: "+TotalCompra+" euros. ");
		}
		if (NumKilos>=2.01 && NumKilos<=5){
			TotalCompra=TotalCompra-(float)(TotalCompra*0.1);
			System.out.println("El total de la compra ser�: "+TotalCompra+" euros. ");
		}
		if (NumKilos>=5.01 && NumKilos<=10){
			TotalCompra=TotalCompra-(float)(TotalCompra*0.15);
			System.out.println("El total de la compra ser�: "+TotalCompra+" euros. ");
		}
		if (NumKilos>=10.01){
			TotalCompra=TotalCompra-(float)(TotalCompra*0.2);
			System.out.println("El total de la compra ser�: "+TotalCompra+" euros. ");
		}
	sc.close();
	}
}
