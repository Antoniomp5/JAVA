package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animales = new ArrayList<>();
		
		animales.add(new Perro("Watus"));
		animales.add(new Gato("Miatus"));
		animales.add(new Vaca("Lola"));
		animales.add(new Pajaro("Pajaroto"));
		
		for(Animal animal : animales) {
			if (animal instanceof Volador)
				((Volador)animal).volar();
			animal.hacerSonido();
			animal.comer();
		}

	}

}
