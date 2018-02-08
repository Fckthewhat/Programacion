package practica02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Crea un programa principal, donde definas un empleado de cada tipo
 * y muestra el sueldo que recibe cada uno de ellos. Los datos se
 * introducen desde teclado y se comprobarA cualquier tipo de
 * inconsistencia
 * @author ubu
 *
 */
public class EmpleadoPrincipal {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String lectura = "";
		EmpleadoFijo fijo = new EmpleadoFijo();
		EmpleadoTemporal temporal = new EmpleadoTemporal();
		EmpleadoPorHoras horas = new EmpleadoPorHoras();
		
		do{
			System.out.println("Teclee el nombre del empleado fijo.");
			try{
				lectura = br.readLine();
				fijo.setNombre(lectura);
			}
						
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(fijo.getNombre().equals(null));
		
		do{
			System.out.println("Teclee la edad del empleado fijo.");
			try{
				lectura = br.readLine();
				fijo.setEdad(Integer.parseInt(lectura));
			}
			
			catch(NumberFormatException nfe){
				System.out.println("Error de tipo de datos.");
			}
						
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(fijo.getEdad() < 18 || fijo.getEdad() > 67);
		
		do{
			System.out.println("Teclee el NIF del empleado fijo.");
			try{
				lectura = br.readLine();
				fijo.setNif(lectura);
			}
						
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(lectura.length() != 8);
		
		do{
			System.out.println("Teclee el salario base del empleado fijo.");
			try{
				lectura = br.readLine();
				fijo.setBase(Double.parseDouble(lectura));
			}
			
			catch(NumberFormatException nfe){
				System.out.println("Error de tipo de datos.");
			}
						
			catch(IOException ioe){
				System.out.println("Error de entrada / salida.");
			}
			
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		while(fijo.getBase() <= 0);
		
	}
}