package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class MetodosvariosArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		int n1,n2;
		
		/*
		 * B) MÉTODOS DE ARRAYLIST y C) EJERCICIO PROBANDO LOS MÉTODOS: 
		 */
		
		//Añadir elementos con add
		System.out.println("Lista creada: "+lista.toString());
		System.out.println("Introduzca primer número a introducir en array list: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca segundo número a introducir en array list: ");
		n2 = sc.nextInt();
		System.out.println("Añado los anteriores números al array list: "+n1+" y "+n2);
		lista.add(n1);
		lista.add(n2);
		System.out.println("Lista creada: "+lista.toString());
		
		//Añadir elementos con add en posición 0
		System.out.println("Introduzca primer número a introducir en array list: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca segundo número a introducir en array list: ");
		n2 = sc.nextInt();
		System.out.println("Añado los anteriores números al array list: "+n1+" y "+n2);
		lista.add(0, n1);
		lista.add(0, n2);
		System.out.println("Lista creada: "+lista.toString());
		
		//Obtener tamaño de la lista con size
		System.out.println("El número de elementos con size es: "+lista.size());
		
		//Recuperar elementos y posiciones en el ArrayList:
		for (int i=0;i<lista.size();i++){
			System.out.println("El elemento en la posicion 0"+i+" con get es: "+lista.get(i));
		}
		
		 //También podría conocer los elementos que posee el arraylist, 
		 //pero no la posición de cada elemento con este foreach:
		 // for (Integer numero : lista) {
		 // 	System.out.println(numero);
		 // }
		
		//Encontrar elementos en el ArrayList con IndexOf
		int posicion = lista.indexOf(3);
		if (posicion == -1)
			System.out.println("Utilizo indexof y no se encuentra en la lista el 3: ");
		else
			System.out.println("El 3 se encuentra sí se encuentra en la posición"+posicion);
		
		/*
		 * D) RECORRIDOS ARRAYLIST CON FOR,FOREACH,ITERATOR Y ENUMERATION:
		 */
		
		//Con For
		System.out.println("Listado con for");
		for(int i = 0;i<lista.size();i++){
			System.out.println(lista.get(i)+"  ");
		}
		System.out.println();
		
		//Con Foreach
		System.out.println("Listado con foreach");
		for(Integer ele : lista){
			System.out.println(ele+"  ");
		}
		System.out.println();
		
		//Con Iterator
		System.out.println("Listado con iterator");
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()){
			Integer ele = it.next();
			System.out.println(ele+"  ");
		}
		System.out.println();
		
		//Con Enumeration
		System.out.println("Listado con enumeration");
		Enumeration e = Collections.enumeration(lista);
		while(e.hasMoreElements()){
			Integer ele = (Integer) e.nextElement();
			System.out.println(ele+"  ");
		}
		System.out.println();
		sc.close();
	}
}