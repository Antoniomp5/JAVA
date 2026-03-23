package ejercicio2;

public class Pajaro extends AnimalBase implements Animal, Volador{

	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public void volar() {
		System.out.println(nombre + " vuela");
		
	}

	 @Override
	public void hacerSonido() {
		System.out.println(nombre + " ¡Pio, Pio!");
	} 
	 
	 @Override
	 public void comer() {
	    System.out.println(nombre + " Come alpiste");
	    System.out.println();
	 }

}
