package P04_TEMA3_LOGICAJAVA.src;

public class PR04_EJER01_PARTE4 {

	public static void main(String[] args) {
		int i, n =3;
		for (i = 0; i < n; ++i) {
			--n;
			}
			System.out.println(i);
	}
}

//Para n=0, i no ser�a < 0, por lo que no entrar�a en el for e imprimir�a en pantalla el valor de i, que ser�a 0.

//Para n=1, i ser�a <0, entrar�a en el for, sumar�a 1 valor a i y restar�a un valor a n. Siguiente paso: volver�a a intentar entrar en el for, en este caso i (que vale 1) no es menor que n (que es 0),
//por lo que no entrar�a en el bucle for y escribir�a en pantalla el valor de i (que es 1).

//Para n=3, repetir�a el proceso anterior (n=1), salvo que cuando vuelve a entrar en el bucle for por tercera vez para comprobar que i (que vale 2) sea < n (que vale 1), comprueba que no 
//es cierto e imprime el resultado de i hasta ese momento (que es 2).