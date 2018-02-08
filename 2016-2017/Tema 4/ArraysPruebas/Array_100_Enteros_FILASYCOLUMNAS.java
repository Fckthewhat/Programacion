/**
 * Array que cargue números enteros 
 * entre 1 y 100 en un array de 5 * 4
 * (5 filas * 4 columnas).
 * 
 * Sumar y escribir el valor de cada una de las filas.
 * 
 */
package Arrays_PRUEBAS_CLASE;

public class Array_100_Enteros_FILASYCOLUMNAS {

	public static void main(String[] args) {
		 //CONVENIO: declarar tamaño del array con constantes.
		final int FILAS=5, COLUMNAS=4;
		int tabla [][] = new int[FILAS][COLUMNAS];
		int sumaFilas=0,sumaColumnas=0;
		
		//este array rellena las filas y las columnas de la tabla con números:
		for (int filas=0; filas<tabla.length; filas++){
			for(int columnas=0;columnas<tabla[filas].length;columnas++){
				tabla[filas][columnas]=(int)(Math.random()*100+1);
				System.out.print(tabla[filas][columnas]+ " ");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println("*************Suma de filas: *************");
		//este array es para sumar filas:
		for(int filas=0;filas<tabla.length;filas++){
			sumaFilas=0;
			for(int columna=0;columna<tabla[filas].length;columna++)
				sumaFilas+=tabla[filas][columna];
			System.out.println("La suma de la fila "+filas+" es: "+sumaFilas);
		}
		System.out.println();
		System.out.println("*************Suma de columnas: *************");
		//este array es para sumar columnas:
		for (int columnas=0;columnas<tabla.length;columnas++){
			sumaColumnas=0;
			for(int filas=0;filas<tabla[columnas].length;filas++)
				sumaColumnas+=tabla[columnas][filas];
			System.out.println("La suma de la columna "+columnas+" es: "+sumaColumnas);
		}
		
		//este array imprime/escribe los números que constituyen 
		//a las filas y las columnas de la tabla:
		
		//for (int i=0;i<array.length;i++) (a i lo he llamado filas antes y a j lo he llamado columnas)
			//for (int j=0;j<array.length; j++) 
			//	System.out.print(array[i][j]+ " ");
		//System.out.println();
	}
}

