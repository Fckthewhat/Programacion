package EJER01_ExamenSorpresa_21_2_2017_PRACTICAE1;

import java.util.GregorianCalendar;

public class TestHerencia3 {

	public static void main(String[] args) {
		Frescos huevos = new Frescos("Espanya","HUEFRE001", new GregorianCalendar(2017, 02, 22),
			new GregorianCalendar(2017, 01, 19));
		Frescos agua = new Frescos("AGUFRE008", "Portugal",new GregorianCalendar(2017, 02, 22),
			new GregorianCalendar(2017, 01, 19));
		Refrigerados yogur = new Refrigerados("Refrigerados de frio xD ",10.0,"YOGREF140", "Galicia", 
			new GregorianCalendar(2017, 02, 22), new GregorianCalendar(2017, 01, 19));
		Refrigerados queso = new Refrigerados("EU-2007/07",11.0,"QUEREF112", "Paises Bajos",
			new GregorianCalendar(2017, 02, 22),new GregorianCalendar(2017, 01, 19));
		Refrigerados york = new Refrigerados("EU-2007/07",11.0,"YORREF114", "Reino Unido",
			new GregorianCalendar(2017, 02, 22),new GregorianCalendar(2017, 01, 19));
		Agua panga = new Agua(15.6,-5.5,"EE.UU","PANCON309",new GregorianCalendar(2016, 03, 14),
			new GregorianCalendar(2023, 07, 15));
		Agua merluza = new Agua(-5, 3.7,"Somalia", "MERCON401", new GregorianCalendar(2023, 07, 15),
			new GregorianCalendar(2016, 03, 14));
		Aire guisantes = new Aire(78,21,0.04,0.96,-2,"GUICON071", "Luxemburgo",
			new GregorianCalendar(2019, 9, 21),new GregorianCalendar(2016, 03, 14));
		Aire habichuelas = new Aire(78, 21, 0.04, 0.96,-2,"MERCON862", "Francia",
			new GregorianCalendar(2021, 0, 6),new GregorianCalendar(2016, 03, 14));
		Nitrogeno mesenterio = new Nitrogeno("Ultracongelacion semilenta",-87.45, 26.5,"Suecia","MESCON616",
			new GregorianCalendar(2017, 1, 21),new GregorianCalendar(2017, 3, 10));
		Productos tienda[] = new Productos[10];
			tienda[0] = huevos;
			tienda[1] = agua;
			tienda[2] = yogur;
			tienda[3] = queso;
			tienda[4] = york;
			tienda[5] = panga;
			tienda[6] = merluza;
			tienda[7] = guisantes;
			tienda[8] = habichuelas;
			tienda[9] = mesenterio;
		
		System.out.println(tienda[0].toString() + "\n\n" + tienda[1].toString()
			+ "\n\n" + tienda[2].toString() + "\n\n" + tienda[3].toString() +
			"\n\n" + tienda[4].toString() + "\n\n" + tienda[5].toString() +
			"\n\n" + tienda[6].toString() + "\n\n" + tienda[7].toString() +
			"\n\n" + tienda[8].toString() + "\n\n" + tienda[9].toString());
	}
}
