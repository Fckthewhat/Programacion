public class Ejercicio01Main {

	public static void main(String[] args) {
				//Voy a crear 2 objetos rec1 y rec2 para probar los m�todos anteriores
				Ejercicio01 rec1, rec2;
				
				//Le doy valores a rec1 representando los puntos x1,y1....x4,y4
				rec1 = new Ejercicio01 (1,1,1,2,2,2,2,1);
				
				//Muestro los puntos donde se encuentra el rec1
				//Indicar rec1 o rec1.toString() ser�a lo mismo
				System.out.println("Primer rectangulo: "+rec1);
				
				//Muestro el �rea del primer rect�ngulo 
				System.out.println("El area del primer rectangulo es: "+rec1.area());
				
				//Muestro el per�metro del primer rect�ngulo
				System.out.println("El perimetro del primer rectangulo es: "+
							rec1.perimetro());
				
				/*Le doy valores a rec2. Al cambiar los valores a "x" y a "y", pruebo el 
				m�todo desplazamiento*/
				rec2 = new Ejercicio01 (3, 5);
				
				System.out.println("Segundo rectangulo: "+rec2);
				
				//Muestro el �rea del segundo rect�ngulo despu�s de desplazarse 
				System.out.println("El area del segundo rectangulo es: "+rec2.area());
				
				//Muestro el per�metro del segundo rect�ngulo
				System.out.println("El perimetro del segundo rectangulo es: "+
							rec2.perimetro());
	}
}