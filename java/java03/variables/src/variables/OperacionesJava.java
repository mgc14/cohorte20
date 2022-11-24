package operadores;

import java.util.Scanner


public class OperacionesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //para ingresar datos
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("Ingresa un dato: ");
	    String dato=scanner.nextLine();
	    System.out.println("El dato que ingresaste es: "+dato);*/
	    
	    //operadores 
   	    int valor0=6;
	    int valor1=4;
	    int suma=valor0+valor1;
	    System.out.println("suma: "+suma);
	    int resta=valor0-valor1;
	    System.out.println("resta: "+resta);
	    int mult=valor0*valor1;
	    System.out.println("multiplicacion: "+mult);
	    int div=valor0/valor1;
	    System.out.println("division: "+div);
	    int modulo=valor0%valor1;
	    System.out.println("modulo: "+modulo);*/
	    
	    //pediorle valores para realizar operaciones
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("Ingresa el valor 1: ");
	    int num1=scanner.nextInt();
	    System.out.println("Ingresa el valor 2: ");
	    int num2=scanner.nextInt();
	    
	    int suma= num1+num2;
	    System.out.println("la suma es:"+suma);
	    int res= num1-num2;
	    System.out.println("la resta es:"+res);
	    int mult= num1*num2;
	    System.out.println("la multiplicacion es:"+mult);
	    int div= num1/num2;
	    if(num2>0) {
	      System.out.println("la division es:"+div);

	    }
	    else {
	      System.out.println("el divisor es cero");
	    }
	      
	    int modulo= num1%num2;
	    System.out.println("el modulo es:"+modulo);
	    if(modulo==0) {
	      
	      System.out.println("el resultado  es par");
	      
	    }
	    else {
	      System.out.println("el resultado es impar");

	    }
	    
	    int a=3;
	    int b=5;
	    boolean comparar = a>=b;
	    boolean logica = false;
	    if ((a < b) && logica) {
	    	System.out.println("Hola soy verdadero");
	    	System.out.println("comparar: " + comparar);
	    } else {
	    	System.out.println(comparar);
	    	System.out.println(logica);	    	
	    }
	    
	    System.out.println("\t\t --------------Menu-------");
	    System.out.println("1: Suma");
	    System.out.println("2: Resta");
	    System.out.println("3. Multiplicacion");
	    System.out.println("4: Division");
	    System.out.println("5: Modulo");
	    System.out.println("6: Operadores booleanos");
	    System.out.println("7: Salir");
	    int numero = scanner.nextInt ();
	    
	    String msj = " ";
		switch(numero){
		case 1:
			 System.out.println("uno");
			 System.out.println("\t----Suma---");
				System.out.print("introduzca un numero ");
				int datosS = scanner.nextInt();
				System.out.print("introduzca un numero ");
				int datosSu = scanner.nextInt();		
				int sum = datosS + datosSu;
				System.out.println("Suma: " + suma);
			 break;
		case 2:
			System.out.println("\t----Resta---");
			System.out.print("introduzca un numero ");
			int datosR = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosRe = scanner.nextInt();		
			int rest = datosR - datosRe;
			System.out.println("Rest: " + rest);
			System.out.println("dos");
			break;
		case 3: 
			System.out.println("\t----Multiplicacion---");
			System.out.print("introduzca un numero ");
			int datosM = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosMu = scanner.nextInt();		
			int multi = datosM * datosMu;
			System.out.println("Mult: " + mult);
			System.out.println("tres");
			break;
		case 4:
			System.out.println("\t----Division---");
			
			System.out.print("introduzca un numero ");
			int datosD = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosDi = scanner.nextInt();
			
			if (datosDi != 0) {
				int div1 = datosD / datosDi;
				System.out.println("Div: " + div1);			
			} else {
				System.out.println(" el denominador es cero");
			}
			
			break;
		case 5:
			
			System.out.println("\t----Modulo---");
			System.out.print("introduzca un numero ");
			int datosMo = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosMod = scanner.nextInt();		
			int module = datosMo % datosMod;
			System.out.println("Modulo: " + modulo);
			if (modulo == 0) {
				System.out.println("El numero es un par");
			} else {
				System.out.println("El numero no es par ");
			}
			
			break;
		case 6:
			int a = 3;
			int b =5;
			boolean comparar ( a >= b);
			boolean logica = false;
			if (!comparar || !(logica)) {
				System.out.println("hola si soy verdadero ");
				System.out.println(" comparar: " + comparar);			
			} else {
				System.out.println(comparar);
				System.out.println(logica);
			}
			default:
				break;
			int i = 0;
			do {
				System.out.println("Loop do while");
				System.out.println (numero);
		
			} while (i!=7);
			
			
			
				
				
				
				
				
				
				
		}
		
		 			
	    				
	    				
	    		}
	        
	    



	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	