package INTERFACES;

public class Circulo implements Figura {

	private double PI;
	private double radio;
	
	public Circulo(){
	}
	
	@Override
	public double calculoArea() {
		return PI * Math.pow(radio, 2);
	}

	@Override
	public double calculoPerimetro() {	
		return 2 * PI * radio;
	}
}
