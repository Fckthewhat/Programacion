package PRACTICA2_ENTRENAMIENTO;

public class EJER_02_Puntoprincipal {

	public static void main(String[] args) {
			EJER_02_Punto punto=new EJER_02_Punto();
			EJER_02_Punto punto1=new EJER_02_Punto(1,2);
			EJER_02_Punto punto2 =new EJER_02_Punto();
			
			//invocamos al m�todo toString()
			
			System.out.println("El primer punto est� en "+punto.toString()+
					"\nEl segundo punto est� en "+punto1.toString() +
					"\nEl tercer punto est� en "+punto2.toString());
			
			//escribimos los valores del punto sin invocar a toString
			System.out.println("Punto 1 ("+punto1.getX()+","+punto1.getY());

			//Prueba m�todos set
			//cambiar los valores del punto2  a (3,5)
			punto2.setX(3);
			punto2.setY(5);
			System.out.println("tras cambiar los valores de punto 2");
			System.out.println(punto2.toString());
			double distancia;
			distancia = punto1.distancia(punto2);
			System.out.println(" la distancia entre el punto 1 y 2 es " +distancia);
			//punto1.puntoMedio(punto2);
			System.out.println(" el punto medio es "+punto1.puntoMedio(punto2).toString());
	}

}
