package PruebasClase;

import javax.swing.*;
/*import javax.swing.border.Border;
 * Importamos esto para utilizar "norte.setBorder(borde);"
 */
import java.awt.*;

public class Prueba03_Javi extends JFrame{

	/**
	 * @serial La version serial es 1L
	 */
	private static final long serialVersionUID = 1L;
	static int ANCHO = 275, ALTO = 200;
	
	public Prueba03_Javi(){
		super("Mi marco");
		//Border borde = BorderFactory.createLineBorder(Color.black);
		JLabel norte = new JLabel ("Norte", SwingConstants.CENTER);
		//norte.setBorder(borde);
		/*
		 * norte.setBorder(borde) le añade un borde al texto norte.
		 * Podria utilizarse así para todos, 
		 * pero habría que añadirlos a todos.
		 */
		add(norte, BorderLayout.NORTH);
		/*si no ponemos BorderLayout.NORTH o cualquier otro (SOUTH, CENTER, WEST 
		* y EAST, por defecto nos lo manda al centro*/
		add(new JLabel("Sur",SwingConstants.CENTER),BorderLayout.SOUTH);
		add(new JLabel("Centro",SwingConstants.CENTER),BorderLayout.CENTER);
		add(new JLabel("Oeste",SwingConstants.CENTER),BorderLayout.WEST);
		add(new JLabel("Este",SwingConstants.CENTER),BorderLayout.EAST);
		/*
		 * Si borramos BorderLayout de todos, va escribiendo primero Norte, luego 
		 * lo borra y escribe el siguiente y así con todos. El único que aparecería 
		 * escrito sería Este.
		 */
		setSize(ANCHO,ALTO);
		setVisible(true);
	}
	
	public static void main (String[]args){
		Prueba03_Javi miMarco = new Prueba03_Javi();
		miMarco.setLayout(new BorderLayout(11,60));
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
