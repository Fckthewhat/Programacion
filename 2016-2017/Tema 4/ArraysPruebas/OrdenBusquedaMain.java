/**
 * Solucionar:
 * 1-arrays burbuja mejorado y burbuja duplicados (numeros).
 * 2-Syso para indicar que array de busqueda es (lineal o dicotomica).
 */
package Arrays_PRUEBAS_CLASE;

public class OrdenBusquedaMain {

	public static void main(String[] args) {
		//para array seleccion:
		int vector[]=new int[10];
		
		for(int i=0;i<vector.length;i++)
			vector[i]=(int)(Math.random()*10)+1;
		
		System.out.println("Vectores desordenados del array Seleccion:");
		
		for(int i=0;i<vector.length;i++)
			if(i==vector.length-1)
				System.out.println(vector[i]+ ".");
			else
				System.out.print(vector[i]+ ", ");
		
		OrdenBusqueda.seleccion(vector);
		System.out.println("");
		
		//para array intercambio:
		
		for(int i=0;i<vector.length;i++)
			vector[i]=(int)(Math.random()*10)+1;
		
		System.out.println("Vectores desordenados del array Intercambio:");
		
		for(int i=0;i<vector.length;i++)
			if(i==vector.length-1)
				System.out.println(vector[i]+ ".");
			else
				System.out.print(vector[i]+ ", ");
		
		OrdenBusqueda.intercambio(vector);
		
		//array burbuja:
		for(int i=0;i<vector.length;i++)
			vector[i]=(int)(Math.random()*10)+1;
		
		System.out.println("Vectores desordenados del array Burbuja:");
		
		for(int i=0;i<vector.length;i++)
			if(i==vector.length-i-1)
				System.out.println(vector[i]+ ".");
			else
				System.out.print(vector[i]+ ", ");
		
		System.out.println("");
		OrdenBusqueda.burbuja(vector);
		
		//array burbuja mejorado:
		for(int i=0;i<vector.length;i++)
			vector[i]=(int)(Math.random()*10)+1;
		
		for(int i=0;i<vector.length;i++)
			if(i==vector.length-i-1)
				System.out.println(vector[i]+ ".");
			else
				System.out.print(vector[i]+ ", ");
		
		System.out.println("Vectores desordenados del array Burbuja Mejorado:");
		OrdenBusqueda.burbujamejorado(vector);
		System.out.println("");
		
	//Busqueda secuencial o lineal:
		//Desordenada:
		for(int i=0;i<vector.length;i++){
			vector[i]=(int) (Math.random()*10);
		}
		//escribir el array
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i] + ", ");
		}
							
		System.out.println();
		System.out.println("Posicion: "+OrdenBusqueda.busquedaSecuencialOrdenada(vector, 6));
		
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i] + ", ");
		}
		
		System.out.println("");		
		//Ordenada:
		for(int i=0;i<vector.length;i++){
			vector[i]=(int) (Math.random()*10);
		}
		//escribir el array
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i] + ", ");
		}
							
		System.out.println();
		System.out.println("Posicion: "+OrdenBusqueda.busquedaSecuencialDesordenada(vector, 6));
		
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i] + ", ");
		}
		
		System.out.println("");
	//Busqueda dicotomica
		for(int i=0;i<vector.length;i++){
			vector[i]=(int) (Math.random()*10);
		}
		//escribir el array
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i] + ", ");
		}
							
		System.out.println();
		System.out.println("Posicion: "+OrdenBusqueda.busquedaBinaria(vector, 6));
		
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i] + ", ");
		}
		
		
		
		

	}
}
