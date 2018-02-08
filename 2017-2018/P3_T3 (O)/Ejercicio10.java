/*
 *  Hacer un programa que muestre el siguiente menú: 
 *  1-Números primos
 *  2-Suma sucesión
 *  3-Mayor menor
 *  4-Raíz cuadrada
 *  5-Salir
 *  
 *  1-Si  el  usuario  pulsa  la  opción  1:  se  le  pedirá  un  número  entero, 
 *   positivo y distinto de 0, y se escribirá un mensaje indicando si el 
 *   número es primo o no. Un número es primo cuando es divisible 
 *   por si mismo y por la unidad. (El 1 no es primo). 
 *   
 *  2-Si  el  usuario  pulsa  la  opción  2:  se  le  pedirá  un  número  entero, 
 *  positivo y mayor que 0, y se escribirá la suma de los términos 1, 1/2, 1/3.... hasta 1/n 
 *  siendo  n  el  número  que  se  ha  introducido  por teclado. 
 *  
 *  3-Si  el  usuario  pulsa  la  opción  3:  se  le  pedirá  un  número  entero, 
 *  positivo y distinto de 0, a continuación se pedirán tantos números 
 *  enteros  como  indique  el  número  introducido  y  se  mostrará  el 
 *  mayor valor, el menor valor y si se ha introducido algún 0.
 *   
 *  4-Si  el  usuario  pulsa  la  opción  4:  se  le  pedirá  un  número  entero, 
 *  positivo  y  distinto  de  0  y  mostrará  la  raíz  cuadrada  de  dicho 
 *  número y su resto. P.e. la raíz cuadrada de 13 es 3 ; Resto es 4 (13-3*3=4) 
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
					"MENÚ"+
					"\n1-Números Primos"+
					"\n2-Suma sucesión"+
					"\n3-Mayor Menor"+
					"\n4-Raíz cuadrada"+
					"\n5-Salir");
				System.out.println();
				System.out.println("Elija una opción: ");
				opcion = sc.nextInt();
				System.out.println();
			}while(opcion < 1 || opcion > 5);
			
			switch (opcion) {
			case 1:
				do {
					System.out.println("Ha elegido la opción 1: "+
							"\n1-Números Primos.");
					System.out.println();
					System.out.println("Teclee un número entero y mayor que 0: ");
					num = sc.nextInt();
				}while(num < 1);
				//establezco que primo sea verdadero hasta que se demuestre lo contrario
				for(i = num; i > 0; i--) {
					//evalúo si es primo o no, si no lo es, el valor de primo cambia a falso y luego lo mostraré
					if(num % i == 0 && num != 1 && i != 1 && num != i)
						primo = false;
				}
				//aquí pregunto si el valor de primo es falso o es verdadero. Dependiendo de eso, mostrará si el número es primo o no.
				System.out.println(primo ? "\nEs primo.\n" : "\nNo es primo.\n");	
				System.out.println();
			break;
			case 2:
				do {
					System.out.println("Ha elegido la opción 2: "+
							"\n2-Suma sucesión.");
					System.out.println();
					System.out.println("Teclee un número entero y mayor que 0: ");
					num = sc.nextInt();
					System.out.println();
				}while(num < 1);
				
				//aquí repetirá la suma sucesión hasta que el valor de i (que debe ser mayor de 0) 
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
					System.out.println("Ha elegido la opción 3: "+
							"\n3-Mayor Menor.");
					System.out.println();
					System.out.println("Teclee cuántos numeros quiere comparar: ");
					num = sc.nextInt();
					System.out.println();
				}while(num < 1);
								
				for(i = 0; i < num; i++) {
					//aquí me va pidiendo todos los números que voy a introducir con su número de asignación correspondiente
					System.out.println("Teclee el número " + (i + 1)); 
					comparacion = sc.nextInt();
					//aquí comparo los números para ver cuál es el mayor y el menor
					if(comparacion > max)
						max = comparacion;
					else if(comparacion < min)
						min = comparacion;
					//si se introdujo algun cero lo asigna a contcero y luego lo mostrará
					if(comparacion == 0)
						contcero++;
				}
				System.out.println();
				//aquí muestra el mayor número y el menor. si hay algún cero también lo muestra
				System.out.println("El mayor número leido ha sido: " + max + 
					"\nEl menor número leido ha sido: " + min +
					"\nSe han leido: " + contcero + " ceros.\n");
				System.out.println();
			break;
			case 4:
				do {
					System.out.println("Ha elegido la opción 4: "+
							"\nRaíz Cuadrada.");
					System.out.println();
					System.out.println("Teclee un número para mostrar su raíz cuadrada y su resto: ");
					num = sc.nextShort();
					System.out.println();
				}while(num < 1);
				//asigno a num1 el resultado de la raiz cuadrada del número que introduje
				num1 = (int)(Math.sqrt(num));
				//el resto de una raíz cuadrada es el numero - raiz cuadrada de ese numero ^ 2
				int resto = (int)(num - (int)Math.sqrt(num) * (int)Math.sqrt(num));
				//aquí muestro la raíz cuadrada del número num, como num1. También muestro el resultado del resto de la raíz cuadrada de num
				System.out.println("La raíz cuadrada de "+num+" es: "+num1+
						"\nEl resto de la raíz cuadrada de "+num+" es: "+resto);
				System.out.println();
			break;
			default:
				System.out.println("Fin del programa");
				//Con esto salimos de la ejecución del programa Java automáticamente, sin necesidad de pulsar nada
				System.exit(0); 
			}
		}while(opcion != 5);
		sc.close();
	}
}