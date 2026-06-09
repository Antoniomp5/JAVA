package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Puntuaciones {

    public static void main(String[] args) {

        // Crear lista de puntuaciones desordenadas
        ArrayList<Integer> puntuaciones = new ArrayList<>();

        puntuaciones.add(450);
        puntuaciones.add(1200);
        puntuaciones.add(300);
        puntuaciones.add(800);
        puntuaciones.add(1500);
        puntuaciones.add(100);

        System.out.println("Lista original:");
        System.out.println(puntuaciones);

        // Ordenar de menor a mayor
        Collections.sort(puntuaciones);

        System.out.println("\nLista ordenada:");
        System.out.println(puntuaciones);

        // Buscar puntuación máxima y mínima
        int maxima = Collections.max(puntuaciones);
        int minima = Collections.min(puntuaciones);

        System.out.println("\nPuntuación más alta: " + maxima);
        System.out.println("Puntuación más baja: " + minima);

        // Desordenar la lista
        Collections.shuffle(puntuaciones);

        System.out.println("\nLista después de shuffle:");
        System.out.println(puntuaciones);
    }
}
