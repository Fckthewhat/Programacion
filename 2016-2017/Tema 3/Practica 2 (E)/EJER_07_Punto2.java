package PRACTICA2_ENTRENAMIENTO;
/////////////////////////////////
/////		P03_E07			/////
/////////////////////////////////

//***********************************************************************************************
//*		7.	Desarrollar una clase que represente un punto en el plano y tenga los siguientes 	*
//*			métodos: cargar los valores de x e y, imprimir en que cuadrante se encuentra dicho 	*
//*			punto (concepto matemático, primer cuadrante si x e y son positivas, si x<0 e y>0 	*
//*			segundo cuadrante, etc.)															*
//***********************************************************************************************
/**
 * 
 * @author begoña
 *
 */

public class EJER_07_Punto2 {
private double x,y;
	
	//**************CONSTRUCTORES
		public void Punto2(){
			this.x=0;
			this.y=0;
		}
		
		public void Punto2(double x, double y){
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
		
//****Método cuadrante
		public void cuadrante(){
			if(this.x==0)
				if(this.y==0)
					System.out.println("el Punto ("+this.x+","+this.y+") es el origen de coordenadas");
				else
					if(this.y>0)
						System.out.println("el Punto ("+this.x+","+this.y+") "
								+ "se encuentra en la rama positiva del eje de ordenadas");
					else
						System.out.println("el Punto ("+this.x+","+this.y+") "
								+ "se encuentra en la rama negativa del eje de ordenadas");
			else
				if(x>0)
					if(this.y==0)
						System.out.println("el Punto ("+this.x+","+this.y+") "
								+ "se encuentra en la rama positiva del eje de abcisas");
					else
						if(this.y>0)
							System.out.println("el Punto ("+this.x+","+this.y+") "
									+ "se encuentra en el primer cuadrante");
						else
							System.out.println("el Punto ("+this.x+","+this.y+") "
									+ "se encuentra en el cuarto cuadrante");
				else
					if(this.y==0)
						System.out.println("el Punto ("+this.x+","+this.y+") "
								+ "se encuentra en la rama negativa del eje de abcisas");
					else
						if(this.y>0)
							System.out.println("el Punto ("+this.x+","+this.y+") "
									+ "se encuentra en el segundo cuadrante");
						else
							System.out.println("el Punto ("+this.x+","+this.y+") "
									+ "se encuentra en el tercer cuadrante");
		}

}
