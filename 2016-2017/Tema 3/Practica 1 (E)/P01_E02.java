package PRACTICA1_ENTRENAMIENTO;
//***********************************************************
//*		Resolver un sistema de ecuaciones lineales			*
//*					ax + by = c								*
//*					dx + ey = f								*
//***********************************************************
/**
 * 
 * @author begoña
 *
 */
import java.util.Scanner;

public class P01_E02 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double a,b,c,d,e,f;
		System.out.println("****************************************");
		System.out.println("PRIMERA ECUACIÓN AX+BY=C");
		System.out.println("Introduce valor del coeficiente a");
		a=teclado.nextDouble();
		System.out.println("Introduce valor del coeficiente b");
		b=teclado.nextDouble();
		System.out.println("Introduce valor del termino c");
		c=teclado.nextDouble();
		System.out.println("PRIMERA ECUACIÓN AX+BY=C");
		
		System.out.println("****************************************");
		System.out.println("SEGUNDA ECUACIÓN DX+EY=F");
		System.out.println("Introduce valor del coeficiente d");
		d=teclado.nextDouble();
		System.out.println("Introduce valor del coeficiente e");
		e=teclado.nextDouble();
		System.out.println("Introduce valor del termino f");
		f=teclado.nextDouble();
		System.out.println("PRIMERA ECUACIÓN AX+BY=C");
		
//ESCRITURADE RESULTADOS
		System.out.println("LA SOLUCIÓN DEL SISTEMA DE ECUACIONES LINEALES");
		System.out.println("\t"+a+"x"+"+"+b+"y"+"="+c);
		System.out.println("\t"+d+"x"+"+"+d+"y"+"="+f);
		System.out.println("es x="+(c*e-b*f)/(a*e-b*d) +" e y="+(a*f-c*d)/(a*e-b*d));
		
		teclado.close();
	}

}
