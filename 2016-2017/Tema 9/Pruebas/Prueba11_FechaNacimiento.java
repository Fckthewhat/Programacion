/*
 * JComboBox de edad (ventanas desplegables de dia, mes y año. Luego, ventana de enviar y 
 * ventana de "usted ha nacido:... + fecha seleccionada".
 * 
 * 	SOLUCIÓN DE BEGOÑA:
 */
package PruebasClase;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Prueba11_FechaNacimiento extends JFrame{

	private static final long serialVersionUID = 1L;
	/* static int ANCHO = 275, ALTO = 200; */
	private static JPanel p1,p2;
	private static JComboBox <Integer>jc1,jc3;
	private static JComboBox <String> jc2;
	private static JLabel et1,et2,etDia,etMes,etAnyo;
	private JButton bt1;
	private JTextField tf;
	
	public Prueba11_FechaNacimiento(){
		super("Fecha de Nacimiento");
			
	}
}
