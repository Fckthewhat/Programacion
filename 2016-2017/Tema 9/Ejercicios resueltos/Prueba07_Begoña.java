package Ejercicios_escritos_por_Bego�a;

import javax.swing.*;
import java.awt.*;
public class Prueba07_Bego�a extends JFrame{
	
	private static final long serialVersionUID = 1L;
	static int ANCHO =275;
	static int ALTO = 175;
	public Prueba07_Bego�a(){
		super("Mi marco");
		JButton b1 = new JButton("Boton 1");
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");
		JButton b4 = new JButton("Boton 4");
		JButton b5 = new JButton("Boton 5");
		JButton b6 = new JButton("Boton 6");
		Box cajaH = Box.createHorizontalBox(); // m�todo factor�a crea objeto caja vertical
		cajaH.add(b1);
		// separaci�n horizontal de 10 pixeles
		//cajaH.add(Box.createHorizontalStrut(10));
		cajaH.add(b2);
		//cajaH.add(Box.createHorizontalStrut(10));
		// zona r�gida, separaci�n horizontal
		//cajaH.add(Box.createRigidArea(new Dimension(5,5)));
		cajaH.add(b3);
		//cajaH.add(Box.createRigidArea(new Dimension(5,5)));
		add(cajaH,BorderLayout.NORTH);
		Box cajaV = Box.createVerticalBox();
		cajaV.add(Box.createHorizontalStrut(70));
		cajaV.add(b4);
		// separaci�n horizontal 10 pixeles
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(b5);
		cajaV.add(Box.createVerticalStrut(10));
		//cajaV.add(Box.createRigidArea(new Dimension(5,5)));
		cajaV.add(b6);
		add(cajaV/*,BorderLayout.CENTER*/);
		setSize(ANCHO,ALTO);
		setVisible(true);
	}
	public static void main(String args[]){
		Prueba07_Bego�a miMarco = new Prueba07_Bego�a();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
