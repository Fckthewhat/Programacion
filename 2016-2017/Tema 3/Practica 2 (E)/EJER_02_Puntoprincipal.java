package PRACTICA2_ENTRENAMIENTO;

public class EJER_02_Puntoprincipal {

	public static void main(String[] args) {
			EJER_02_Punto punto=new EJER_02_Punto();
			EJER_02_Punto punto1=new EJER_02_Punto(1,2);
			EJER_02_Punto punto2 =new EJER_02_Punto();
			
			//invocamos al método toString()
			
			System.out.println("El primer punto está en "+punto.toString()+
					"\nEl segundo punto está en "+punto1.toString() +
					"\nEl tercer punto está en "+punto2.toString());
			
			//escribimos los valores del punto sin invocar a toString
			System.out.println("Punto 1 ("+punto1.getX()+","+punto1.getY());

			//Prueba métodos set
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
