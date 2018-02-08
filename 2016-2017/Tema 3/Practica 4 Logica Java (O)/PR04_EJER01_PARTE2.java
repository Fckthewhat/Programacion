package P04_TEMA3_LOGICAJAVA.src;

public class PR04_EJER01_PARTE2 {

	public static void main(String[] args) {
		
		int i, j, m=1, n=2;
		for (i = n; i > 0; i--) {
			for (j = m; j > 0; j--)
			System.out.print("*");
			System.out.println();
			}
/**
 * la  salida sería imprimir n * j  asteriscos  siempre que ambas variables sean > 0, sino no llega a ejecutarse.
 */
	}

}
