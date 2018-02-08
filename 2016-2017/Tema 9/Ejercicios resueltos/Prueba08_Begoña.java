package Ejercicios_escritos_por_Begoña;
import javax.swing.*;
import java.awt.*;
public class Prueba08_Begoña extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Prueba08_Begoña(){
	
		JPanel pa1 = new JPanel(new FlowLayout());
		JPanel pa2 = new JPanel(new BorderLayout());
		JPanel pa3 = new JPanel();
		pa3.setLayout(new BoxLayout(pa3, BoxLayout.Y_AXIS));
		
		/*Componentes del panel 1*/
		String [] opc = {"Uno", "Dos", " Tres"};
		pa1.add(new JLabel ("Elegir", JLabel.CENTER));
		pa1.add(new JList<String>(opc));
		pa1.add(new JButton("Pulsar"));
		
		/*Componentes del panel 2*/
		JTextField j = new JTextField("Razones ");
		j.setEditable(true);
		pa2.add(j,BorderLayout.WEST);
		pa2.add(new JButton("Enviar"),BorderLayout.EAST);
		
		/*Componentes del panel 3*/
		pa3.add(new JCheckBox("Box ",false));
		pa3.add(new JLabel ("Marca aquí", JLabel.CENTER));
		pa3.add(new JRadioButton("Bot Radio", true));
		
		/*Asigna layout al marco y se ponen los paneles*/
		setLayout(new BorderLayout(10, 15));
		add(pa1,BorderLayout.NORTH);
		add(pa2,BorderLayout.CENTER);
		add(pa3,BorderLayout.SOUTH);
	}
	
		public static void main(String[] args){
		Prueba08_Begoña m;
		m = new Prueba08_Begoña();
		m.setSize(200,300);
		m.setLocation(20,200);
		m.setResizable(false);
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}