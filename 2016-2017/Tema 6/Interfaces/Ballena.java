package INTERFACES;

public class Ballena implements Animal {
	
	String nombre="";
	int edad=0;
	
	public Ballena(){
		this.nombre="Dori";
		this.edad=50;
	}

	@Override
	public void desplazamiento() {
		System.out.println("Nada");
	}

	@Override
	public String sonido() {
		return "asñdkfjñalksdjfñisdjfokjasdkfjasokdjflñaskdjfñlksjd";
	}

	@Override
	public String comida() {
		return "Plancton";
	}
}