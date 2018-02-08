/**
 * La clase Lampara anida a la clase interna Bombilla.
 * La clase interna Bombilla va a tener visibilidad public, por ello se 
 * podr�n crear objetos Bombilla desde los m�todos de L�mpara, o fuera de la clase.
 * 
 * Los atributos de Lampara seran forma (String), encendido (booleano: 0 apagado y 1 encendido) 
 * y c�mo debemos acceder a la clase bombilla.
 * 
 * La clase Bombilla solo tiene como atributo la potencia.
 */
package CLASES_INTERNAS;

public class Lampara {

	private String forma;
	private boolean encendido; //encendido=true
	Bombilla bombilla=new Bombilla();
	
	//Constructores
	public Lampara(){
		this.forma="L�mpara de mesa";
		this.encendido=false;
	}
	
	public Lampara(String forma, boolean encendido){
		
	}
	
	//SET Y GET
	
	
	//ToString
	/**public String toString(){
		String estado;
		//if (this.encendido)}*/
	
	
	//clase bombilla podria desarrollarla aqu� dentro, no crear una nueva.
	public class Bombilla{
		
	}
}
