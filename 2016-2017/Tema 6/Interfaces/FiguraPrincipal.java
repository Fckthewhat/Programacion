package INTERFACES;
import java.util.Scanner;
public class FiguraPrincipal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Rectangulo rectangulo = new Rectangulo(); //definir constructor por defecto de rectangulo para que tenga valores int por defecto
		System.out.println(rectangulo.toString()); //definir toString en cada clase
		rectangulo.calculoArea();
		
		
		
		
		
		//System.out.println("************RECTÁNGULO************");
		//System.out.println("Introduzca valores de base y altura: ");
		
		
	}
}
/**
 * Faltaría por meter: set y get en clases de rectangulo, circulo y triangulo. 
 * 
 * Meter valores desde teclado en el main, pasarlos con set y get a las clases 
 * correspondientes y que cambie el valor para volverlas a pasar al main y que las imprima.
 * 
 * Controlar excepciones.
 */