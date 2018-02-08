package INTERFACES;

public class Perro implements Animal {
	
	String nombre="";
	int edad=0;
	
	public Perro(){
		this.nombre="Jebús";
		this.edad=29;
	}

	@Override
	public void desplazamiento() {
		System.out.println("Anda");
	}

	@Override
	public String sonido() {
		return "Guau";
	}

	@Override
	public String comida() {
		return "Pienso";
	}
}
