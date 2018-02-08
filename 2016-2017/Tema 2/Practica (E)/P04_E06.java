package PRACTICA4_ENTRENAMIENTO;
/**
 * Dadas las variables de tipo int con valores
 * A = 5, B = 3, C = -12 Evaluar las siguientes
 * expresiones: 
 * @author Yo
 *
 */
public class P04_E06 {

	public static void main(String[] args) {
		int a = 5, b = 3, c = -12;
		System.out.println(a > 3 ? "A > 3 es cierta." : "A > 3 es falsa.");
		System.out.println(a > c ? "A > C es cierta." : "A > C es falsa.");
		System.out.println(a < c ? "A < C es cierta." : "A < C es falsa.");
		System.out.println(b < c ? "B < C es cierta." : "B < C es falsa.");
		System.out.println(b != c ? "B != C es cierta." : "B != C es falsa.");
		System.out.println(a == 3 ? "A == 3 es cierta." : "A == 3 es falsa.");
		System.out.println(a * b == 15 ? "A * B == 15 es cierta." : "A * B == 15 es falsa.");
		System.out.println(a * b == -30 ? "A * B == -30 es cierta." : "A * B == -30 es falsa.");
		System.out.println(c / b < a ? "C / B < A es cierta." : "C / B < A es falsa.");
		System.out.println(c / b == -10 ? "C / B == -10 es cierta." : "C / B == -10 es falsa.");
		System.out.println(c / b == -4 ? "C / B == -4 es cierta." : "C / B == -4 es falsa.");
		System.out.println((a + b + c) == 5 ? "A + B + C == 5 es cierta." : "A + B + C == 5 es falsa.");
		System.out.println((a + b == 8) && (a - b == 2) ?
				"A + B == 8 && A - B == 2 es cierta." : "A + B == 8 && A - B == 2 es falsa.");
		System.out.println((a + b == 8) || (a - b == 6) ?
				"A + B == 8 || A - B == 6 es cierta." : "A + B == 8 || A - B == 6 es falsa.");
		System.out.println(a > 3 && b > 3 && c < 3 ?
				"A > 3 && B > 3 && C < 3 es cierta." : "A > 3 && B > 3 && C < 3 es falsa.");
		System.out.println(a > 3 && b >= 3 && c < -3 ?
				"A > 3 && B >= 3 && c < -3 es cierta." : "A > 3 && B >= 3 && c < -3 es falsa.");
		System.out.println("A vale " + a + "\tB vale " + b + "\tC vale " + c);

	}
}