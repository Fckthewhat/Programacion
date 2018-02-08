package INTERFACES;

public class Pajaro implements Animal {
	
	String nombre="";
	int edad=0;
	
	//CREAMOS UN OBJETO PARA CADA CLASE
	public Pajaro(){
		this.nombre="Jota";
		this.edad=25;
	}
	//MÉTODOS DE LA INTERFAZ
	@Override
	public void desplazamiento() {
		System.out.println("Vuela");
	}

	@Override
	public String sonido() {
		return "Bogdan, he encontrado cobre!!";
	}

	@Override
	public String comida() {
		return "Cobre rumanoide";
	}
}
