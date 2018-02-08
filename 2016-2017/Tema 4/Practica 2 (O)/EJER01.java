/**
 * Con base en una encuesta realizada a N estudiantes (N<=50) en una Universidad 
 * donde se solicitó la siguiente información: DNI, SEXO, SUELDO, TRABAJA. 
 * Donde: 
 * 	a. DNI (Es un número) 
 * 	b. SEXO (1 - Masculino 2 – Femenino) 
 * 	c. TRABAJA (1 - Si trabaja 2 - No trabaja) 
 * 	d. SUELDO (Es un valor real) 
 * Escriba el algoritmo que permita leer y almacenar en vectores los datos solicitados, 
 * luego, calcular e imprimir: 
 * 	a. Porcentaje de hombres en la Universidad 
 * 	b. Porcentaje de mujeres en la Universidad 
 * 	c. Porcentaje de hombres que trabajan y sueldo promedio 
 * 	d. Porcentaje de mujeres que trabajan y sueldo promedio
 */
package TEMA4_P02_OBLIGATORIA;
import java.util.Scanner;
public class EJER01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		int []DNI = new int [50];
		int []Sexo = new int [50];
		int []Trabajo = new int [50];
		double []Sueldo = new double [50];
		
		do {
			System.out.println("Introduzca Nº de estudiantes (<=50): ");
			n = sc.nextInt();
		}while (n<=0 || n>50);
		for (int i=0; i<n; i++) {
			System.out.println("Estudiante: "+i);
			System.out.println("Introduce DNI: ");
			DNI[i] = sc.nextInt();
			do {
				System.out.println("Introduzca su sexo (1-masculino, 2-femenino): ");
				Sexo[i]=sc.nextInt();
			}while (Sexo[i]<1 || Sexo[i]>2);
		
			do{
				System.out.println("Introduzca estado laboral (1-Trabaja, 2-No trabaja): ");
				Trabajo[i]= sc.nextInt();
			}while(Trabajo[i]<1 || Trabajo[i]>2);
			
			System.out.println("introduce sueldo:");
			Sueldo[i]=sc.nextDouble();
		}	
		double porcSexoHombres = sexoHombres (Sexo, n);
		System.out.println("El % de Varones es: "+porcSexoHombres);
		double porcSexoMujeres = 100 - porcSexoHombres;
		System.out.println("El % de Mujeres es: "+porcSexoMujeres);
		
		double porcTrabajoHombres = trabajoHombres (Sexo, Trabajo, n);
		System.out.println("El % de trabajo en Varones es: "+porcTrabajoHombres);
		double porcNoTrabajoHombres = 100 - porcTrabajoHombres;
		System.out.println("El % de los Varones que no trabajan es: " +porcNoTrabajoHombres);
	
		double porcTrabajoMujeres = trabajoMujeres (Sexo, Trabajo, n);
		System.out.println("El % de trabajo en Mujeres es: "+porcTrabajoMujeres);
		double porcNoTrabajoMujeres = 100 - porcTrabajoMujeres;
		System.out.println("El % de las Mujeres que no trabajan es: " +porcNoTrabajoMujeres);
		
		double sueldoPromedioHombres = sueldoHombres (Sexo, Sueldo, Trabajo, n);
		System.out.println("El sueldo promedio de los Varones es: " +sueldoPromedioHombres);
		
		double sueldoPromedioMujeres = sueldoMujeres (Sexo,Sueldo,Trabajo, n); 
		System.out.println("El sueldo promedio de las Mujeres es: " +sueldoPromedioMujeres);
	}
	public static double sexoHombres(int[] Sexo, int n) {
		int cont = 0;
		for (int i=0; i<n; i++) {
			if (Sexo[i] == 1)
				cont++;
		}
		return cont * 100.0 / n;
	}
	
	public static double trabajoHombres (int []Sexo, int []Trabajo, int n) {
		int contH = 0, contHT = 0;
		for (int i=0; i<n; i++) {
			if (Sexo[i] == 1) {
				contH++;
				if (Trabajo[i] == 1)
					contHT++;
			}
		}
		return contHT * 100.0 / contH;
	}
	public static double trabajoMujeres (int []Sexo, int []Trabajo, int n) {
		int contM = 0, contMT = 0;
		for (int i=0; i<n; i++) {
			if (Sexo[i] == 2){
				contM++;
				if (Trabajo[i] ==1)
					contMT++;
			}
			
		}
		return contMT * 100.0 / contM;
	}
	public static double sueldoHombres (int []Sexo,double []Sueldo, int []Trabajo, int n ){
		int contSHT = 0;
		double suma = 0;
		for (int i=0; i<n; i++ ){
			if (Sexo[i] == 1 && Trabajo[i] ==1){
				contSHT++;
				suma = suma + Sueldo[i];
			}
		}
		return suma/contSHT;
	}
	public static double sueldoMujeres (int []Sexo,double []Sueldo, int []Trabajo, int n ){
		int contSMT = 0;
		double suma = 0;
		for (int i=0; i<n; i++ ){
			if (Sexo[i] == 1 && Trabajo[i] ==1){
				contSMT++;
				suma = suma + Sueldo[i];
			}
		}
		return suma/contSMT;
	}
}