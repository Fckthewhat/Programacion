package Ejercicios_escritos_por_Bego�a;



import javax.swing.*;
//import javax.swing.event.*;


class Prueba09 extends JFrame/* implements ChangeListener*/{
	private static final long serialVersionUID = 1L;
	ButtonGroup grb;
	JRadioButton br1, br2, br3;
	
	
	public Prueba09(){
		setLayout(null);
		grb = new ButtonGroup();
	// se crea bot�n de radio, se a�ade al panel y a la agrupaci�n
		br1 = new JRadioButton("Avi�n", true);
		br1.setBounds(10,20,100,30);
		//br1.addChangeListener(this);
		add(br1);
		grb.add(br1);
	// se crea bot�n de radio, se a�ade al panel y a la agrupaci�n
		br2 = new JRadioButton("Tren", false);
		br2.setBounds(10,70,100,30);
		//br2.addChangeListener(this);
		add(br2);
		grb.add(br2);
	// se crea bot�n de radio, se a�ade al panel y a la agrupaci�n
		br3 = new JRadioButton("Coche", false);
		br3.setBounds(10,120,100,30);
		//br3.addChangeListener(this);
		add(br3);
		grb.add(br3);
		  
	}
	/*public void stateChanged(ChangeEvent e) {
        if (br1.isSelected()) {
           
        }
        if (br2.isSelected()) {
            ;
        }
        if (br3.isSelected()) {
            ;
        }        
    }*/
	
	public static void main(String[] args){
		Prueba09 vista=new Prueba09();
		vista.setBounds(0,0,200,200);
        vista.setVisible(true);
        
	 }
	}
