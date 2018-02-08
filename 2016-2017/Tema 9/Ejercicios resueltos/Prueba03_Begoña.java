package Ejercicios_escritos_por_Bego�a;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Prueba03_Bego�a extends JFrame{
	private static final long serialVersionUID = 1L;
	static int ANCHO =275;
	static int ALTO = 200;
	
	public Prueba03_Bego�a(){
		super("Mi marco");
		Border borde = BorderFactory.createLineBorder(Color.black);
		JLabel norte=new JLabel("Norte", SwingConstants.CENTER);
		norte.setBorder(borde);
		add(norte, BorderLayout.NORTH);
		add(new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
		add(new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
		add(new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
		add(new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);
		setSize(ANCHO,ALTO);
		setVisible(true);
	}
	
	public static void main(String args[]){
		Prueba03_Bego�a miMarco = new Prueba03_Bego�a();
		miMarco.setLayout(new BorderLayout(11, 60) );
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


