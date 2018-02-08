/*Crea una clase Fecha con atributos para el dÃ­a, el mes y el aÃ±o de la fecha. Incluye, al 
	menos, los siguientes mÃ©todos: 
	  1-Constructor predeterminado con el 1-1-1900 como fecha por defecto. 
	  2-Constructor parametrizado con dÃ­a, mes y aÃ±o. 
	  3-leer(): pedirÃ¡ al usuario el dÃ­a (1 a 31), el mes (1 a 12) y el aÃ±o (1900 a 2050). 
	  4-bisiesto(): indicarÃ¡ si el aÃ±o de la fecha es bisiesto o no. 
	  5-diasMes(int): devolverÃ¡ el nÃºmero de dÃ­as del mes que se le indique (para el aÃ±o de la fecha). 
	  6-valida(): comprobarÃ¡ si la fecha es correcta (entre el 1-1-1900 y el 31-12-2050); 
			si el dÃ­a no es correcto, lo pondrÃ¡ a 1; si el mes no es correcto, lo pondrÃ¡ a 1; y 
			si el aÃ±o no es correcto, lo pondrÃ¡ a 1900. SerÃ¡ un mÃ©todo auxiliar (privado). 
			Este mÃ©todo se llamarÃ¡ en el constructor parametrizado y en leer(). 
	  7-Accedentes y mutadores. 
	  8-corta(): mostrarÃ¡ la fecha en formato corto (02-09-2003). 
	  9-diasTranscurridos(): devolverÃ¡ el nÃºmero de dÃ­as transcurridos desde el 1-1-1900 hasta la fecha. 
	  10-diaSemana(): devolverÃ¡ el dÃ­a de la semana de la fecha (0 para domingo, ..., 6 para sÃ¡bado). El 1-1-1900 fue domingo. 
	  11-larga(): mostrarÃ¡ la fecha en formato largo, empezando por el dÃ­a de la semana (martes 2 de septiembre de 2003). 
	  12-fechaTras(long): harÃ¡ que la fecha sea la correspondiente a haber transcurrido los dÃ­as que se indiquen desde el 1-1-1900. 
	  13-diasEntre(Fecha): devolverÃ¡ el nÃºmero de dÃ­as entre la fecha y la proporcionada. 
	  14-siguiente(): pasarÃ¡ al dÃ­a siguiente. 
	  15-anterior(): pasarÃ¡ al dÃ­a anterior. 
	  16-copia(): devolverÃ¡ un clon de la fecha. 
	  17-igualQue(Fecha): indica si la fecha es la misma que la proporcionada. 
	  18-menorQue(Fecha): indica si la fecha es anterior a la proporcionada. 
	  19-mayorQue(Fecha): indica si la fecha es posterior a la proporcionada. 
 */
import java.util.Scanner;

public class Ejercicio04{

	private int dia,mes,anio;
	
	//Constructor por defecto con dia = 1, mes =1  y año = 1900
	public Ejercicio04(){
		dia = 1;
		mes = 1;
		anio = 1900;
	}
	
	//Constructor de clase con dia, mes y año. Invoca al método valida() para comprobar si la fecha es correcta
	public Ejercicio04(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		valida();
	}
	
	//Método para leer dia, mes y aÃ±o por teclado. Invoca al mÃ©todo valida() para comprobar si la fecha es correcta
	public void leer () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce dia (1 a 31): ");
		dia = sc.nextInt();
		System.out.println("Introduce mes (1 a 12): ");
		mes = sc.nextInt();
		System.out.println("Introduce anio (1900 a 2050): ");
		anio = sc.nextInt();
		valida();
	}
	
	//Método para comprobar si un año es bisiesto o no. Si lo es, devuelve true, sino, devuelve false
	//Un año es bisiesto EXCEPTO los multiplos de 100 que NO son multiplos de 400
	public boolean bisiesto() {
		if (anio % 4 == 0 && ! (anio % 100 == 0 && anio % 400 != 0)){
			return true;
		}else{
			return false;
		}
	}
	
	//Método diasMes() que devuelve el número de días que tiene el mes, según el mes que le introduzcamos. En el caso de febrero, comprueba 
	//si el año es bisiesto con el método bisiesto() y si lo es, devuelve 29 dias, sino, devuelve 28 dias
	public int diasMes() {
		switch (mes){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			return 31;
		case 4:case 6:case 9:case 11:
			return 30;
		default:
			if (bisiesto())
				return 29;
			else
				return 28;
		}
	}
	
	//Método que valida si la fecha es correcta. Si no lo es, por defecto asigna al dia el valor 1, al mes el valor 1 y al año el valor 1900
	private void valida() {
		if (this.dia < 1 || this.dia > 31){
			System.out.println("Error. Los dÃ­as no pueden "
					+ "ser menores de 1 y mayores que 31."
					+ "\nPor defecto, el dÃ­a se establece a 1.");
			this.dia = 1;
		}
		if (this.mes < 1 || this.mes > 12){
			System.out.println("Error. Los meses no pueden "
					+ "ser menores de 1 y mayores que 12."
					+ "\nPor defecto, el mes se establece a 1.");
			this.mes = 1;
		}
		if (this.anio < 1900 || this.anio > 2050){
			System.out.println("Error. Los aÃ±os no pueden "
					+ "ser menores de 1900 y mayores que 2050."
					+ "\nPor defecto, el aÃ±o se establece a 1900.");
			this.anio = 1900;
		}
	}

	//Gets y sets
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	//Método corta() que muestra la fecha en formato corto
	public String fechaCorta () {
		return (String.format("%02d",this.dia)+"-"
				+String.format("%02d", this.mes)+"-"
				+String.format("%04d", this.anio));
	}
	
	//Método que devuelve el número de días transcurridos desde la fecha inicial hasta la fecha que nosotros le introdujimos
	//Comprueba si el año es bisiesto, si lo es, devolverá un día más que sino lo fuera.
	public int diasTranscurridos() {
		int suma = 0;
		for (int i=1900; i<anio; i++) {
			if (bisiesto())
				suma = suma + 366;
			else
				suma = suma + 365;
		}
		for (int i=1; i<mes; i++) {
			switch (i){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				suma = suma + 31;
			case 4:case 6:case 9:case 11:
				suma = suma + 30;
			case 2:
				if (bisiesto())
					suma = suma + 29;
				else
					suma = suma + 28;
			}
		}
		suma = suma + dia - 1;
		return suma;
	}
	
	//Método que devuelve el día de la semana que fue la fecha que le introdujimos anteriormente
	public int diaSemana () {
		return (int)this.diasTranscurridos() % 7;
	}
	
	//Método que devuelve la fecha introducida en formato largo. Dependiendo del día introducido escribirá lunes...domingo. 
	//Dependiendo del mes escribirá enero...diciembre; luego, escribirá todo, seguido del año introducido
	public String fechaLarga () {
		switch (this.diaSemana()) {
			case 0: return "Domingo, " +this.dia+this.mesLargo()+this.anio;
			case 1: return "Lunes, "+this.dia+this.mesLargo()+this.anio; 
			case 2: return "Martes, "+this.dia+this.mesLargo()+this.anio; 
			case 3: return "Miércoles, "+this.dia+this.mesLargo()+this.anio; 
			case 4: return "Jueves, "+this.dia+this.mesLargo()+this.anio; 
			case 5: return "Viernes, "+this.dia+this.mesLargo()+this.anio; 
			default: return "SÃ¡bado, "+this.dia+this.mesLargo()+this.anio;
		}
	}
	public String mesLargo () {
		switch (this.mes) {
			case 1: return " de Enero de "; 
			case 2: return " de Febrero de ";
			case 3: return " de Marzo de "; 
			case 4: return " de Abril de "; 
			case 5: return " de Mayo de "; 
			case 6: return " de Junio de "; 
			case 7: return " de Julio de "; 
			case 8: return " de Agosto de "; 
			case 9: return " de Septiembre de "; 
			case 10: return " de Octubre de "; 
			case 11: return " de Noviembre de "; 
			default: return " de Diciembre de "; 
		}
	}
	
	//Método que hará que la fecha sea la correspondiente a haber transcurrido 
	//los días que se indiquen desde el 1-1-1900.
	public void fechaTras (long dias) {
		boolean seguir = true;
		anio = 1900;
		while (seguir == true) {
			int diasAnio = 365;
			if (bisiesto())
				diasAnio = 366;
			if (dias > diasAnio) {
				dias = dias - diasAnio;
				anio++;
			}
			else
				seguir = false;
		}
		mes = 1;
		seguir = true;
		while (seguir == true) {
			int diasMes = diasMes();
			if (dias > diasMes) {
				dias = dias - diasMes;
				mes++;
			}
			else {
				seguir = false;
			}
		}
		dia = (int)dias;
	}
	
	//Método que devolverá el número de días entre la fecha 
	//por defecto y la proporcionada.
	public int diasEntre(Ejercicio04 fecha) {
		return fecha.diasTranscurridos() - this.diasTranscurridos();
	}
	
	//Método que pasará al día siguiente
	public void siguiente() {
		long hoy = diasTranscurridos();
		long maniana = hoy + 1;
		fechaTras(maniana);
	}
	
	//Método que pasará al día anterior
	public void anterior() {
		long hoy = diasTranscurridos();
		long ayer = hoy - 1;
		fechaTras(ayer);
	}
	
	//Método que devuelve un clon de la fecha
	public Ejercicio04 clon() {
		return new Ejercicio04(this.dia,this.mes,this.anio);
	}
	
	//Método que indica si la fecha es la misma que la proporcionada.
	public boolean igualQue(Ejercicio04 fecha) {
		if(this.dia == fecha.dia && this.mes == fecha.mes && this.anio == fecha.anio)
			return true;
		else
			return false;
	}
	
	//Método que indica si la fecha es anterior a la fecha proporcionada
	public boolean menorQue(Ejercicio04 fecha) {
		if(this.anio < fecha.anio || (this.anio == fecha.anio && this.mes < fecha.mes) || 
				(this.anio == fecha.anio && this.mes == fecha.mes && this.dia < fecha.dia))
			return true;
		else
			return false;
	}
	
	//Métodoque indica si la fecha es posterior a la fecha proporcionada
	public boolean mayorQue(Ejercicio04 fecha) {
		if(!this.igualQue(fecha) && !this.menorQue(fecha))
			return true;
		else 
			return false;
	}	
}