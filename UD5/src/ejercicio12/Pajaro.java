package ejercicio12;

class Pajaro extends Animal{

	Pajaro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	void hacerSonido() {
		System.out.println("pio, pio, pio");
		System.out.println();
	}
	
	@Override
	String moverse() {
		return "El pajaro vuela";
		
	}
	

}
