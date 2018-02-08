package PRACTICA1_ENTRENAMIENTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EJER06Main {

	public static void main(String[] args) {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		double n=Double.MAX_VALUE;
		
		System.out.println("n?");
		try{
			n=Double.parseDouble(br.readLine());
			System.out.println(EJER06.logaritmoNep(n));
		}catch(NumberFormatException nfe){
			System.out.println("No has introducido un numero");
		}catch(LogNepException le){
			
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	} 
}
