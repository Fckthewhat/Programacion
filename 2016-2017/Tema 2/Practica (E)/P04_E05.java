package PRACTICA4_ENTRENAMIENTO;

public class P04_E05 {

	public static void main(String[] args) {
		int i = 5, j = 7, x = 2, y = 2, z = 2;
		float f = 5.5f, g = -3.25f;
		System.out.println(i += 5);
		System.out.println(i++);
		System.out.println(x * ++i - 7);
		System.out.println(f -= g);
		System.out.println(++x);
		System.out.println(++x + x++);
		System.out.println(j *= (i-3));
		System.out.println(j--);
		System.out.println(x = i++);
		System.out.println(f /= 3);
		System.out.println(--j);
		System.out.println(i %= (j - 2));
		System.out.println(x = ++i);
		System.out.println(x *= -2 * (y + z) / 3);
		System.out.println(x = --i);
		
		System.out.println("El valor de i es " + i);
		System.out.println("El valor de j es " + j);
		System.out.println("El valor de x es " + x);
		System.out.println("El valor de y es " + y);
		System.out.println("El valor de z es " + z);
		System.out.println("El valor de f es " + f);
		System.out.println("El valor de g es " + g);



	}

}
