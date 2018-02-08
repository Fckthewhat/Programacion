/*
 * Escribir un programa que determine y escriba la descomposición 
 * factorial de los números enteros comprendidos entre 1900 y 2000
 * 
 * @Fckthewhat
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		
		int i,j,numactual = 0;
		
		for(i = 1900; i < 2001; i++) {
			numactual = i;
			System.out.println("Descomposición factorial de "+i+": ");
			for(j = 2; numactual > 1; j++){
				while(numactual % j == 0 && numactual != 0) {
					System.out.println(numactual + " / "+j+" = "+(numactual / j));
					numactual = numactual / j;
				}
			}
			System.out.println();
		}
	}
}
/*
 * int actual=0;
        // un bucle for que controla por que numero se encuentra el programa
        for(int i=1900;i<=2000;i++){
            actual=i;
            System.out.println(i+"###############################################################");
            //el segundo bucle lleva la cuenta del numero por el que se divide
            for (int j = 2; actual>1 ; j++) {
                //el while realiza las operaciones 
                    while(actual%j==0 && actual!=0){
                        System.out.println(actual+" / "+j+" = "+(actual/j));
                        actual=actual/j;
                    }
            }
}
*/
