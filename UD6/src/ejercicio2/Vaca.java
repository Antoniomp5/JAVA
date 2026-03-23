package ejercicio2;

public class Vaca  extends AnimalBase implements Animal{
	
	 public Vaca(String nombre) {
		super(nombre);
	}

	 @Override
	public void hacerSonido() {
		System.out.println(nombre + " ¡Muuuuuu!");
	}
	 @Override
	 public void comer() {
	    System.out.println(nombre + " Come pasto");
	    System.out.println();
	 }

}
