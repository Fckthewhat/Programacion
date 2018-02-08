package PRACTICA1_ENTRENAMIENTO;
//***************************************************************************************
//*		9.	Dadas dos fechas en el formato día (1 a 31), mes (1 a 12) y año (entero de 	*
//*			cuatro dígitos), correspondientes a la fecha de nacimiento y fecha actual, 	*
//*			respectivamente. Redactar un programa que deduzca y visualice la edad del 	*
//*			individuo; si es la fecha de un bebé de menos de un año de edad, la edad se *
//*			debe dar en meses y días; en caso contrario, en años.						*
//***************************************************************************************
/**
 * 
 * @author begoña
 *
 */
import java.util.Scanner;
import java.util.Calendar;//Permite trabajar con fechas
					  // vamos a usarla para capturar la fecha actual	
public class P01_E09 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int dia, mes, anyo, diaA, mesA, anyoA, diaMayor=0,edad;
		boolean bisiesto;
		long milisegundosPorDia=24 * 60 * 60 * 1000;
	//CAPTURA FECHA ACTUAL
		Calendar fechaActual= Calendar.getInstance();//obtenemos fecha actual
		anyoA = fechaActual.get(Calendar.YEAR);//obtiene año
        mesA = fechaActual.get(Calendar.MONTH);//obtiene mes
        diaA = fechaActual.get(Calendar.DAY_OF_MONTH);//obtiene dia
    //fECHA DE NACIMIENTO
      //validamos año solo que no se menor que 0
        do{System.out.println("INTRODUCE FECHA DE NACIMIENTO");
        do{
        	System.out.println("Año?");
        	anyo=teclado.nextInt();
        }while(anyo<0);
      //comprobamos si es bisiesto (verdadero si lo es falso si no)
        if(anyo%40==0 ||anyo%4==0 && anyo%100!=0)
        	bisiesto=true;
        else
        	bisiesto=false;
    //validamos mes entre 1 y 12
        do{
        	System.out.println("Mes?");
        	mes=teclado.nextInt();
        }while( mes<1|| mes>12);
     //validamos dia
        System.out.println("Día?");
        dia=teclado.nextInt();
        switch(mes){
        case 1:case 3:case 5: case 7: case 8: case 10: case 12:
        	diaMayor=31;
        	break;
        case 4: case 6: case 9: case 11:
        	diaMayor=30;
        	break;
        case 2: if (bisiesto)
        			diaMayor=29;
        		else
        			diaMayor=28;
        }
       }while (dia<1 || dia>diaMayor);
    //calculamos edad
        edad=anyoA-anyo;
        if (mesA<mes || mesA==mes && diaA<dia)
        	edad=edad-1;
        if (edad>0)
        	System.out.println("La edad es "+edad+" años");
        else{
        	int numMeses=0;
        	if(anyo==anyoA)
        		numMeses=mesA-mes+1;
        	else
        		numMeses=12-mes+mesA;
        	System.out.println(numMeses+" meses");
        		
        	int numDias=0;
        	switch(mesA){
        	case 1:case 3: case 5: case 7:case 8:case 10: case 12:
        		numDias+=31-dia-1;
        		break;
        	case 4: case 6: case 9: case 11:
        		numDias+=30-dia;
        		break;
        	case 2:if(bisiesto)
        			numDias+=29-dia-1;
        		   else
        			   numDias+=28-dia-1;
        	}
        	System.out.println(numDias+" dias");
        		
        		
        	}
        	
        	
        	
        
     teclado.close();   
	}
		
}


