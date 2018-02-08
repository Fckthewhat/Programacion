package PRACTICA1_ENTRENAMIENTO;
//*******************************************************************************
//*11.	Redactar y ejecutar un programa que simule una calculadora simple y que	* 
//*		lea 2 enteros y un carácter. Si el carácter es un signo +, debe imprimir*
//*		la suma; si es un signo −, la diferencia; si es *, el producto; si es /,*
//*		el cociente; y si es %, el resto. Utilizar la sentencia switch.			*
//*******************************************************************************
/**
 * 
 * @author begoña
 *
 */
import java.util.Scanner;
public class P01_E11 {
	public static void main(String[] a){
		Scanner teclado=new Scanner(System.in);
		int operando1,operando2;
		char operador,respuesta;
		do{
			System.out.println("INTRODUCE LOS VALORES CON LOS QUE OPERAR");
			System.out.println("PRIMER OPERADOR");
			operando1=teclado.nextInt();
			System.out.println("SEGUNDO OPERADOR");
			operando2=teclado.nextInt();
			teclado.nextLine();//limpiamos el buffer
			do{
				System.out.println("INTRODUCE OPERACIÓN +, -, *, /, %(RESTO)");
				operador=teclado.nextLine().charAt(0);
			}while(operador!='+'&&operador!='-'&&operador!='*'&&operador!='/'&&operador!='%');
			switch(operador){
				case '+':System.out.println(operando1+"+"+operando2+"="+(operando1+operando2));
					break;
				case '-':System.out.println(operando1+"-"+operando2+"="+(operando1-operando2));
					break;
				case '*':System.out.println(operando1+"*"+operando2+"="+(operando1*operando2));
					break;
				case '/':if(operando2!=0)
							System.out.println(operando1+"/"+operando2+"="+(operando1/operando2));
						 else
							System.out.println("NO SE PUEDE DIVIDIR POR 0"); 
					break;
				case '%':if(operando2!=0)
							System.out.println(operando1+"%"+operando2+"="+(operando1%operando2));
						 else
					        System.out.println("NO SE PUEDE DIVIDIR POR 0");		
			}
			System.out.println("¿Quiere continuar? S para si, cualquier otro valor para no");
			respuesta=teclado.nextLine().toLowerCase().charAt(0);			
		}while(respuesta=='s');
		teclado.close();
	}

}
