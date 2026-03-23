package ejercicio1;

public class Gato extends Animal implements Corredor{
	
	@Override
	public void hacerSonido() {
		System.out.println("Miau");
	}
	@Override
	public void moverse() {
		System.out.println("Anda a 4 patas");
	}
	@Override
	public void mostrarInfo() {
		System.out.println("El gato salta,");
		System.out.println("juega,");
		System.out.println("araña jugando,");
		System.out.println("duerme en tu cama por que quiere.");
	}
	@Override
	public void correr() {
		System.out.println("Corre");
	}
	
	

}
