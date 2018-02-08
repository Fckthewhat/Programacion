/**
 * 	/////////////////////////////////
			/////		P03_E01			/////
			/////////////////////////////////
//*******************************************************************************
//*		1.	Implementar la clase Asignatura que represente el nombre de una 	*
//*		asignatura y la nota correspondiente obtenida. Las operaciones son:		*
//*			•	Constructor que acepte como parámetros el nombre de la 			*
//*					asignatura y la nota obtenida.								*
//*			•	Métodos para modificar la nota (setNota) y para consultar		*
//*					la nota (getNota).											*
//*			•	Método que nos devuelva “Aprobado” si la nota es mayor o 		*
//*					igual a 60 o “suspenso” si la nota es menor que 60.			*
//*			•	Método para consultar el nombre de la asignatura.				*
//*******************************************************************************
 */
package PRACTICA2_ENTRENAMIENTO;


public class EJER_01_Asignatura {
	private String asignatura;
	private int nota;
	
//*******CONSTRUCTORES
	public void Asignaturas(){
	}
	public void Asignaturas(String asignatura,int nota){
		this.asignatura=asignatura;
		this.nota=nota;
	}
	
//OBTIENE (getNota) Y CAMBIA LA NOTA (setNota)
	public int getNota(){
		return this.nota;
	}
	
	public void setNota(int nota){
		this.nota=nota;
	}
	
//************ Metodo aprobado/suspenso
	public String aprobado_susp(){
		if (this.nota>=60)
			return "APROBADO";
		return "SUSPENSO";
	}
	
//***************consulta el nombre de la asignatura
	public String getAsignatura(){
		return this.asignatura;
	}
	
	
	public void setAsignatura(String asignatura){
		this.asignatura=asignatura;
	}
}

