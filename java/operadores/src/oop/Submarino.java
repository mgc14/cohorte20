package oop;

public class Submarino {

	public Submarino() {
		static void submenu() {
		// TODO Auto-generated constructor stub
			
		Menu m = new Menu ();
		OperacionesAritmeticas oa = new OperacionesAritmeticas ();
		
		switch (m.subMenuOp ());
		case 1: {
			oa.add();
			break; 
		case 2: {
				System.out.println("Soy la op 2 de la oa");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	}

}
