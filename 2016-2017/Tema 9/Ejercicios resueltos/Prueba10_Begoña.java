package Ejercicios_escritos_por_Begoña;

//import java.awt.Dimension;

import javax.swing.*;
/*import javax.swing.event.*; */
public class Prueba10_Begoña extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	JRadioButton br1, br2, br3;
	JCheckBox cv1,cv2,cv3;
	JPanel panel1;
	JLabel et1,et2, linea;
	
	
	public Prueba10_Begoña(){
		//Panel1
		
		panel1=new JPanel();
		br1=new JRadioButton("WINDOWS",false);
		br2=new JRadioButton("LINUX",true);
		br3=new JRadioButton("MAC",false);
		et1=new JLabel("Elige un sistema operativo");
		et2= new JLabel("Elige tu especialidad");
		linea=new JLabel("_______________________________________________");
		cv1=new JCheckBox("Programación",true);
		cv2=new JCheckBox("Diseño Gráfico",false);
		cv3=new JCheckBox("Administración",true);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(et1);
		et1.setBounds(10,10,150,30);
		panel1.add(br1);
		br1.setBounds(20,40,100,30);
		panel1.add(br2);
		br2.setBounds(20,70,100,30);
		panel1.add(br3);
		br3.setBounds(20,100,100,30);
		panel1.add(linea);
		linea.setBounds(10,130,100,50);
		panel1.add(et2);
		et2.setBounds(10,170,150,30);
		panel1.add(cv1);
		cv1.setBounds(20,200,150,30);
		panel1.add(cv2);
		cv2.setBounds(20,230,150,30);
		panel1.add(cv3);
		cv3.setBounds(20,260,150,40);
		//panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.setLayout(null);
		add(panel1);
		//panel1.setDsetDefaultCloseOperation(panel1.EXIT_ON_CLOSE);
		setSize(200,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}

	public static void main(String[] args) {
		new Prueba10_Begoña();		
	}
}