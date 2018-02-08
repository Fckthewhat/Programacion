
package EJER01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ATRIBUTOS DE LA CLASE BASE
		String nombre;
		int edad;
		String nif; 
		
		//ATRIBUTO DE LOS EMPLEADOS CON SUELDO BASE
		double sueldoBase;
		
		//ATRIBUTOS EMPLEADO TEMPORAL
		GregorianCalendar fechaAlta = new GregorianCalendar();
		GregorianCalendar fechaBaja = new GregorianCalendar();
		
		//ATRIBUTOS EMPLEADO POR HORAS
		double precHora=0;
		int numHoras=0;
		
		//ATRIBUTOS EMPLEADO FIJO
		int anyoAlta=0;
		double complementoAnyo=0;

	
		/* *********************************
		 * *********************************
		 * CREACION DE UN EMPLEADO TEMPORAL*
		 *********************************** 
		 ***********************************/
		
		System.out.println("EMPLEADO TEMPORAL");
		//INICIALIZO TODOS LOS ATRIBUTOS
		nombre=null;
		edad=0;
		nif=null; 
		sueldoBase=0;
		
		//fechaAlta;
		//fechaBaja;
		
	//***NOMBRE
		System.out.println("nombre?");
		try{
			nombre=br.readLine();
		}catch (IOException ioe) {
			System.out.println("Error de entrada/salida");
		}catch (Exception e) {
			System.out.println("Error generico");
		}
		
	//***EDAD
		do{
			System.out.println("Edad?");
			try{
				edad=Integer.parseInt(br.readLine());
				if(edad<18)
					System.out.println("La edad debe ser mayor de 18 y menor que 70");
			}catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(edad<18 || edad>70);
	
	//***NIF
		do{
			System.out.println("nif?");
			try{
				nif=br.readLine();
				if(nif.length()<8)
					System.out.println("El nif esta formado por 8 digitos");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(nif==null || nif.length()<8);
	
	//***FECHA ALTA
		int fechaValida;
		int anyo;
		int mes;
		int dia;
		
		do{
			System.out.println("Fecha alta? dd/mm/aaaa");
			fechaValida=0;
			dia=0;
			try{
				String fecha=br.readLine();
				anyo=Integer.parseInt(fecha.substring(fecha.length()-4, fecha.length()));
				mes=Integer.parseInt(fecha.substring(3, 5));
				dia=Integer.parseInt(fecha.substring(0, 2));
				
				//COMPROBAR QUE LA FECHA SEA VALIDA
				switch(Integer.parseInt(fecha.substring(3, 5))){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					fechaValida=31;
				break;
				
				case 4: case 6: case 9: case 11:
					fechaValida=30;
				break;
				
				case 2:
					if(anyo%4==0 && anyo%100!=0 || anyo%400==0)
						fechaValida=29;
					else
						fechaValida=28;
				break;
				default:
					System.out.println("Fecha no valida");	
				}//FIN DEL SWITCH CASE
			//CREACION DEL OBJETO GREGORIAN CALENDAR	
				fechaAlta=new GregorianCalendar(anyo,mes-1,dia);
			//CAPTURACION DE EXCEPCIONES	
			}catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			}catch (IndexOutOfBoundsException ioobe) {
				System.out.println("El formato de fecha no es correcto debe ser dd/mm/aaaa");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(dia<1 || dia>fechaValida);
		
		
	//***FECHA BAJA	
		do{
			System.out.println("Fecha baja? dd/mm/aaaa");
			fechaValida=0;
			dia=0;
			try{
				String fecha=br.readLine();
				anyo=Integer.parseInt(fecha.substring(fecha.length()-4, fecha.length()));
				mes=Integer.parseInt(fecha.substring(3, 5));
				dia=Integer.parseInt(fecha.substring(0, 2));
				
				//COMPROBAR QUE LA FECHA SEA VALIDA
				switch(Integer.parseInt(fecha.substring(3, 5))){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					fechaValida=31;
				break;
				
				case 4: case 6: case 9: case 11:
					fechaValida=30;
				break;
				
				case 2:
					if(anyo%4==0 && anyo%100!=0 || anyo%400==0)
						fechaValida=29;
					else
						fechaValida=28;
				break;
				default:
					System.out.println("Fecha no valida");	
				}//FIN DEL SWITCH CASE
			//CREACION DEL OBJETO GREGORIAN CALENDAR	
				fechaBaja=new GregorianCalendar(anyo,mes-1,dia);
				if(fechaAlta.compareTo(fechaBaja)==1)
					System.out.println("La fecha de baja no puede ser menor");
			//CAPTURACION DE EXCEPCIONES	
			}catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			}catch (IndexOutOfBoundsException ioobe) {
				System.out.println("El formato de fecha no es correcto debe ser dd/mm/aaaa");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(dia<1 || dia>fechaValida || fechaAlta.compareTo(fechaBaja)==1);
		
		do{
			System.out.println("Sueldo?");
			try{
				sueldoBase=Integer.parseInt(br.readLine());
				if(sueldoBase<18)
					System.out.println("El sueldo debe tener un valor positivo");
			}catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(sueldoBase<=0);
	
	//CREACION DEL OBJETO EMPLEADO TEMPORAL CON LOS DATOS TOMADOS
		EmpleadoTemporal empleTemporal = new EmpleadoTemporal(sueldoBase, nombre, edad, nif, fechaAlta, fechaBaja);
	//MOSTRAR POR PANTALLA LOS DATOS DE empleTemporal
		System.out.println("\n\n" + empleTemporal.toString());
	//CALCULAR EL SUELDO DE EMPLE TEMPORAL DEBE SER EL MISMO QUE EL SUELDO BASE
		System.out.println("\nSueldo: " + empleTemporal.calcularSueldo());
	
	
		
		
	
		/* *****************************
		 * *****************************
		 * CREACION DE UN EMPLEADO FIJO*
		 ******************************* 
		 *******************************/
		
		System.out.println("\n\nEMPLEADO FIJO");
		//INICIALIZO TODOS LOS ATRIBUTOS COMUNES
		nombre=null;
		edad=0;
		nif=null; 
		sueldoBase=0;
		
	//***NOMBRE
		System.out.println("nombre?");
		try{
			nombre=br.readLine();
		}catch (IOException ioe) {
			System.out.println("Error de entrada/salida");
		}catch (Exception e) {
			System.out.println("Error generico");
		}
		
	//***EDAD
		do{
			System.out.println("Edad?");
			try{
				edad=Integer.parseInt(br.readLine());
				if(edad<18)
					System.out.println("La edad debe ser mayor de 18 y menor que 70");
			}catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(edad<18 || edad>70);
	
	//***NIF
		do{
			System.out.println("nif?");
			try{
				nif=br.readLine();
				if(nif.length()<8)
					System.out.println("El nif esta formado por 8 digitos");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(nif==null || nif.length()<8);
	
	//***AÑO DE ALTA
		//Creo una fecha con el año acutal
		GregorianCalendar anyoActual = new GregorianCalendar();
		int anyoAct = anyoActual.get(Calendar.YEAR);
		do{
			System.out.println("Año de alta en la empresa? aaaa");
			try{
				anyoAlta=Integer.parseInt(br.readLine());
				if(anyoAlta>anyoAct)
					System.out.println("El año de alta debe ser menor que el año actual");
				if(anyoAlta<=0)
					System.out.println("El año debe tener un valor positivo");
			}catch (NumberFormatException nfe) {
				System.out.println("No ha tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(anyoAlta>anyoAct || anyoAlta<=0);
		
	//***PLUS DE ANTIGÜEDAD
		do{
			System.out.println("Complemento por año trabajado?");
			try {
				complementoAnyo=Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			} catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			} catch (Exception e) {
				System.out.println("Error generico");
			}
		}while (complementoAnyo<=0);
	
	//CREACION DEL OBJETO EMPLEADO FIJO CON LOS DATOS TOMADOS
		EmpleFijo empleFijo = new EmpleFijo(sueldoBase, nombre, edad, nif, anyoAlta, complementoAnyo);
	//MOSTRAR POR PANTALLA LOS DATOS DE empleFijo
		System.out.println("\n\n" + empleFijo.toString());
	//CALCULAR EL SUELDO DE emplefijo
		System.out.println("\nSueldo: " + empleFijo.calcularSueldo());
		
		
		
		
		/* **********************************
		 * **********************************
		 * CREACION DE UN EMPLEADO POR HORAS*
		 ************************************ 
		 ************************************/
		
		System.out.println("\n\nEMPLEADO POR HORAS");
		//INICIALIZO TODOS LOS ATRIBUTOS COMUNES
		nombre=null;
		edad=0;
		nif=null; 
		sueldoBase=0;
		
	//***NOMBRE
		System.out.println("nombre?");
		try{
			nombre=br.readLine();
		}catch (IOException ioe) {
			System.out.println("Error de entrada/salida");
		}catch (Exception e) {
			System.out.println("Error generico");
		}
		
	//***EDAD
		do{
			System.out.println("Edad?");
			try{
				edad=Integer.parseInt(br.readLine());
				if(edad<18)
					System.out.println("La edad debe ser mayor de 18 y menor que 70");
			}catch (NumberFormatException nfe) {
				System.out.println("No has tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(edad<18 || edad>70);
	
	//***NIF
		do{
			System.out.println("nif?");
			try{
				nif=br.readLine();
				if(nif.length()<8)
					System.out.println("El nif esta formado por 8 digitos");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(nif==null || nif.length()<8);
	
	//***PRECIO HORA
		do{
			System.out.println("Precio hora?");
			try{
				precHora=Integer.parseInt(br.readLine());
				if(precHora<=0)
					System.out.println("El precio por hora debe tener un valor positivo");
			}catch (NumberFormatException nfe) {
				System.out.println("No ha tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(precHora<=0);
		
		//***NUMERO DE HORAS TRABAJADAS
		do{
			System.out.println("Horas trabajadas?");
			try{
				precHora=Integer.parseInt(br.readLine());
				if(precHora<=0)
					System.out.println("El numero de horas debe tener un valor positivo");
			}catch (NumberFormatException nfe) {
				System.out.println("No ha tecleado un numero");
			}catch (IOException ioe) {
				System.out.println("Error de entrada salida");
			}catch (Exception e) {
				System.out.println("Error generico");
			}
		}while(precHora<=0);
		
		
	//CREACION DEL OBJETO EMPLEADO TEMPORAL CON LOS DATOS TOMADOS
		EmplePorHoras empleXhoras = new EmplePorHoras(precHora, numHoras, nombre, edad, nif);
	//MOSTRAR POR PANTALLA LOS DATOS DE empleTemporal
		System.out.println("\n\n" + empleXhoras.toString());
	//CALCULAR EL SUELDO DE EMPLE TEMPORAL DEBE SER EL MISMO QUE EL SUELDO BASE
		System.out.println("\nSueldo: " + empleXhoras.calcularSueldo());
		
		
	}

}
