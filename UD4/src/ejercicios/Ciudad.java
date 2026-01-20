package ejercicios;
public class Ciudad {
	public static void main(String[] args) {
		Persona Juan = new Persona(null, null, 0, 0, null, null);
		Juan.nombre = "Juan";
		Juan.edad = 24;
		Juan.estatura = 1.78f;
		Persona Antonio = new Persona(null, null, 0, 0, null, null);
		Antonio.nombre = "Antonio";
		Antonio.edad = 24;
		Antonio.estatura = 1.84f;
		Persona Curro = new Persona(null, null, 0, 0, null, null);
		Curro.nombre = "Curro";
		Curro.edad = 21;
		Curro.estatura = 1.70f;
		Persona Diego = new Persona(null, null, 0, 0, null, null);
		Diego.nombre = "Diego";
		Diego.edad = 24;
		Diego.estatura = 1.75f;
		Persona Pepe = new Persona(null, null, 0, 0, null, null);
		Pepe.nombre = "Pepe";
		Pepe.edad = 27;
		Pepe.estatura = 1.77f;
		Persona Anonimo = new Persona(null, null, 0, 0, null, null);
		Anonimo.nombre = "Anonimo";
		Anonimo.edad = 18;
		Anonimo.estatura = 1.70f;
		
		
		System.out.println("Hola soy " + Juan.nombre + " y tengo " + Juan.edad + " años.");
		System.out.println("Hola soy " + Antonio.nombre + " y tengo " + Antonio.edad + " años.");
		System.out.println("Hola soy " + Curro.nombre + " y tengo " + Curro.edad + " años.");
		System.out.println("Hola soy " + Diego.nombre + " y tengo " + Diego.edad + " años.");
		System.out.println("Hola soy " + Pepe.nombre + " y tengo " + Pepe.edad + " años.");
		System.out.println("Hola soy " + Anonimo.nombre + " y tengo " + Anonimo.edad + " años.");

		
	}

}
