package PRACTICA4_ENTRENAMIENTO;
/**
 * Construye las siguientes expresiones en java,
 * en cada una de ellas haz la declaración de variables
 * que creas necesaria: 
 * @author Yo
 *
 */
public class P04_E07 {

	public static void main(String[] args) {
		double resultado, r = 55.5, a = 11.1, b = 22.2, c = 33.3,
				x = 88.8, y = 99.9, R = 75.3, I = 66.6, M = 44.4,
				m = 13.1, n = 23.5, p = 51, q = 9.1, N = 7.62;
		resultado = Math.PI * Math.pow(r, 2);
		resultado = (a + b * c) / (3 + x / y);
		resultado = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		resultado = R * (Math.pow(1 + I / M, N) - 1 / (I / M));
		resultado = Math.sqrt(4/3) * Math.PI * r;
		resultado = Math.pow(b, 2 + x) - (Math.pow(27 * a, 1/5)) / (4 * b);
		resultado = (m + n / (p + 1)) / (p - q);
		resultado = (m + 4) / n;
		
		int aaaa = 1999;
		System.out.println(aaaa % 400 == 0 || aaaa % 4 == 0 && aaaa % 100 != 0 ?
				"El año es bisiesto." : "El año no es bisiesto.");
		byte nota = 4;
		System.out.println(nota >= 1 && nota <= 10 ? "La nota es válida." : "La nota no es válida.");
		int dd = 15, mm = 02, diaNacimiento = 27, mesNacimiento = 04, aaaaNacimiento = 1999;
		
		System.out.println(dd == diaNacimiento && mm == mesNacimiento && aaaa != aaaaNacimiento ?
				"Hoy es su cumpleaños." : "Hoy es su no cumpleaños.");
		byte edad = 14;
		System.out.println(edad >= 18 ? "Puede votar." : "Aún no puede votar.");
		int numero = 33;
		System.out.println(numero % 3 == 0 && numero % 5 == 0 ?
				"El número es divisible por 3 y por 5, pero no por 7" : "El número no cumple los criterios de divisibilidad.");
		System.out.println((25 - 3) * 6);
		System.out.println((320 + 8) / 8 / 8);
		System.out.println((9 * 15) - (int)(24 / 5));
		System.out.println((12 - 5) / (2 * 3));
		int A = 1;
		System.out.println(N > 0 && N % 3 == 0 || A % 2 != 0 && A > 0 && A < 3 ?
				"Las condiciones se cumplen." : "Las condiciones no se cumplen.");
		System.out.println(N > 0 && M > 0 && N + M <= 15 ?
				"N y M son positivos y no suman más de 15." : "Las condiciones no se cumplen.");
		//System.out.println(A.equals("Fin") || N > 0 && N < 5);
		System.out.println(nota == 7 || nota == 8 ? "Notable." : "No es notable.");
		char sexo = 'm';
		System.out.println(sexo == 'm' && edad >= 18 && edad <= 25 ?
				"Es una mujer entre 18 y 25 años." : "No es una mujer entre 18 y 35 años.");
		System.out.println(sexo == 'h' || sexo == 'm' ? "El sexo es válido." : "El sexo no es válido.");
		byte curso = 6;
		System.out.println(curso == 1 || curso == 2 || curso == 3 || curso == 4 ?
				"El curso es válido." : "El curso no es válido");
		float precio = 119.9F;
		System.out.println(precio >= 50F && precio <= 150F ?
				"El precio es aplicable" : "El precio no es aplicable.");
	}

}
