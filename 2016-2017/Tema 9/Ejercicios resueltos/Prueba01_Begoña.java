package Ejercicios_escritos_por_Begoña;
//***************************************************************************************
//*		Crea un marco sencillo título "Marco Vacio",con un tamaño de 200x150 pixeles	*
//*		y situado a al doble de la distancia y la altura del borde						*
//*		al cerrar el marco no hace nada													*				
//***************************************************************************************

import javax.swing.*;
public class Prueba01_Begoña extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int ANCHO=150, ALTO=200;
	public Prueba01_Begoña(){
		setTitle("Marco vacío");
		setSize(ANCHO,ALTO);
		setLocation(ANCHO*2,ALTO*2);
	}
	public static void main(String args[]){
		Prueba01_Begoña marco;
		marco = new Prueba01_Begoña();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}
