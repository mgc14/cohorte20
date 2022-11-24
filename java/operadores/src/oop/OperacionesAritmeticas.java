package oop;

import java.util.Scanner;

public class OperacionesAritmeticas {

	
	Scanner s = new Scanner (System.in);
	
	double add () {
		System.out.print("Introduzca el numero1 a sumar ->");
		double valor0 = s.nextDouble();
		System.out.print(" Introduzcae le numero 2 a sumar -> ");
		double valor1 = s.nextDouble();
		
			return valor0 + valor1;	
	}
	double sustrac () {
		System.out.print("Introduzca el numero1 a restar ->");
		double valor0 = s.nextDouble();
		System.out.print(" Introduzcae le numero 2 a restar -> ");
		double valor1 = s.nextDouble();
		
			return valor0 - valor1;	
	}
	double producto () {
		System.out.print("Introduzca el numero1 a restar ->");
		double valor0 = s.nextDouble();
		System.out.print(" Introduzcae le numero 2 a restar -> ");
		double valor1 = s.nextDouble();
		
			return valor0 * valor1;	
	}
	double divide () {
		System.out.print("Introduzca el numero1 a dividir ->");
		double valor0 = s.nextDouble();
		System.out.print(" Introduzcae le numero 2 a dividir -> ");
		double valor1 = s.nextDouble();
		
			return valor0 - valor1;	
			if (valor1 != 0) {
				return valor0 / valor1;
			}else { return num0/num1;
	}
			return 0;
			
			
			
			
			
			
	}
}
