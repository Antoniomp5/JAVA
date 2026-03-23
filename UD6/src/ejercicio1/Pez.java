package ejercicio1;

public class Pez extends Animal implements Nadador{
	
	@Override
	public void hacerSonido() {
		System.out.println("glu, glu, glu");
	}
	@Override
	public void moverse() {
		System.out.println("nada");
	}
	@Override
	public void mostrarInfo() {
		System.out.println("nada");

	}
	@Override
	public void nadar() {
		System.out.println("nada");
	}
	

}