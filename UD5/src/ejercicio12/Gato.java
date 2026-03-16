package ejercicio12;

class Gato extends Animal{

	Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void hacerSonido() {
		System.out.println("miau");
		System.out.println();
	}
	
	@Override
	String moverse() {
		return "El gato camina a 4 patas";
		
	}
	

}
