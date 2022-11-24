package oop;

import java.util.Scanner;

public class Menu {

	

		Scanner s = new Scanner (System.in); 
		void tabla () {
			int numero=0;
			System.out.print("\t\t\t ------ Menu ------");
			System.out.print("\t\t\t1: Tablas de multiplicar");
			System.out.print("\t\t\t2:Operaciones aritmeticas"); 
			System.out.print("\t\t\t3: Multiplicacion");
			System.out.print("\t\t\t4: Division");
			System.out.print("\t\t\t5: Modulo");
			System.out.print("\t\t\t6: Booleans");
			System.out.print("\t7: Salir");
			
			System.out.print("Introduzca la opcion");
			return numero = s.nextInt();
			
					
		
		}
			
			
			
			
			Scanner s = new Scanner (System.in); 
			void subMenuOp () {
				int numero=0;
				System.out.print("\t\t\t ----- Menu operaciones aritmeticas ------");
				System.out.print("\t\t\t1: Tablas de multiplicar");
				System.out.print("\t\t\t2:Operaciones aritmeticas"); 
				System.out.print("\t\t\t3: Multiplicacion");
				System.out.print("\t\t\t4: Division");
				System.out.print("\t\t\t5: Modulo");
				System.out.print("\t\t\t6: Booleans");
				System.out.print("\t7: Salir");
				
				System.out.print("Introduzca la opcion");
				return numero = s.nextInt();
	}

}
