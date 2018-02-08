package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E05			/////
/////////////////////////////////

//***********************************************************************************
//*		5.	Implementar una clase Cuenta que represente una cuenta bancaria y 		*
//*			permita	realizar operaciones como ingresar y retirar dinero, as� como	* 
//*			realizar una transferencia de una cuenta a otra. Se pide:				*
//*			�	Definir los atributos y m�todos necesarios para realizar las 		*
//*				operaciones.														*
//*			�	Implementar los m�todos. Los m�todos deben actualizar el estado de 	*
//*				los atributos y mostrar un mensaje indicando que la operaci�n se ha	* 
//*				realizado de manera correcta.										*
//*			�	Crear un programa en Java que cree un par de objetos de tipo Cuenta	* 
//*				y realice operaciones con ellos.									*
//***********************************************************************************
/**
 * 
 * @author bego�a
 *
 */


public class EJER_05_Cuenta {
	private String nCuenta;
	private String titular;
	private String NIF;
	private float saldo;
	
//*****Costructores
	public EJER_05_Cuenta(){
	}
	
	public EJER_05_Cuenta(String nCuenta,String titular,String NIF,float saldo){
		this.nCuenta=nCuenta;
		this.titular=titular;
		this.NIF=NIF;
		this.saldo=saldo;
	}
	
//*****M�TODOS GET Y SET
	public void setNCuenta(String nCuenta){
		this.nCuenta=nCuenta;
	}
	public void setTitular(String titular){
		this.titular=titular;
	}
	public void setNIF(String NIF){
		this.NIF=NIF;
	}
	public void setSaldo(float saldo){
		this.saldo=saldo;
	}
	
	public String getNCuenta(){
		return this.nCuenta;
	}
	public String getTitular(){
		return this.titular;
	}
	public String getNIF(){
		return this.NIF;
	}
	public float getsaldo(String saldo){
		return this.saldo;
	}
	
//*****M�todo Ingreso(Cambia el valor del saldo a favor)
	public void ingresar(float importe){
		if(importe>0){
			this.saldo+=importe;
			System.out.println("LA OPERACI�N SE HA REALIZADO CON EXITO. NUEVO SALDO DE LA CUENTA "+
							this.saldo);
		}
		else
			System.out.println("ERROR EN LA OPERACI�N DE INGRESO");	
	}
	
//*****M�TODO REINTEGRO( CAMBIA EL VALOR DEL SALDO
	public void reintegro(float importe){
		if(this.saldo>=importe){
			this.saldo-=importe;
			System.out.println("LA OPERACI�N SE HA REALIZADO CON EXITO. NUEVO SALDO DE LA CUENTA "+
					this.saldo);
		}
		else
			System.out.println("ERROR EN LA OPERACI�N. NO HAY SUFICIENTE SALDO EN LA CUENTA");
	}
	
//*****M�TODO TRANSFERENCIA
	public void transferencia(EJER_05_Cuenta cuenta, float importe){
		if(this.saldo>=importe){
			this.saldo-=importe;
			cuenta.saldo+=importe;
			System.out.println("La operaci�n se ha realizado con exito");
			System.out.println("El saldo de la cuenta "+this.nCuenta+" es de "+this.saldo);
			System.out.println("El saldo de la cuenta "+cuenta.nCuenta+" es de "+cuenta.saldo);
		}
		else
			System.out.println("Error en la operaci�n");
		
	}

}
