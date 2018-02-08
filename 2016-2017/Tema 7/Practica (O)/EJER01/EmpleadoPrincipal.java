package EJER01;

import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpleadoPrincipal {

	public static void main(String[] args) throws NumberFormatException, 
			NullPointerException,IOException {
		
		int opcion;
		GregorianCalendar fechaDeAlta;
		double complementoAnual=0,sueldoBase=0,precioHoras=0,numHoras=0,sueldoMensual=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		EmpleadoFijo fijo=new EmpleadoFijo();
		EmpleadoTemporal Temporal=new EmpleadoTemporal();
		EmpleadoPorHoras PorHoras=new EmpleadoPorHoras();
		
		System.out.println();
		String nombre = br.readLine();
		
		
		System.out.println("Elija una opción: "
		+"\n1-Sueldo Empleado Fijo:"+"\n2-Sueldo Empleado Temporal:"
		+"\n3-Sueldo Empleado por Horas:");
		opcion=Integer.parseInt (br.readLine());
		
		switch (opcion) {
		case 1:
		/*	leo dia mes y año
			fechaDeAlta = new GregorianCalendar (anio, mes, dia)
			fijo = new EmpleadoFijo (nombre, nif, edad, fechaDeAlta);
			System.out.println("Su salario es: "+fijo.calcularSueldo());
			break;
		case 2:
			leo ..../*
			
		}
		
		/*switch(opcion){
			case 1:
				System.out.println("HA ELEGIDO LA OPCIÓN 1 (EMPLEADO FIJO)"
				+"\nPor favor introduzca los siguientes datos:");
				System.out.println("");
				do{
					System.out.println("Teclee el nombre del empleado fijo: ");
					
					try{
						Fijo.setNombre(br.readLine());
								
					}catch(IOException ioe){
						System.out.println("Error de entrada / salida.");
					
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
				
				}while(Fijo.getNombre().equals(null));
				
				do{
					System.out.println("Teclee la edad del empleado fijo: ");
					
					try{
						Fijo.setEdad(Integer.parseInt(br.readLine()));
					
					}catch(NumberFormatException nfe){
						System.out.println("Error de tipo de datos.");
								
					}catch(IOException ioe){
						System.out.println("Error de entrada/salida.");
					
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
				
				}while(Fijo.getEdad() < 18 || Fijo.getEdad() > 67);
				
				do{
					System.out.println("Teclee el NIF del Empleado Fijo (sin letra):");
					
					try{
						Fijo.setNif(Integer.parseInt(br.readLine()));
								
					}catch(IOException ioe){
						System.out.println("Error de entrada/salida.");
					
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
				
				}while(Fijo.getNif() != 8);
				
				do{
					System.out.println("Teclee el salario base del empleado fijo.");
					
					try{
						Fijo.setSueldoBase(Double.parseDouble(br.readLine()));
						sueldoBase=Double.parseDouble(br.readLine());
						
					}catch(NumberFormatException nfe){
						System.out.println("Error!!. El tipo de datos introducidos no es correcto! ");
								
					}catch(IOException ioe){
						System.out.println("Error de entrada / salida.");
						
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
					
				}while(Fijo.getSueldoBase() <= 0);
				
				GregorianCalendar anyoActual = new GregorianCalendar();
				int anyoAct = anyoActual.get(Calendar.YEAR);
				do{
					
					System.out.println("Fecha de Alta del Empleado: ");
					
					try{
						anyoAct=Integer.parseInt(br.readLine());
						if(fechaDeAlta>anyoAct)
							System.out.println("Has introducido un año inválido (el año de alta debe ser menor que el año actual).");
						
						if(fechaDeAlta<=0)
							System.out.println("Has introducido un año inválido (el año debe tener un valor positivo).");	
						
					}catch(NumberFormatException nfe){
						System.out.println("ERROR!: No has introducido un número.");
						
					}catch (IOException ioe) {
						System.out.println("Error de entrada / salida");
						
					}catch (Exception e) {
						System.out.println("Error generico");
					}
					
				}while(fechaDeAlta>anyoAct || fechaDeAlta<=0);
				
				do{
					System.out.println("Complemento Anual del Empleado: ");
					
					try{
						complementoAnual=Double.parseDouble(br.readLine());
						
					}catch(NumberFormatException e){
						System.out.println("Error");
					}
					
				}while(Fijo.getComplementoAnual() > 0);
				
				System.out.println("");
				System.out.println("El cálculo del Sueldo del Empleado es: "
				+Fijo.calcularSueldo());
			break;
			case 2:
				System.out.println("HA ELEGIDO LA OPCIÓN 2 (EMPLEADO TEMPORAL)"
						+"\nPor favor introduzca los siguientes datos:");
				System.out.println("");
				System.out.println("Sueldo mensual del Empleado: ");
				sueldoMensual=Double.parseDouble(br.readLine());
				System.out.println("El cálculo del Sueldo del Empleado es: "
						+Temporal.calcularSueldo());
			break;
			case 3:
				System.out.println("HA ELEGIDO LA OPCIÓN 3 (EMPLEADO POR HORAS)"
						+"\nPor favor introduzca los siguientes datos:");
				System.out.println("");
				System.out.println("Número de horas trabajadas por el Empleado: ");
				numHoras=Double.parseDouble(br.readLine());
				
				System.out.println("Precio por hora trabajada: ");
				precioHoras=Double.parseDouble(br.readLine());
				
				System.out.println("El cálculo del Sueldo del Empleado es: "
						+PorHoras.calcularSueldo());
			break;
			default: System.out.println("No ha elegido una opción válida ");
			
		}*/
		}
	}
}