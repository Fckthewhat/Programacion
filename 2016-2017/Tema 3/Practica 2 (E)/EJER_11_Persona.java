package PRACTICA2_ENTRENAMIENTO;

/////////////////////////////////
/////		P03_E11			/////
/////////////////////////////////

//***********************************************************************************************
//*		11.	Crearemos una clase llamada “Persona”, ésta clase deberá contener los siguientes 	*
//*			atributos:																			* 
//			•	nombre 																			*
//*			•	apellido paterno 																*
//*			•	apellido materno 																*
//*			•	sexo 																			*
//*			•	edad 																			*
//*			•	dirección 																		*
//*			Se deberá crear con un constructor por defecto, un común y uno con copia, además de	*
//*			crear un método que muestre los datos de la persona y otro que diga si la persona es*
//*			mayor o menor de edad. 																*
//*			Crear otra clase que se llame “Principal” que contenga el método main y crear 3 	*
//*			objetos de tipo “Personas”, mostrar sus datos y decir si es mayor o menor de edad	*
//***********************************************************************************************
/**
 * 
 * @author begoña
 *
 */
 


public class EJER_11_Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private char sexo;
	private int edad;
	private String direccion;
	
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public EJER_11_Persona(){
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
	public EJER_11_Persona(String nombre, String apellido1, String apellido2,char sexo, int edad,String direccion){
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.sexo=sexo;
		this.edad=edad;
		this.direccion=direccion;
	}
	
	/**
	 * CONSTRUCTOR DE COPIA
	 * @param persona objeto tipo persona
	 */
	public EJER_11_Persona(EJER_11_Persona persona){
		this.nombre=persona.nombre;
		this.apellido1=persona.apellido1;
		this.apellido2=persona.apellido2;
		this.sexo=persona.sexo;
		this.edad=persona.edad;
		this.direccion=persona.direccion;
	}
	
	/**
	 * CAMBIA VALOR DEL NOMBRE
	 * @param nombre cadena 
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	/** 
	 *CAMBIA EL VALOR DEL APELLIDO PATERNO
	 * @param Apellido1 cadena
	 */
	public void setApellido1(String apellido1){
		this.apellido1=new String (apellido1);
	}
	
	/**
	 * CAMBIA EL VALOR DEL APELLIDO MATERNO
	 * @param Apellido2 cadena
	 */
	public void setApellido2(String apellido2){
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
	

}
