package Ejercicios_escritos_por_Bego�a;
//***************************************************************************************
//*		Crea un marco sencillo t�tulo "Marco Vacio",con un tama�o de 200x150 pixeles	*
//*		y situado a al doble de la distancia y la altura del borde						*
//*		al cerrar el marco no hace nada													*				
//***************************************************************************************

import javax.swing.*;
public class Prueba01_Bego�a extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int ANCHO=150, ALTO=200;
	public Prueba01_Bego�a(){
		setTitle("Marco vac�o");
		setSize(ANCHO,ALTO);
		setLocation(ANCHO*2,ALTO*2);
	}
	public static void main(String args[]){
		Prueba01_Bego�a marco;
		marco = new Prueba01_Bego�a();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}
