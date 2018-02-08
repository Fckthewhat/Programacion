/*Crea una clase Rectangulo que modele rectángulos por medio de cuatro puntos (los 
vértices). Dispondrá de dos constructores: uno que cree un rectángulo partiendo de 
sus cuatro vértices y otro que cree un rectángulo partiendo de la base y la altura, de 
forma  que  su  vértice  inferior  izquierdo  esté  en  (0,0).  La  clase  también  incluirá  un 
método para calcular la superficie y otro que desplace el rectángulo en el plano. */

public class Ejercicio01 {

	private double x1, y1, x2, y2, x3, y3, x4, y4;
	//private double base, altura;
	
	//Constructor por defecto
	public Ejercicio01 () {
		
	}
	//Constructor de clase para todos los puntos del rectángulo
	public Ejercicio01 (double x1, double y1, double x2, double y2,
					double x3, double y3, double x4, double y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		/*base = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		altura = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));*/
	}
	//Constructor para base y para altura
	public Ejercicio01 (double base, double altura) {
		x1 = 0;
		y1 = 0;
		x2 = base;
		y2 = 0;
		x3 = base;
		y3 = altura;
		x4 = 0;
		y4 = altura;
	}
	//getters y setters (Accedentes y mutadores)
	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public double getY3() {
		return y3;
	}

	public void setY3(double y3) {
		this.y3 = y3;
	}

	public double getX4() {
		return x4;
	}

	public void setX4(double x4) {
		this.x4 = x4;
	}

	public double getY4() {
		return y4;
	}

	public void setY4(double y4) {
		this.y4 = y4;
	}
	
	//método para calcular el área del rectángulo
	public double area () {
		double base = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		double altura = Math.sqrt(Math.pow(x1-x4, 2) + Math.pow(y1-y4, 2));
		return base * altura;
	}
	
	//método para calcular el perímetro del rectángulo
	public double perimetro () {
		double base = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		double altura = Math.sqrt(Math.pow(x1-x4, 2) + Math.pow(y1-y4, 2));
		return base * 2 + altura * 2;
	}
	
	//método para calcular el desplazamiento del rectángulo en el plano
	public void desplazamiento (int x, int y) {
		x1 = x1 + x;
		y1 = y1 + y;
		x2 = x2 + x;
		y2 = y2 + y;
		x3 = x3 + x;
		y3 = y3 + y;
		x4 = x4 + x;
		y4 = y4 + y;
	}
	
	//toString para mostrar los puntos dónde se encuentra el Rectángulo en ese momento
	public String toString() {
		return "\nRectangulo en puntos:\n("+x1+","+y1+"), ("+x2+","
					+y2+"), ("+x3+","+y3+"), ("+x4+","+y4+")";
	}
}