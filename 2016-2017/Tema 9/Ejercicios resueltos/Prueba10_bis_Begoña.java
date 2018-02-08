package Ejercicios_escritos_por_Begoña;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Prueba10_bis_Begoña extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JRadioButton br1, br2, br3;
	JCheckBox cv1,cv2,cv3;
	JPanel panel1;
	JLabel et1,et2, linea;
	
	
	public Prueba10_bis_Begoña(){
		//Panel1
		
		panel1=new JPanel();
		br1=new JRadioButton("WINDOWS",false);
		br2=new JRadioButton("LINUX",true);
		br3=new JRadioButton("MAC",false);
		et1=new JLabel("Elige un sistema operativo");
		et2= new JLabel("Elige tu especialidad");
		linea=new JLabel("__________________________________________");
		cv1=new JCheckBox("Programación",true);
		cv2=new JCheckBox("Diseño Gráfico",false);
		cv3=new JCheckBox("Administración",true);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(et1);
		panel1.add(br1);
		panel1.add(br2);
		panel1.add(br3);
		panel1.add(linea);
		panel1.add(et2);
		panel1.add(cv1);
		panel1.add(cv2);
		panel1.add(cv3);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		add(panel1);
		setSize(175,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Prueba10_bis_Begoña();
	}
}