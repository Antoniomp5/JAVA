package ejerciciosUd8;

import java.util.TreeSet;
import java.util.Set;

public class Ejercicio8 {
	public static void main(String[] args) {
        // 1. Crea un conjunto implementado por un árbol binario
        Set<Integer> numeros = new TreeSet<>();
        
        // 2. Añade tres números enteros en orden aleatorio
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);

        // 3. Recorrelo e imprime su contenido ordenado de menor a mayor
        System.out.println("Recorrido de números: " + numeros);

        // 4. Haz lo mismo utilizando nombres de alumnos
        Set<String> alumnos = new TreeSet<>();
        
        alumnos.add("Lucía");
        alumnos.add("Antonio");
        alumnos.add("Héctor");

        System.out.println("Recorrido de alumnos: " + alumnos);

	}
		
}


