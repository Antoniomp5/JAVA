package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class EjercicioListIterator {

    public static void main(String[] args) {

        // Declaración e inicialización de la lista
        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
        );

        System.out.println("Lista original:");
        System.out.println(numeros);

        ListIterator<Integer> it = numeros.listIterator();

        // Recorrido hacia adelante
        System.out.println("\n=== RECORRIDO HACIA ADELANTE ===");
        while (it.hasNext()) {
            System.out.println("Índice actual: " + it.nextIndex());

            int numero = it.next();
            System.out.println("Valor: " + numero);

            // Multiplicar por 2 los números mayores que 50
            if (numero > 50) {
                it.set(numero * 2);
            }
        }

        System.out.println("\nLista después de multiplicar por 2 los números mayores que 50:");
        System.out.println(numeros);

        // Recorrido hacia atrás
        System.out.println("\n=== RECORRIDO HACIA ATRÁS ===");
        while (it.hasPrevious()) {
            System.out.println("Índice actual: " + it.previousIndex());

            int numero = it.previous();
            System.out.println("Valor: " + numero);

            // Si el número es menor que 30, insertar 25 después
            if (numero < 30) {
                it.add(25);
            }
        }

        System.out.println("\nLista después de las inserciones:");
        System.out.println(numeros);
    }
}
