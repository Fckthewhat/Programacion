/*
 * Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche. El 
programa pide por teclado los datos de los coches y los almacena en memoria. 
Los datos a introducir son:
•matrícula
•marca
•modelo
•tipo de combustible
•Km

Queremos conocer:
a)Información sobre todos los coches que se han introducido.
b)Todos los coches de una marca determinada, escribiremos la 
información de estos coches y el número total de coches.
c)Todos los coches con menos de un número determinado de Kilómetros, 
escribiremos la información de estos coches y el número total de coches.
d)El coche o coches con mayor número de Kilómetros. Escribiremos la 
matricula marca y modelo de los que cumplen esta condición.
e)Dado un tipo de combustible, todos los coches que consumen dicho combustible
(información del vehículo y número de vehículos)
f)Todos los coches ordenados por número de kilómetros de menor a mayor.

Para realizar el programa mostraremos un menú con las distintas opciones 
y seleccionaremos en cada momento, aquella que más nos interese. El 
programa no termina hasta que el usuario así lo decida.
Para cada uno de los apartados del menú lo haremos creando un método
al efecto.
 */
package ArrayListyVector;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	static ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	static Scanner sc = new Scanner (System.in);
	
	//Método para leer coches y sus características: 
	public static void leerCoches(){
	        String matricula, marca, modelo,tipo;
	        double Km; 
	        Coche aux; 
	        int numcoches;
	        
	        do {
	            System.out.print("Introduce número de coches: ");
	            numcoches = sc.nextInt();
	        } while (numcoches <= 0);
	        System.out.println();
	        sc.nextLine(); 
	        
	        for (int i = 1; i <= numcoches; i++) {
	            System.out.println("Coche " + i);
	            System.out.print("Introduce matrícula: ");
	            matricula = sc.nextLine();           
	            System.out.print("Introduce marca: ");
	            marca = sc.nextLine();
	            System.out.print("Introduce modelo: ");
	            modelo = sc.nextLine();
	            System.out.print("Introduce tipo de combustible: ");
	            tipo = sc.nextLine();
	            System.out.print("Introduce número de kilómetros: ");
	            Km = sc.nextDouble();
	            sc.nextLine(); 
	            
	            aux = new Coche(); 
	            aux.setMatricula(matricula);
	            aux.setMarca(marca);
	            aux.setModelo(modelo);
	            aux.setTipo(tipo);
	            aux.setKm(Km);
	            
	            listaCoches.add(aux);
	        }
	    } 
	
//Método para mostrar todos los coches    
    public static void mostrarCoches(){       
        for(int i = 0; i< listaCoches.size(); i++)
            System.out.println(listaCoches.get(i));  
        System.out.println();
    }
    
//Método para mostrar todos los coches de una marca que se pide por teclado
    public static void mostrarPorMarca(){
        String marca;
        System.out.print("Introduce marca: ");
        marca = sc.nextLine();
        System.out.println("Coches de la marca " + marca);
        for(int i = 0; i<listaCoches.size(); i++){
            if(listaCoches.get(i).getMarca().equalsIgnoreCase(marca))
                System.out.println(listaCoches.get(i));
        }
    }
   
/*Método para mostrar todos los coches con un número de Km inferior 
al número de Km que se pide por teclado*/
    public static void mostrarPorKm(){
        int Km;
        System.out.print("Introduce número de kilómetros: ");
        Km = sc.nextInt();
        System.out.println("Coches con menos de " + Km + " Km");
        for(int i = 0; i<listaCoches.size(); i++){
            if(listaCoches.get(i).getKm() < Km)
                System.out.println(listaCoches.get(i));
        }
    }

    
  //Método para mostrar todos los coches de una marca que se pide por teclado
    public static void mostrarPorCombustible(){
        String tipo;
        System.out.print("Introduce tipo de combustible: ");
        tipo = sc.nextLine();
        System.out.println("Coches del tipo " + tipo);
        int cont = 0;
        for(int i = 0; i<listaCoches.size(); i++){
            if(listaCoches.get(i).getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(listaCoches.get(i));
                cont++;
            }
        }
        System.out.println("La cantidad de coches con ese combustible es: "+cont);
    }
   

//Método que devuelve el Coche con mayor número de Km
    public static Coche mostrarMayorKm(){
        Coche mayor = listaCoches.get(0);
        for(int i = 0; i < listaCoches.size(); i++){
            if(listaCoches.get(i).getKm() > mayor.getKm())
                mayor = listaCoches.get(i);
        }
        return mayor;
    }
    
//Método que muestra los coches ordenados por número de Km de menor a mayor
    public static void mostrarOrdenadosPorKm(){
        int i, j;
        Coche aux;
        for(i = 1; i< listaCoches.size(); i++)
            for(j=0;j<listaCoches.size()-i; j++)
                if(listaCoches.get(j+1).getKm() < listaCoches.get(j).getKm()){
                    aux = listaCoches.get(j+1);
                    listaCoches.set(j+1, listaCoches.get(j));
                    listaCoches.set(j, aux);                 
                }
        mostrarCoches();
    }
	
	public static void main(String[] args) {	
		char opcion;
		leerCoches();
		System.out.println();
		do {
			escribirMenu();
			System.out.println();
			System.out.println("Introduce opción: ");
			opcion = sc.next().charAt(0);
			switch (opcion) {
			case 'a':
				System.out.println("Los coches son: ");
				mostrarCoches();
				break;
			case 'b':
				mostrarPorMarca();
				break;
			case 'c':
				mostrarPorKm();
				break;
			case 'd':
				mostrarMayorKm();
				break;
			case 'e':
				mostrarPorCombustible();
				break;
			case 'f':
				mostrarOrdenadosPorKm();
				break;
			case 'g': 
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		}while (opcion != 'g');
	}

	public static void escribirMenu() {
		System.out.println("Menu del programa");
		System.out.println("a)Información sobre todos los coches que se han introducido.");
		System.out.println("b)Todos los coches de una marca determinada, escribiremos la "+
		"información de estos coches y el número total de coches.");
		System.out.println("c)Todos los coches con menos de un número determinado de Kilómetros, "+
		"escribiremos la información de estos coches y el número total de coches.");
		System.out.println("d)El coche o coches con mayor número de Kilómetros. Escribiremos la "+
		"matricula marca y modelo de los que cumplen esta condición.");
		System.out.println("e)Dado un tipo de combustible, todos los coches que consumen dicho "
				+ "combustible (información del vehículo y número de vehículos).");
		System.out.println("f)Todos los coches ordenados por número de kilómetros de menor a mayor.");
		System.out.println("g)Salir");
	}
}