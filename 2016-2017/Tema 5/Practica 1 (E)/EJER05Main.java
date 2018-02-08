package PRACTICA1_ENTRENAMIENTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EJER05Main {

	public static void main (String[]args){
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		EJER05 antares = new EJER05();
		String lectura = "";
		System.out.println("Teclee el nivel actual de la piscina.");
		do{
			try{
				lectura = br.readLine();
				antares.setNivel(Double.parseDouble(lectura));
			}
			
			catch(NumberFormatException nfe){
				System.out.println("Ha tecleado un valor no válido, inténtelo de nuevo.");
			}
			
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(antares.getNivel() < 0 || antares.getNivel() > 99.9);
		
		System.out.println("Teclee cuánta agua quiere añadir a la piscina.");
		do{
			try{
				lectura = br.readLine();
				antares.llenarPiscina(Double.parseDouble(lectura));
			}
			
			catch(NumberFormatException nfe){
				System.out.println("Ha tecleado un valor no válido, inténtelo de nuevo.");
			}
			
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(antares.getNivel() < 0 || antares.getNivel() > 99.9);
		
		System.out.println("Teclee cuánta agua quiere retirar de la piscina.");
		do{
			try{
				lectura = br.readLine();
				antares.vaciarPiscina(Double.parseDouble(lectura));
			}
			
			catch(NumberFormatException nfe){
				System.out.println("Ha tecleado un valor no válido, inténtelo de nuevo.");
			}
			
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(antares.getNivel() < 0 || antares.getNivel() > 99.9);
		
		antares.toString();
	}
}
