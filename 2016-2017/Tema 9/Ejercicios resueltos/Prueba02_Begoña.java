package Ejercicios_escritos_por_Bego�a;
//*******************************************************************************************
//*		Crea marco con t�tu�o "Marco gr�fico", con un tama�o determinado y una posici�n		*
//*		Dentro del marco incluimos un mensaje mediante el m�todo drawString() de la clase 	*
//*		Graphics.																			*
//*		El m�todo paint() de la clase Component proporciona el contexto gr�fico, represen-	*
//*		tado	por la clase Graphics; la llamada a paint() la realiza directamente el		*
//*		sistema cuando se muestra en pantalla												*
//*******************************************************************************************

import javax.swing.*;
import java.awt.*;
public class Prueba02_Bego�a extends JFrame{
	/**
	 * @serial primera versi�n
	 */
	private static final long serialVersionUID = 1L;
	private static final int ANCHO=400, ALTO=150;
	public Prueba02_Bego�a(String c)	{
		super(c);
		setSize(ANCHO,ALTO); // tama�o
		setResizable(false); // evita cambio de tama�o
		setLocation(ANCHO*2,ALTO*2);
		setVisible(true);
	}
	public void paint(Graphics g)	{
		Font tipoLetra = new Font("Courier", Font.BOLD, 14);
		g.setFont(tipoLetra);
		g.drawString("Bienvenido al curso de Programaci�n", ANCHO/10, 70);
		//drawLine(Inicio_x,Inicio_y,fin_x,fin_i)
		g.drawLine(ANCHO/10, 80, ANCHO/10 + 280, 80);
	}
	public static void main(String args[])	{
		Prueba02_Bego�a marco;
		marco = new Prueba02_Bego�a("Marco gr�fico");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

