/**
*Crear una clase que llamaremos Piscina con los atributos nivel y MAX_NIVEL (constante) y 
*todos los métodos que creas necesarios para su tratamiento. 
*Entre ellos debemos incluir los métodos:
*
* 1-llenarPiscina(double):void...que añade al agua de la piscina la cantidad especificada de agua.
* 2-vaciarPiscina(double):void...que quita de la piscina la cantidad de agua especificada.
* 
* Controlar todas las posibles excepciones tanto estándar como aquellas no controladas por Java.
* Escribir un programa main para probar el programa y el funcionamiento 
* y tratamiento de excepciones.
*/
package PRACTICA1_ENTRENAMIENTO;

public class EJER05 {

	private double nivel=0;
	private final double MAX_NIVEL=99.0;
	
	public EJER05(){
		
	}
	
	public double getNivel() {
		return nivel;
	}
	
	public void setNivel(double nivel) {
		this.nivel = nivel;
	}
	
	public void llenarPiscina(double annadir) throws Exception{
		try{
			if(this.getNivel() + annadir <= this.MAX_NIVEL && annadir >= 0)
				this.setNivel(this.getNivel() +  annadir);
			
			else
				throw new Exception("La piscina se desbordarï¿½a o no se"
					+ " puede aï¿½adir una cantidad negativa de agua, para"
					+ " ello existe el mï¿½todo vaciarPiscina().");
		}
		
		catch(Exception e){
			e.getMessage();
		}			
	}
	
	public void vaciarPiscina(double quitar) throws Exception{
		try{
			if(this.getNivel() - quitar >= 0 && quitar > 0)
				this.setNivel(this.getNivel() - quitar);
			
			else
				throw new Exception("No se puede vaciar la piscina por"
					+ " debajo de su lï¿½mite inferior o no se puede retirar"
					+ " una cantidad negativa de agua, para ello existe el"
					+ " mï¿½todo llenarPiscina().");
		}
		
		catch(Exception e){
			e.getMessage();
		}
		
	}
	
	@Override
	public String toString(){
		return "La piscina tiene una capacidad de " + this.MAX_NIVEL + 
			"\nEl nivel actual de la piscina es " + this.getNivel();
	}
}

//primero crear el objeto por defecto, luego el constructor de clase, luego get, luego set
	//llenar piscina (controlando excepcion de llenadopiscinadesbordada y creando clase aparte para ello), 
	//vaciar piscina(controlar excepcion de piscina vaciada).
	
	//Main: try catch controlando nivel piscina (desbordamiento, excepcion generica, nivel fuera rango
	// que es menor que 0 o mayor que el valor maximo de la piscina, que lo que haya tecleado no ha sido
	//un numero); 
	//