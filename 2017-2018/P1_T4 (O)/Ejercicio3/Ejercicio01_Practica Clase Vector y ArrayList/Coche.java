package ArrayListyVector;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	private double km;
	
	public Coche(){
	}
	public Coche(String matricula, String marca, String modelo, String tipo, double km) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	public String toString () {
		return matricula+" "+marca+" "+modelo+" "+tipo+" "+km;
	}
}
