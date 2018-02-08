package Ejercicios_escritos_por_Begoña;
//*******************************************************************************************
//*		Crea marco con títuño "Marco gráfico", con un tamaño determinado y una posición		*
//*		Dentro del marco incluimos un mensaje mediante el método drawString() de la clase 	*
//*		Graphics.																			*
//*		El método paint() de la clase Component proporciona el contexto gráfico, represen-	*
//*		tado	por la clase Graphics; la llamada a paint() la realiza directamente el		*
//*		sistema cuando se muestra en pantalla												*
//*******************************************************************************************

import javax.swing.*;
import java.awt.*;
public class Prueba02_Begoña extends JFrame{
	/**
	 * @serial primera versión
	 */
	private static final long serialVersionUID = 1L;
	private static final int ANCHO=400, ALTO=150;
	public Prueba02_Begoña(String c)	{
		super(c);
		setSize(ANCHO,ALTO); // tamaño
		setResizable(false); // evita cambio de tamaño
		setLocation(ANCHO*2,ALTO*2);
		setVisible(true);
	}
	public void paint(Graphics g)	{
		Font tipoLetra = new Font("Courier", Font.BOLD, 14);
		g.setFont(tipoLetra);
		g.drawString("Bienvenido al curso de Programación", ANCHO/10, 70);
		//drawLine(Inicio_x,Inicio_y,fin_x,fin_i)
		g.drawLine(ANCHO/10, 80, ANCHO/10 + 280, 80);
	}
	public static void main(String args[])	{
		Prueba02_Begoña marco;
		marco = new Prueba02_Begoña("Marco gráfico");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

