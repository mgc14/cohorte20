package variables;

public class IntroVariabes4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	    //byte usa 256 con signo -127 a 128
	    byte numeroB = 127;
	    System.out.println("tamaño de un byte: "+Byte.SIZE);
	    System.out.println("valor maximo de byte: "+Byte.MAX_VALUE);
	    System.out.println("valor maximo de byte: "+Byte.MIN_VALUE);
	    System.out.println("El valor del byte es: "+numeroB);

	    System.out.println("---------------------------------------");
	    int entero = 545454545;
	    System.out.println("tamaño de un int en bytes: "+Integer.BYTES);
	    System.out.println("tamaño de un int en bits: "+Integer.SIZE);
	    System.out.println("valor maximo de int: "+Integer.MAX_VALUE);
	    System.out.println("valor maximo de int: "+Integer.MIN_VALUE);
	    System.out.println("El valor del entero es: "+entero);
	    System.out.println("---------------------------------------");
	    short variableS =6;
	    System.out.println("tamaño de un short en bytes: "+Short.BYTES);
	    System.out.println("tamaño de un short en bits: "+Short.SIZE);
	    System.out.println("valor maximo de short: "+Short.MAX_VALUE);
	    System.out.println("valor maximo de short: "+Short.MIN_VALUE);
	    System.out.println("---------------------------------------");
	    long variableL =545;
	    System.out.println("tamaño de un long en bytes: "+Long.BYTES);
	    System.out.println("tamaño de un long en bits: "+Long.SIZE);
	    System.out.println("valor maximo de long: "+Long.MAX_VALUE);
	    System.out.println("valor maximo de long: "+Long.MIN_VALUE);
	    System.out.println("---------------------------------------");

	    var num =14874623162l;
	    System.out.println("esta es la variable con var "+ num);
	    // Prefijos para sistemas numericos
	    //binario=0b, octal=0, hexadecimal=0x
	    var sistemNum=0b1010; 
	    System.out.println("decimal: "+sistemNum);
	    
	    //vareiables primitivads de punto flotante: float, double
	    System.out.println("-----Variables de tipo flotante--------");
	    
	    System.out.println("tamaño de un long en Float: "+Float.BYTES);
	    System.out.println("tamaño de un long en Float: "+Float.SIZE);
	    System.out.println("valor maximo de Float: "+Float.MAX_VALUE);
	    System.out.println("valor maximo de Float: "+Float.MIN_VALUE);
	    System.out.println("---------------------------------------");
	    var comaF = 100.10f;
	    System.out.println("tamaño de un long en Double: "+Double.BYTES);
	    System.out.println("tamaño de un long en Double: "+Double.SIZE);
	    System.out.println("valor maximo de Double: "+Double.MAX_VALUE);
	    System.out.println("valor maximo de Double: "+Double.MIN_VALUE);
	    System.out.println("---------------------------------------");
		
	    var comaD = 100.10E23;
	    System.out.println("--> float " + comaF);
	    System.out.println("--> double " + comaD);
	    
	    System.out.println("---------------- boolen ----------");
	    boolean estado = false; //falso
	    System.out.println("------------> " + estado);
	    	System.out.println("->"); + Boolean.FALSE);
	    System.out.println("->");
	    
		
		
	}

}
