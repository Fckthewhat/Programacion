package INTERFACES;

public class Triangulo implements Figura {

	private double base;
	private double altura;
	private double lado3; //habria que meterle lado1 y lado2, porque la base y la altura no sabes que otros lados son
						  //o no...por quitarnos calculos podriamos no declararlos xD
	public Triangulo(){
	}
	
	@Override
	public double calculoArea() {
		return (base * altura)/2;
	}

	@Override
	public double calculoPerimetro() {	
		return base + altura + lado3;
	}
}
