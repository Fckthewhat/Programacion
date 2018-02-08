package Ejercicios_escritos_por_Begoña;

import javax.swing.*;
import java.awt.*;

public class Prueba04_Begoña extends JFrame{
	private static final long serialVersionUID = 1L;
	static int ANCHO =175;
	static int ALTO = 100;
	public Prueba04_Begoña(){
		super("Mi marco");
		setLayout(new FlowLayout());
		add(new JLabel("Primera"));
		add(new JLabel("Segunda"));
		add(new JLabel("Tercera"));
		add(new JLabel("Cuarta"));
		add(new JLabel("Quinta"));
		add(new JLabel("Sexta"));
		setSize(ANCHO,ALTO);
		setVisible(true);
	}
	public static void main(String args[]){
		Prueba04_Begoña miMarco = new Prueba04_Begoña();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
