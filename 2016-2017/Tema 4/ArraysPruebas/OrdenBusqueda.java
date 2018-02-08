//corregir algunos errores
package Arrays_PRUEBAS_CLASE;

public class OrdenBusqueda {

static void seleccion(int[]array){ //array seleccion
		
		int min=0,i,j,aux;
		
		for (i=0; i<array.length-1;i++){
			min=i;
			for(j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min=j;
				}
			}
			if (i!=min){
				aux=array[i];
				array[i]=array[min];
				array[min]=aux;
			}
		}
		System.out.println("");
		System.out.println("Vectores ordenados del array Seleccion: ");
		
		for(i=0;i<array.length;i++)
			if(i==array.length-1)
				System.out.println(array[i]+ ".");
			else
				System.out.print(array[i]+ ", ");
	}

static void intercambio (int[]array){ //array intercambio
		
	int aux,i,j;
		
	for (i=0;i<array.length-1;i++)
		for(j=i+1;j<array.length;j++)
			if(array[j]<array[i]){
				aux=array[j];
				array[j]=array[i];
				array[i]=aux;
			}
	System.out.println("");
	System.out.println("Vectores ordenados del array Intercambio: ");
	
	for(i=0;i<array.length;i++)
		if(i==array.length-1)
			System.out.println(array[i]+ ".");
		else
			System.out.print(array[i]+ ", ");
	System.out.println("");
}
	
static void burbuja (int[]array){ //array burbuja
	
	int aux,i,j;
	
	for(i=0;i<array.length-1;i++){
		for(j=0;j<array.length-i-1;j++){
			if(array[j]>array[i]){
				aux=array[j+1];
				array[j+1]=array[j];
				array[j]=aux;
			}
		}
	}
	System.out.println("");
	System.out.println("Vectores ordenados del array Burbuja: ");
	for(i=0;i<array.length;i++){
		if(i==array.length-i-1)
			System.out.println(array[i]+ ".");
		else
			System.out.print(array[i]+ ", ");
	}
	System.out.println("");
}
static int burbujamejorado(int[]array){ //array burbuja mejorado
	
	int aux,i,j,num=0;
	boolean interruptor=true;
	
	for(i=0;i<array.length-1 && interruptor==true;i++){
		interruptor=false;
		for(j=0;j<array.length-i-1;j++){
			if(array[j]>array[j+1]){
				aux=array[j];
				array[j]=array[j+1];
				array[j+1]=aux;
				interruptor=true;
			}
		}
	}
	for(i=0;i<array.length;i++){
		if(i==array.length-i-1)
			System.out.println(array[i]+ ".");
		else
			System.out.print(array[i]+ ", ");
	}
	System.out.println("");
	System.out.println("Vectores ordenados del array Burbuja Mejorado: ");
	
	return -1;
}
//Busqueda secuencial o lineal:
static int busquedaSecuencialOrdenada(int []array, int n){
	intercambio(array);
	int posicion=-1,i;
	for(i=0;i<array.length-1 && array[i]<=n;i++){
		if(array[i]==n)
			return i; 
	}
	return posicion;
}		

static int busquedaSecuencialDesordenada(int []array, int n){
	int posicion=-1,i;
	for(i=0;i<array.length-1;i++){
		if(array[i]==n)
			return i; 
	}
	return posicion;
}		
//Busqueda binaria o dicotomica:
public static int busquedaBinaria(int[]array,int valor){
	int inicio=0, fin=array.length-1;
	int central;
	while(inicio<=fin){
		central=(inicio+fin)/2;
		if(array[central]==valor){
			return central;
		}
		if(array[central]>valor){
			fin=central-1;
		}
		if(array[central]<valor){
			inicio=central+1;
		}
	}
	return -1;
}

}

/**En pseudocodigo:
 * Tamaño=n
 * Para i=0 hasta i=tamaño-1 //recorre vector
 * 	  min=i//Posicion donde encontramos el minimo
 * 	  Para j=i+1 hasta i=tamaño-1 //desde la pos.siguiente a i
 * 			Si(a[j]<a[min])//búsqueda del mínimo
 * 				min=j;
 * 			Fin-Si
 * 	  Fin-Para
 * 	  Si(i<>min) //intercambiamos valores
 * 		 aux=a[i]
 * 		 a[i]=a[min]
 * 		 a[min]=aux
 * 	  Fin-Si
 * Fi-para
*/