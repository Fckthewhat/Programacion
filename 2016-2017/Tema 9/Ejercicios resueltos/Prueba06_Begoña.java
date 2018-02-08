package Ejercicios_escritos_por_Begoña;

import javax.swing.*;


public class Prueba06_Begoña extends JFrame{
	private static final long serialVersionUID = 1L;
	static int ANCHO =275;
	static int ALTO = 150;
	public Prueba06_Begoña(){
			super("Mi marco");
			JPanel panel = new JPanel() ;
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			panel.add(new JLabel("Primera"));
			panel.add(new JLabel("Segunda"));
			panel.add(new JLabel("Tercera"));
			panel.add(new JLabel("Cuarta"));
			panel.add(new JLabel("Quinta"));
			panel.add(new JLabel("Sexta"));
			add(panel);
			setSize(ANCHO,ALTO);
			setVisible(true);
	}
	
	public static void main(String args[]){
		Prueba06_Begoña miMarco = new Prueba06_Begoña();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
