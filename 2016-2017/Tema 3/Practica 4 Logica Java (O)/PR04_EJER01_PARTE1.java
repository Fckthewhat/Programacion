package P04_TEMA3_LOGICAJAVA.src;

public class PR04_EJER01_PARTE1 {

	public static void main(String[] args) {

		int i = 0;
		while (i*i < 10){
			int j = i;
			while (j*j < 100){
				System.out.println((i+j));
				j *= 2;
				/**
				 *  Aquí i==0, con lo que nunca saldría del while y se formaría un bucle infinito.
				 */
			}
		i++;
		}
		System.out.println("\n*****");

	}

}
