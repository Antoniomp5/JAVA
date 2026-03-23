package ejercicio2;
	
public class Gato  extends AnimalBase implements Animal{
		
	public Gato(String nombre) {
	super(nombre);
			
	}
	
	@Override
	public void hacerSonido() {
		System.out.println(nombre + " ¡Miau!");
	}
	@Override
	 public void comer() {
	    System.out.println(nombre + " Come pienso");
	    System.out.println();
	 }
	
}
