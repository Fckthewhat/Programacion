package PRACTICA2_ENTRENAMIENTO;

/////////////////////////////////
/////		P03_E11		/////
/////////////////////////////////

//*******************************************************************************************
//*		12.	Modificar la clase persona para incluir los atributo:							*
//*		•	Estado civil																	*
//*		•	NIF																				*
//*		Añadir los métodos que creas necesarios y dos métodos para:							*
//*		•	validar el Estado civil ( solo puede tomar los valore s, c, v d o) y el nif 	*
//*			(tiene exactamente 9 cifras 8 dígitos y una letra)								*
//*******************************************************************************************
/**
 * 
 * @author begoña
 *
 */
 
public class EJER_12_Persona1 {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private char sexo;
	private int edad;
	private String direccion;
//***** añadidos de la clase Persona
	private char EC;
	private String NIF;
	
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public EJER_12_Persona1(){
	}
	
	/**
	 * CONSTRUCTOR DE CLASE
	 * @param nombre cadena
	 * @param apellido1 cadena
	 * @param apellido2 cadena
	 * @param sexo caracter H/M
	 * @param edad entero
	 * @param direccion cadena
	 */
	public EJER_12_Persona1(String nombre, String apellido1, String apellido2,char sexo, int edad,String direccion,char EC,String NIF){
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.sexo=sexo;
		this.edad=edad;
		this.direccion=direccion;
		//*****Añadidos de la clase persona incluidos en la lista de parámetros
		this.EC=EC;
		this.NIF=NIF;
	}
	
	/**
	 * CONSTRUCTOR DE COPIA
	 * @param persona objeto tipo persona
	 */
	public EJER_12_Persona1(EJER_12_Persona1 persona){
		this.nombre=persona.nombre;
		this.apellido1=persona.apellido1;
		this.apellido2=persona.apellido2;
		this.sexo=persona.sexo;
		this.edad=persona.edad;
		this.direccion=persona.direccion;
	//*****Añadidos de la clase persona
		this.EC=persona.EC;
		this.NIF=persona.NIF;
	}
	
	/**
	 * CAMBIA VALOR DEL NOMBRE
	 * @param nombre cadena 
	 */
	public void setNombre(String nombre){
		this.nombre=new String (nombre);
	}
	
	/** 
	 *CAMBIA EL VALOR DEL APELLIDO PATERNO
	 * @param Apellido1 cadena
	 */
	public void setApellido1(String Apellido1){
		this.apellido1=new String (apellido1);
	}
	
	/**
	 * CAMBIA EL VALOR DEL APELLIDO MATERNO
	 * @param Apellido2 cadena
	 */
	public void setApellido2(String Apellido2){
		this.apellido2=new String(apellido2);
	}
	
	/**
	 * CAMBIA EL VALOR DE LA VARIABLE SEXO
	 * @param sexo caracter H/M
	 */
	public void setSexo(char sexo){
		this.sexo=sexo;
	}
	
	/**
	 * CABIA EL VALOR DE EDAD
	 * @param edad entero
	 */
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	/**
	 * CAMBIA EL VALOR DE LA DIRECCIÓN
	 * @param direccion cadena
	 */
	public void setDireccion(String direccion){ 
		this.direccion=new String (direccion);
	}
	
	//***** añadidos de persona
	public void setEC(char EC){
		this.EC=EC;
	}
	
	public void setNIF(String NIF){
		this.NIF=NIF;
	}
	
	/**
	 * DEVUELVE EL VALOR DEL NOMBRE
	 * @return cadena
	 */
	public String getNombre(){
		return this.nombre;
	}
	
	/**
	 * DEVUELVE EL VALOR DEL APELLIDO PATERNO
	 *  @return cadena
	 */
	public String getApellido1(){
		return this.apellido1;
	}
	
	/**
	 * DEVUELVE EL VALOR DEL APELLIDO MATERNO
	 * @return cadena
	 */
	public String getApellido2(){
		return this.apellido2;
	}
	
	/**
	 * DEVUELVE EL CALOR DE LA VARIABLE SEXO
	 * @return caracter H/M
	 */
	public char getSexo(){
		return this.sexo;
	}
	
	/**
	 * DEVUELVE EL VALOR DE LA EDAD
	 * @return int
	 */
	public int getEdad(){
		return this.edad;
	}
	
	/**
	 * DEVUELVE EL VALOR DE LA DIRECCIÓN
	 * @return cadena
	 */
	public String getDireccion(){ 
		return this.direccion;
	}
	
	//*****añadidos de la clase Persona
	public char getEC(){
		return this.EC;
	}
	
	public String getNIF(){
		return this.NIF;
	}
	
	/**
	 * CREA UNA CADENA CON LOS DATOS DE UN OBJETO PERSONA Y LOS DEVUELVE
	 * @return Cadena
	 */
	public String toString(){
		String sex;
		if(this.sexo=='H')
			sex="Hombre";
		else
			sex="Mujer";
		return "NOMBRE: "+this.nombre+
				"PRIMER APELLIDO: "+this.apellido1+
				"SEGUNDO APELLIDO: "+this.apellido2+
				"SEXO: "+sex+
				"EDAD: "+this.edad+
				"DIRECCIÓN: "+this.direccion;
	}
	
	/**
	 * COMPRUEBA Y DEVUELVE SI UNA PERSONA ES MAYOR DE EDAD
	 * @return boolean true mayor de edad
	 * 			false menor de edad
	 */
	public boolean mayorDeEdad(){
		if(this.edad>=18)
			return true;
		return false;
	}
	
	public boolean validaEstCiv(){
		if(this.EC=='c'||this.EC=='s'||this.EC=='d'||this.EC=='v'||this.EC=='o')
			return true;
		return false;
	}
	
	public boolean validaNIF(){
		if (this.NIF.length()!=9)
			return false;
		else{
			for(int i=0;i<8;i++)
				if (this.NIF.charAt(i)<'0'|| this.NIF.charAt(i)>'9')
					return false;
			if(this.NIF.charAt(8)<'A'||this.NIF.charAt(8)>'z')
				return false;
			return true;
				
		}
	}


}
