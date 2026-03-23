package ejercicio1;

public class Pajaro extends Animal implements Volador{
	
	@Override
	public void hacerSonido() {
		System.out.println("pio, pio o corococo");
	}
	@Override
	public void moverse() {
		System.out.println("Anda 2 patas o vuela");
	}
	@Override
	public void mostrarInfo() {
		System.out.println("El pajaro vuela o anda,");
		System.out.println("muerde,");
		System.out.println("muerde fuerte,");
		System.out.println("pia para joderte la mañana.");
	}
	@Override
	public void volar() {
		System.out.println("vuela o no");
	}
	
	

}
