/*  Realizar una clase Vector3d que permita manipular vectores de tres componentes en 
	coordenadas x, y, z de acuerdo con las siguientes normas: 
		1-Constructores: 
			Por defecto 
			De clase o parametrizado 
			De copia 
		2-Getter, setter y toString 
		3-Método equal para saber si dos vectores tienen sus componentes iguales. 
		4-Método  trasladar  (sobrecargado)  que  permita  obtener  un  nuevo  punto 
		trasladando la coordenada o coordenadas  adecuadas de acuerdo a la distancia o distancias especificadas.  
			Si solo se proporciona un valor se cambiará el valor de la coordenada x. 
			Si se proporcionan dos valores cambiaremos las coordenadas x e y. 
			Si  se  proporcionan  tres  valores  cambiaremos  los  valores  de  todas  las coordenadas.
*/
public class Ejercicio05 {
	
	private double coordX,coordY,coordZ;

	//Constructor por defecto que establece coordenadas X, Y y Z a 0
    public Ejercicio05() {
        this.coordX = 0;
        this.coordY = 0;
        this.coordZ = 0;
    }

    //Constructor de clase con coordenadaX, coordenadaY y coordenadaZ
    public Ejercicio05(double coordenadaX, double coordenadaY, double coordenadaZ) {
        this.coordX = coordenadaX;
        this.coordY = coordenadaY;
        this.coordZ = coordenadaZ;
    }
    
    //Constructor de copia que le llamo vector. Establece que coordenadas X, Y y Z van a ser 
    //vector.coordenadasX, vector.coordenadasY y vector.coordenadasZ
    public Ejercicio05(Ejercicio05 vector) {
        this.coordX = vector.coordX;
        this.coordY = vector.coordY;
        this.coordZ = vector.coordZ;
    }

    //Gets y Sets
    public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}

	public double getCoordZ() {
		return coordZ;
	}

	public void setCoordZ(double coordZ) {
		this.coordZ = coordZ;
	}

	//Método que evalúa si el vector introducido al principio y el nuevo vector establecido en el constructor de copia
	//son iguales (coordenadas X, Y y Z iguales). Si es así, devuelve true y sino, devuelve falso.
	public boolean equal(Ejercicio05 vector) {
		if(this.getCoordX() == vector.getCoordX() && this.getCoordY() == vector.getCoordY()
				&& this.getCoordZ() == vector.getCoordZ())
			return true;
		return false;
	}
	
    //Método para trasladar el vector sólo en el eje de X
    public void trasladar(double x){
        this.setCoordX(this.getCoordX()+x);
    }

    //Método para trasladar el vector en el eje X y en el eje Y
    public void trasladar(double x, double y){
        this.setCoordX(this.getCoordX()+x);
        this.setCoordY(this.getCoordY()+y);
    }

    //Método para trasladar el vector en el eje X, en el eje Y y en el eje Z
    public void trasladar(double x, double y, double z){
        this.setCoordX(this.getCoordX()+x);
        this.setCoordY(this.getCoordY()+y);
        this.setCoordZ(this.getCoordZ()+z);
    }

    //To string que devuelve los valores de las coordenadas X, Y y Z de la siguiente forma:
    //(coordX,coordY,coordZ)
    @Override
    public String toString() {
        return "("+coordX+", "+coordY+", "+coordZ+")";
    }
}