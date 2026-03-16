package ejercicio12;

 abstract class Animal {
	
	protected String nombre;
	protected int edad;
	
	Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	void mostrarInformacion() {
		System.out.println("---------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("----------------------------");
		System.out.println();
	}
	
	abstract void hacerSonido();
	
	abstract String moverse();
	

}
