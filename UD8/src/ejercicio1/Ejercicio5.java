package ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		
		System.out.println(numeros);
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		System.out.println(numeros);
		
		numeros.add(1);
	}

}
