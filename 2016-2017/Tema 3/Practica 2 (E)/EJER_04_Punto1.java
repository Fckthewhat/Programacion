package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E01			/////
/////////////////////////////////
//***********************************************************************************
//*		4.	Implementar una clase Punto cuyos datos miembros sean las coordenadas	* 
//*		de un punto del plano. Estos datos han de ser privados. Para esta clase se 	*
//*		piden los siguientes métodos y constructores:								*
//*		•	El constructor Punto() recibe como argumento dos números reales, a y b, *
//*				y construye un nuevo punto de la clase Punto cuyas coordenadas son 	*
//*				a y b.																*
//*		•	Los métodos de acceso getX() y getY(), sin argumentos, que devuelven las*
//*				coordenadas de un objeto Punto.										*
//		•	Los métodos modificadores setX() y setY(), que reciben un argumento y 	*
//*				modifican el valor de la correspondiente coordenada de un objeto 	*
//*				Punto.																*
//*		•	El método igual(), que comprueba si un objeto de la clase Punto es igual*
//*				a otro dado que se pasa como argumento.								*
//*		•	El método distancia(), sin argumentos, que calcula la distancia de un 	*
//*				objeto de la clase Punto al origen de coordenadas.					*
//*		•	El método distancia(), que calcula la distancia de un objeto de la clase* 
//*				Punto a otro que se proporciona como argumento.						*
//*		•	Clase principal para pruebas.											*
//***********************************************************************************
/**
 * 
 * @author begoña
 *
 */

public class EJER_04_Punto1 {
private double x,y;
	
	//**************CONSTRUCTORES
		public void Punto1(){
		}
		
		public void Punto1(double x, double y){
			this.x=x;
			this.y=y;		
		}
		
	//*************SET Y GET
		public void setX(double x){
			this.x=0;
		}
		public void setY(double y){
			this.y=y;
		}
		public double getX(){
			return this.x;
		
		}
		public double getY(){
			return this.y;
		}
		
	//********************MÉTODO IGUAL (COMPRUEBA QUE DOS PUNTOS SON IGUALES)
		public boolean igual(Punto1 punto1){
			if (this.x==punto1.x && this.y==punto1.y)
				return true;
			return false;
		}
		
	//***********************METODOs DISTANCIA
		public double distancia(){
			double dist;
			dist=Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
			return dist;
		}
		
		public double distancia(Punto1 punto1){
			double dist;
			dist=Math.sqrt(Math.pow(this.x-punto1.x, 2)+Math.pow(this.y-punto1.y, 2));
			return dist;
		}
		
	

		
	//************toString
		public String toString(){
			return "x = "+this.x+" y= "+this.y;
			//return "EL PUNTO (x,y) ES ("+x+","+y+")";
		}


}
