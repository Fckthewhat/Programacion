package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E01			/////
/////////////////////////////////

//*******************************************************************************
//*			Se Desea crear un objeto del tipo Coordenadas, que indique, la 		*
//*			posición de un punto en el plano cartesiano, y permita calcular la 	*
//*			distancia existente con otro punto, además del punto medio entre 	*
//*			ellos.																*
//*				Distancia=√(〖(x-x1)〗^2+〖(y-y1)〗^2 )							*
//*				Punto medio														*
//*					p1= (x-x1)/2												*
//*					p2= (y-y1)/2												*
//*			Los métodos a describir son:										*
//*				Constructor por defecto: public Punto() que inicializa el punto *
//*						en (0,0)												*
//*				Constructor de clase: public Punto(doublé, doublé); inicializa 	*
//*						los valores x e y del punto a los valores de los 		*
//*						parámetros.												*
//*				Métodos set y get para el cambio de valores de las coordenadas	*
//*						y obtener dichos valores.								*
//*				Método distancia: public doublé distancia(Punto) calcula y 		*
//*						devuelve la distancia entre dos puntos uno pasado como 	*
//*						argumento y el otro será el objeto que lo invoca.		*
//*				Método puntoMedioa: public Punto puntoMedio(Punto)				*
//*				Método toScript que permite escribir las coordenadas de un 		*
//*						punto:public String toString(); 						*
//*		Crear una clase Principal para probar la clase punto					*
//*******************************************************************************
/**
* 
* @author begoña
*
*/
public class EJER_02_Punto {
	private double x,y;
	
	//**************CONSTRUCTORES
		public EJER_02_Punto(){
			this.x=0;
			this.y=0;
		}
		
		public EJER_02_Punto(double x, double y){
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
		
	//***********************METODO DISTANCIA
		public double distancia(EJER_02_Punto punto){
			double dist;
			dist=Math.sqrt(Math.pow(this.x-punto.x, 2)+Math.pow(this.y-punto.y, 2));
			return dist;
		}
		
	//**************METODO PUNTO MEDIO
		public EJER_02_Punto puntoMedio(EJER_02_Punto punto){
			EJER_02_Punto puntoMedio;
			double pmx,pmy;
			pmx=(this.x-punto.x)/2;
			pmy=(this.y-punto.y)/2;
			puntoMedio=new EJER_02_Punto(pmx,pmy);
			return puntoMedio;
		}

		
	//************toString
		public String toString(){
			return "x = "+this.x+" y= "+this.y;
			//return "EL PUNTO (x,y) ES ("+x+","+y+")";
		}

}
