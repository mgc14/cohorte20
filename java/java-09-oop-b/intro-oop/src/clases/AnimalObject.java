package clases;

public class AnimalObject {

	public static void main(String[] args )
	{
		//Creamos un animal cuyo nombre sera Falcon
		Animal miAnimal = new Animal("Falcon");
		//Le establecemos 3 anios de edad a Falco.
		miAnimal.setEdad(3);
		//Mostraremos el nombre del animal por pantalla
		System.out.println("El animal es: " + miAnimal.getNombre());
		//Mostramos la edad del animal por pantalla
		System.out.println("Y tiene " + miAnimal.getEdad() + "anios");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
