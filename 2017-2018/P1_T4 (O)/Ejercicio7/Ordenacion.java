public class Ordenacion {

	public static void burbuja(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
	}

	public static void burbujaMejorada(int[] a) {
		boolean cambiado = true;
		int i = 1;
		while (cambiado && (i < a.length)) {
			cambiado = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > (a[j + 1])) {
					int aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
					cambiado = true;
				}
			}
			i++;
		}
	}

	public static void insercion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int aux = a[i];
			int j;
			for (j = i - 1; j >= 0 && aux < a[j]; j--) {
				a[j + 1] = a[j];
			}
			/*
			 * j = i-1; while (j>=0 && aux<a[j]) { a[j+1] = a[j]; j--; }
			 */
			// Inserto el elemento (aux) en a[j + 1]
			a[j + 1] = aux;
		}
	}

	public static void seleccion(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// Busco el mínimo en a[i .. a.length-1]
			int valorMinimo = a[i];
			int posicionMinimo = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < valorMinimo) {
					valorMinimo = a[j];
					posicionMinimo = j;
				}
			}
			// Intercambio a[i] con a[posicionMinimo] si es necesario
			if (posicionMinimo != i) {
				a[posicionMinimo] = a[i];
				a[i] = valorMinimo;
			}
		}
	}

	public static void burbuja(String[] a) {
		for (int i = 1; i < a.length; i++)
			for (int j = 0; j < a.length - i; j++)
				if (a[j].compareTo(a[j + 1]) > 0) {
					String aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
	}

	public static void burbujaMejorada(String[] a) {
		boolean cambiado = true;
		int i = 1;
		while (cambiado && (i < a.length)) {
			cambiado = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					//intercambio(a, j, j + 1);
					String aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
					cambiado = true;
				}
			}
			i++;
		}
	}

	public static void insercion(String[] a) {
		for (int i = 1; i < a.length; i++) {
			String aux = a[i];
			int j;
			for (j = i - 1; j >= 0 && aux.compareTo(a[j])<0; j--) {
				a[j + 1] = a[j];
			}
			/*
			 * j = i-1; while (j>=0 && aux<a[j]) { a[j+1] = a[j]; j--; }
			 */
			// Inserto el elemento (aux) en a[j + 1]
			a[j + 1] = aux;
		}
	}

	public static void seleccion(String[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// Busco el mínimo en a[i .. a.length-1]
			String valorMinimo = a[i];
			int posicionMinimo = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(valorMinimo) < 0) {
					valorMinimo = a[j];
					posicionMinimo = j;
				}
			}
			// Intercambio a[i] con a[posicionMinimo] si es necesario
			if (posicionMinimo != i) {
				a[posicionMinimo] = a[i];
				a[i] = valorMinimo;
			}
		}
	}

}
