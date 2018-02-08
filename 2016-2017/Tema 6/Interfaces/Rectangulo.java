package INTERFACES;

public class Rectangulo implements Figura {

	private double base;
	private double altura;
	
	//CONSTRUCTOR POR DEFECTO
	public Rectangulo(){
		this.base=5;
		this.altura=3;
	}
	
	//SET Y GET
	public double getBase() {
	    return base;
	  }
	public void setBase(double base) {
	   this.base = base;
	}

	public double getAltura() {
	   return altura;
	}

	public void setAltura(double altura) {
	   this.altura = altura;
	}
	
	//CÁLCULOS ÁREA, PERÍMETRO Y TO STRING	
	
	@Override
	public double calculoArea() { //CORREGIR
		System.out.println("Área de la figura: ");
		return this.base * this.altura;
	}

	@Override
	public double calculoPerimetro() {	
		return (2 * (base + altura)); 
	}
	
	public void figuraPlano(){
		System.out.println("Es una figura en el plano.");
	 //return "Rectangulo base=" + base + ", altura=" + altura;
	}
}
