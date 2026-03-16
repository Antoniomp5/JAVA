package ejercicio12;

class Perro extends Animal{

	Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void hacerSonido() {
		System.out.println("guau, guau, guau");
		System.out.println();
	}
	
	@Override
	String moverse() {
		return "El perro camina a 4 patas";
		
	}
	

}
