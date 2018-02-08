package INTERFACES;

abstract class Figuras_Abstractas implements INTERFACES.Figura{
	
	public static final double PI=Math.PI;
	public abstract double calculoArea();
	public abstract double calculoPerimetro();
	public void figuraPlano(){
		System.out.println("Es una figura en el plano.");
	}
}

//ACTUALIZAR CON TODOS LOS MÉTODOS