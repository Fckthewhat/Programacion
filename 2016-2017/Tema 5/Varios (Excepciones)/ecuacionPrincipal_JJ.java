package Excepciones;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.NumberFormatException;
public class ecuacionPrincipal_JJ {

	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String cad="";
		float a=Float.MAX_VALUE, b=Float.MAX_VALUE, c=Float.MAX_VALUE;
		
		//LEER a
		do{	
			try{
				System.out.println("a?");
				cad=br.readLine();
			}catch(Exception e){
				System.out.println("ERROR GENERICO");
			}
			try{
				a =Float.parseFloat(cad);
			}catch(NumberFormatException nfe){
				System.out.println("No has tecleado un numero");
			}
		}while(a==Float.MAX_VALUE);
		
		//LEER b
		do{	
			try{
				System.out.println("a?");
				cad=br.readLine();
			}catch(Exception e){
				System.out.println("ERROR GENERICO");
			}
			try{
				b = Float.parseFloat(cad);
			}catch(NumberFormatException nfe){
				System.out.println("No has tecleado un numero");
			}
		}while(b==Float.MAX_VALUE);
		
		//LEER c
		do{	
			try{
				System.out.println("a?");
				cad=br.readLine();
			}catch(Exception e){
				System.out.println("ERROR GENERICO");
			}
			try{
				c = Float.parseFloat(cad);
			}catch(NumberFormatException nfe){
				System.out.println("No has tecleado un numero");
			}
		}while(c==Float.MAX_VALUE);
			
	}

}
