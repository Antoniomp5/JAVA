package ejercicio1;

public class Perro extends Animal implements Corredor{
	
	@Override
	public void hacerSonido() {
		System.out.println("¡Guau, Guau!");
	}
	@Override
	public void moverse() {
		System.out.println("Anda a 4 patas");
	}
	@Override
	public void mostrarInfo() {
		System.out.println("El perro ladra,");
		System.out.println("juega,");
		System.out.println("muerde jugando,");
		System.out.println("duerme.");
	}
	@Override
	public void correr() {
		System.out.println("Corre");
	}
	

}
