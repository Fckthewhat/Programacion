package Excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ArithmeticException;
/**
 * realizar un método para cada operación de la calculadora.
 * @author diurno
 *
 */
public class Calculadora {
	private int operador1, operador2;
	
	public Calculadora(){
		
	}

	public int getOperador1() {
		return operador1;
	}

	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}

	public int getOperador2() {
		return operador2;
	}

	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}
	
	public int suma(int operador1, int operador2){
		return this.operador1 + this.operador2;
	}
	
	public int resta(int operador1, int operador2){
		return this.operador1 - this.operador2;
	}
	
	public int producto(int operador1, int operador2){
		return this.operador1 * this.operador2;
	}
	
	public int cociente(int operador1, int operador2){
		return this.operador1 / this.operador2;
	}
	
	public int resto(int operador1, int operador2){
		return this.operador1 % this.operador2;
	}
	
	public int cocienteTrata(int operador1, int operador2){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String lectura = "";
	    int cociente = 0;
	    do{
	      try{
	        cociente = this.operador1 / this.operador2;
	      }
	      
	      catch (ArithmeticException ae) {
	    	  System.out.println("No se puede dividir entre cero.");
	    	  try{
	    		  lectura = br.readLine();
	    	  }
	    	  
	    	  catch(IOException ioe){
	    		  System.out.println("Error de entrada/salida.");
	    	  }
	    	  
	    	  this.operador2 = Integer.parseInt(lectura);
	      }
	      
	    }
	    
	    while(this.operador2 == 0);
	    
	    cociente = this.operador1 / this.operador2;
	    return cociente;

	}
	
	public int restoTrata(int operador1, int operador2){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String lectura = "";
	    int resto = 0;
	    do{
	      try{
	        resto = this.operador1 % this.operador2;
	      }
	      
	      catch (ArithmeticException ae) {
	    	  System.out.println("No se puede dividir entre cero.");
	    	  try{
	    		  lectura = br.readLine();
	    	  }
	    	  
	    	  catch(IOException ioe){
	    		  System.out.println("Error de entrada/salida.");
	    	  }
	    	  
	    	  this.operador2 = Integer.parseInt(lectura);
	      }
	      
	    }
	    
	    while(this.operador2 == 0);
	    
	    resto = this.operador1 % this.operador2;
	    return resto;
	}	
	
	public void cocienteLanza (int operador1, int operador2) throws ArithmeticException {
		System.out.println(this.operador1 / this.operador2);		
	}
	
	public void restoLanza(int operador1, int operador2){
		System.out.println(this.operador1 % this.operador2);
	}	
}