package colecciones;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arrays - Arreglos - matrices
		//Solo permiten un tipo de dato
		//Se tiene que especificar el tamanio
		/*
		 * String
		 * Int
		 * Double 
		 * Long
		 */
		String [] miArreglo = new String [6];
		

		miArreglo[0] = "Mag";
		miArreglo[1] = "asfd";
		miArreglo[2] = "sfgdsf";
		miArreglo[3] = "fhfdgd";
		miArreglo[4] = "hfgh";
		miArreglo[5] = "hfghg";
		System.out.println(miArreglo[0]);
		
		
		
		//miArreglo[0] = "Mag";
		
		
		for(int i=0; i<miArreglo.length; i++) {
			System.out.println("ciclo for: " + miArreglo[i]);
		}
		System.out.println("--------------");
		//forEach
		for(String nombre: miArreglo){
			System.out.println("For Each: "+ nombre);
		}
		
		//Math.pow (1, 2);
		//Arrays 
		
		System.out.println(Arrays.toString(miArreglo));
		
		//Tipos de valores
		int numeros [] = new int [5];
		
		numeros [0] = 3;
		numeros [1] = -56;
		numeros [2] = (int) 3.45; // casteo == cambiar a otro tipo de valor
		numeros [3] = Integer.parseInt("2"); //parseo == cambiar la clase 
		
		for(int numero : numeros) {
			System.out.println("Valores del arreglo numeros " + numeros);
		}
		
		//Arreglos de objetos
		Persona persona1 = new Persona("Pancho", 30);
		Persona persona2 = new Persona ("Paty", 58);
		
		// 
		Persona [] arrPersonas = new Persona [2];
		arrPersonas[0] = persona1;
		arrPersonas[1] = persona2;
		arrPersonas[2] = new Persona("Luis", 18); 
		
		System.out.println(arrPersonas[0].nombre);
		System.out.println(arrPersonas[1].nombre); 
		System.out.println(arrPersonas[2].nombre); 
		
		//Arreglos literales
		String [] arrString= {"MAnzana", "PEra","12","Hola"};
	    System.out.println(Arrays.toString(arrString));
		
	}

}
