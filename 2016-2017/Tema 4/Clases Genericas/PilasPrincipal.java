/**
 * 1-Generar una pila de dobles y otra de racionales.
 * 2-Una vez generadas, ir recuperando los elementos 
 * 	 hasta que se vacíe la pila
 */
package ClasesGenericas;

public class PilasPrincipal {

	public static void main(String[] args) {
		Pilas <Double> p1=new Pilas<Double>();
		p1.insertar(new Double(23.5));//Es un objeto, no un double; deberiamos poner 23.5, no 23,5
		p1.insertar(new Double(12.0));
		p1.insertar(new Double(18.0));
		System.out.println("Número de elementos: "+p1.numero());
		System.out.println("Extracción hasta vaciar la pila ");
		while(!p1.vacia()){
			Double elemento;
			elemento=p1.quitar();
			System.out.print(elemento + " ");
		}
		System.out.println("; pila vacía");
	}
}
