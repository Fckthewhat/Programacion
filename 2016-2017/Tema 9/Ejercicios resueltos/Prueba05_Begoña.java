package Ejercicios_escritos_por_Bego�a;
import javax.swing.*;
import java.awt.*;
public class Prueba05_Bego�a extends JFrame{
	private static final long serialVersionUID = 1L;
	static int ANCHO =175;
	static int ALTO = 100;
	
	public Prueba05_Bego�a(){
		super("Mi marco");
		setLayout(new GridLayout(3,2,15,15));
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
		Prueba05_Bego�a miMarco = new Prueba05_Bego�a();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
