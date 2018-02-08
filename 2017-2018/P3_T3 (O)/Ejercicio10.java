/*
 *  Hacer un programa que muestre el siguiente men�: 
 *  1-N�meros primos
 *  2-Suma sucesi�n
 *  3-Mayor menor
 *  4-Ra�z cuadrada
 *  5-Salir
 *  
 *  1-Si  el  usuario  pulsa  la  opci�n  1:  se  le  pedir�  un  n�mero  entero, 
 *   positivo y distinto de 0, y se escribir� un mensaje indicando si el 
 *   n�mero es primo o no. Un n�mero es primo cuando es divisible 
 *   por si mismo y por la unidad. (El 1 no es primo). 
 *   
 *  2-Si  el  usuario  pulsa  la  opci�n  2:  se  le  pedir�  un  n�mero  entero, 
 *  positivo y mayor que 0, y se escribir� la suma de los t�rminos 1, 1/2, 1/3.... hasta 1/n 
 *  siendo  n  el  n�mero  que  se  ha  introducido  por teclado. 
 *  
 *  3-Si  el  usuario  pulsa  la  opci�n  3:  se  le  pedir�  un  n�mero  entero, 
 *  positivo y distinto de 0, a continuaci�n se pedir�n tantos n�meros 
 *  enteros  como  indique  el  n�mero  introducido  y  se  mostrar�  el 
 *  mayor valor, el menor valor y si se ha introducido alg�n 0.
 *   
 *  4-Si  el  usuario  pulsa  la  opci�n  4:  se  le  pedir�  un  n�mero  entero, 
 *  positivo  y  distinto  de  0  y  mostrar�  la  ra�z  cuadrada  de  dicho 
 *  n�mero y su resto. P.e. la ra�z cuadrada de 13 es 3 ; Resto es 4 (13-3*3=4) 
 *    
 *  @Fckthewhat  
 *  
 */
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,num1,i,opcion,min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,
				comparacion, contcero = 0;
		double suma = 0;
		boolean primo = true;
		
		do {
			do {
				System.out.println(
					"MEN�"+
					"\n1-N�meros Primos"+
					"\n2-Suma sucesi�n"+
					"\n3-Mayor Menor"+
					"\n4-Ra�z cuadrada"+
					"\n5-Salir");
				System.out.println();
				System.out.println("Elija una opci�n: ");
				opcion = sc.nextInt();
				System.out.println();
			}while(opcion < 1 || opcion > 5);
			
			switch (opcion) {
			case 1:
				do {
					System.out.println("Ha elegido la opci�n 1: "+
							"\n1-N�meros Primos.");
					System.out.println();
					System.out.println("Teclee un n�mero entero y mayor que 0: ");
					num = sc.nextInt();
				}while(num < 1);
				//establezco que primo sea verdadero hasta que se demuestre lo contrario
				for(i = num; i > 0; i--) {
					//eval�o si es primo o no, si no lo es, el valor de primo cambia a falso y luego lo mostrar�
					if(num % i == 0 && num != 1 && i != 1 && num != i)
						primo = false;
				}
				//aqu� pregunto si el valor de primo es falso o es verdadero. Dependiendo de eso, mostrar� si el n�mero es primo o no.
				System.out.println(primo ? "\nEs primo.\n" : "\nNo es primo.\n");	
				System.out.println();
			break;
			case 2:
				do {
					System.out.println("Ha elegido la opci�n 2: "+
							"\n2-Suma sucesi�n.");
					System.out.println();
					System.out.println("Teclee un n�mero entero y mayor que 0: ");
					num = sc.nextInt();
					System.out.println();
				}while(num < 1);
				
				//aqu� repetir� la suma sucesi�n hasta que el valor de i (que debe ser mayor de 0) 
				//sea igual al valor del numero que le introducimos
				for(i = 1; i <= num; i++) {
					suma += (double)1 / i;
					System.out.println("La sumatoria es: "+suma);
					System.out.println();
				}
				System.out.println();
			break;
			case 3:
				do {
					System.out.println("Ha elegido la opci�n 3: "+
							"\n3-Mayor Menor.");
					System.out.println();
					System.out.println("Teclee cu�ntos numeros quiere comparar: ");
					num = sc.nextInt();
					System.out.println();
				}while(num < 1);
								
				for(i = 0; i < num; i++) {
					//aqu� me va pidiendo todos los n�meros que voy a introducir con su n�mero de asignaci�n correspondiente
					System.out.println("Teclee el n�mero " + (i + 1)); 
					comparacion = sc.nextInt();
					//aqu� comparo los n�meros para ver cu�l es el mayor y el menor
					if(comparacion > max)
						max = comparacion;
					else if(comparacion < min)
						min = comparacion;
					//si se introdujo algun cero lo asigna a contcero y luego lo mostrar�
					if(comparacion == 0)
						contcero++;
				}
				System.out.println();
				//aqu� muestra el mayor n�mero y el menor. si hay alg�n cero tambi�n lo muestra
				System.out.println("El mayor n�mero leido ha sido: " + max + 
					"\nEl menor n�mero leido ha sido: " + min +
					"\nSe han leido: " + contcero + " ceros.\n");
				System.out.println();
			break;
			case 4:
				do {
					System.out.println("Ha elegido la opci�n 4: "+
							"\nRa�z Cuadrada.");
					System.out.println();
					System.out.println("Teclee un n�mero para mostrar su ra�z cuadrada y su resto: ");
					num = sc.nextShort();
					System.out.println();
				}while(num < 1);
				//asigno a num1 el resultado de la raiz cuadrada del n�mero que introduje
				num1 = (int)(Math.sqrt(num));
				//el resto de una ra�z cuadrada es el numero - raiz cuadrada de ese numero ^ 2
				int resto = (int)(num - (int)Math.sqrt(num) * (int)Math.sqrt(num));
				//aqu� muestro la ra�z cuadrada del n�mero num, como num1. Tambi�n muestro el resultado del resto de la ra�z cuadrada de num
				System.out.println("La ra�z cuadrada de "+num+" es: "+num1+
						"\nEl resto de la ra�z cuadrada de "+num+" es: "+resto);
				System.out.println();
			break;
			default:
				System.out.println("Fin del programa");
				//Con esto salimos de la ejecuci�n del programa Java autom�ticamente, sin necesidad de pulsar nada
				System.exit(0); 
			}
		}while(opcion != 5);
		sc.close();
	}
}