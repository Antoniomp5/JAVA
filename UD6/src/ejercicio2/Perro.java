package ejercicio2;

public class Perro  extends AnimalBase implements Animal{
	
	 public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	 @Override
	public void hacerSonido() {
		System.out.println(nombre + " ¡Guau, Guau!");
	} 
	 
	 @Override
	 public void comer() {
	    System.out.println(nombre + " Come pienso");
	    System.out.println();
	 }

}
