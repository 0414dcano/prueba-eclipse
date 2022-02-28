package clase_programacion4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
/*Declaro una lista
 * para hacer las tareas con los metodos de la clase
 */
    static	List<Integer> lista1 = new ArrayList<>();//cadena de numeros
	static List<Integer> lista2 = new ArrayList<>();//cadena de numeros
	
	static List <String> cadenas1 = new ArrayList<String>();//cadena de String
	static List <String> cadenas2 = new ArrayList<String>();//cadena de String
	
	static int numeros1;
	static int numeros2;
	static int tamaño = 50;
	

 public static void main(String[] args) {
	 try (Scanner sc = new Scanner (System.in)) {
	}
	 cadenas1.add("HOLA");
	 cadenas2.add("hola");
	 for(int i = 0; i < tamaño; i++) {
		 numeros1 = (int)(Math.random()*175);
		 lista1.add(numeros1);
		 numeros2 = (int)(Math.random()*175);
		 lista2.add(numeros2);
	 }
	 
	 for(int i : lista1) {
		 System.out.println(i);
	 }
	/* System.out.println("lista1: " + lista1);
	 System.out.println("lista2: " + lista2);*/
	 

 }

}
	

