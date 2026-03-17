package ejercicio2;
public class Ciudad {
	public static void main(String[] args) {
		Persona Juan = new Persona(null, null, 0, 0, null, null);
		Juan.nombre = "Juan";
		Juan.setEdad(24);
		Juan.setEstatura(1.78f);
		Persona Antonio = new Persona(null, null, 0, 0, null, null);
		Antonio.nombre = "Antonio";
		Antonio.setEdad(24);
		Antonio.setEstatura(1.84f);
		Persona Curro = new Persona(null, null, 0, 0, null, null);
		Curro.nombre = "Curro";
		Curro.setEdad(21);
		Curro.setEstatura(1.70f);
		Persona Diego = new Persona(null, null, 0, 0, null, null);
		Diego.nombre = "Diego";
		Diego.setEdad(24);
		Diego.setEstatura(1.75f);
		Persona Pepe = new Persona(null, null, 0, 0, null, null);
		Pepe.nombre = "Pepe";
		Pepe.setEdad(27);
		Pepe.setEstatura(1.77f);
		Persona Anonimo = new Persona(null, null, 0, 0, null, null);
		Anonimo.nombre = "Anonimo";
		Anonimo.setEdad(18);
		Anonimo.setEstatura(1.70f);
		
		
		System.out.println("Hola soy " + Juan.nombre + " y tengo " + Juan.getEdad() + " años.");
		System.out.println("Hola soy " + Antonio.nombre + " y tengo " + Antonio.getEdad() + " años.");
		System.out.println("Hola soy " + Curro.nombre + " y tengo " + Curro.getEdad() + " años.");
		System.out.println("Hola soy " + Diego.nombre + " y tengo " + Diego.getEdad() + " años.");
		System.out.println("Hola soy " + Pepe.nombre + " y tengo " + Pepe.getEdad() + " años.");
		System.out.println("Hola soy " + Anonimo.nombre + " y tengo " + Anonimo.getEdad() + " años.");

		
	}

}
