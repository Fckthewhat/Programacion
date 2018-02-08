package PruebasClase;

import javax.swing.*;
import java.awt.*;

public class Prueba10_Javi extends JFrame{

	private static final long serialVersionUID = 1L;
	JRadioButton win, lin, mac;
	JCheckBox pro,dig,adm;
	JPanel panel1;
	JLabel sistema,linea,especialidad;
	
	public Prueba10_Javi(){
		super("Encuesta de prueba");
		
		panel1 = new JPanel();
		JLabel sistema = new JLabel ("Elija un sistema operativo");
		JRadioButton win = new JRadioButton("Windows",false);
		JRadioButton lin = new JRadioButton("Linux",true);
		JRadioButton mac = new JRadioButton("Mac",false);
		
		JLabel linea = new JLabel ("--------------------------------");
		
		JLabel especialidad = new JLabel ("Elige tu especialidad");
		JCheckBox pro = new JCheckBox("Programación",true);
		JCheckBox dig = new JCheckBox("Diseño gráfico",false);
		JCheckBox adm = new JCheckBox("Administración",true);
	
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(sistema);
		panel1.add(win);
		panel1.add(lin);
		panel1.add(mac);
		panel1.add(linea);
		panel1.add(especialidad);
		panel1.add(pro);
		panel1.add(dig);
		panel1.add(adm);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		add(panel1);
		setSize(175,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main (String []args){
		new Prueba10_Javi();
	}
}

