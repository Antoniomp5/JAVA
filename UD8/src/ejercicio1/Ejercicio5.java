package ejercicio1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {

        // 1. Declaración de un conjunto vacío de números enteros
        Set<Integer> numeros = new HashSet<>();
        System.out.println(numeros);

        // 2. Agregar los primeros 5 números naturales
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // 3. Imprimir el conjunto de números
        System.out.println(numeros);
        // Imprime los valores del conjunto, no la referencia.

        // 4. Añadir un número repetido
        boolean annadido = numeros.add(3);
        System.out.println("¿Se añadió el número repetido? " + annadido);
        // No permite duplicados, devuelve false.

        // 5. Añadir un null
        boolean annadidoNull = numeros.add(null);
        System.out.println("¿Se añadió el null? " + annadidoNull);
        // HashSet sí permite null.

        // 6. Crear un nuevo conjunto con los dos primeros números primos
        Set<Integer> numerosPrimos = new HashSet<>();
        numerosPrimos.add(2);
        numerosPrimos.add(3);

        // Comprobar si es subconjunto
        boolean esSubconjunto = numeros.containsAll(numerosPrimos);
        System.out.println("¿Es subconjunto? " + esSubconjunto);

        // 7. Declarar una lista con el modificador final
        final List<Integer> lista = new ArrayList<>(numeros);

        /* El modificador final solo impide reasignar la variable,
           pero sí se pueden añadir, eliminar o modificar elementos. */

        lista.add(6);        // Permitido
        lista.remove(1);     // Permitido
        lista.set(0, 10);    // Permitido

        System.out.println("Lista final: " + lista);
    }
}
	


