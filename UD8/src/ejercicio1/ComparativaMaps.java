package ejercicio1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class ComparativaMaps {

    public static void main(String[] args) {

        HashMap<String, Integer> aleatorio = new HashMap<>();
        LinkedHashMap<String, Integer> insercion = new LinkedHashMap<>();
        TreeMap<String, Integer> alfabetico = new TreeMap<>();

        // Carga de datos
        aleatorio.put("Zoe", 85);
        aleatorio.put("Bernat", 92);
        aleatorio.put("Ana", 78);
        aleatorio.put("Mario", 88);

        insercion.put("Zoe", 85);
        insercion.put("Bernat", 92);
        insercion.put("Ana", 78);
        insercion.put("Mario", 88);

        alfabetico.put("Zoe", 85);
        alfabetico.put("Bernat", 92);
        alfabetico.put("Ana", 78);
        alfabetico.put("Mario", 88);

        mostrarMapa(aleatorio, "HashMap");
        mostrarMapa(insercion, "LinkedHashMap");
        mostrarMapa(alfabetico, "TreeMap");
    }

    public static void mostrarMapa(Map<String, Integer> mapa, String tipo) {

        System.out.println("\n--- " + tipo + " ---");

        Iterator<Map.Entry<String, Integer>> iterator =
                mapa.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entrada = iterator.next();

            System.out.println(
                    entrada.getKey() + " -> " + entrada.getValue()
            );
        }
    }
}

/*
 * CUESTIONARIO
 *
 * 1. ¿Qué ha pasado en el HashMap?
 *    Los nombres no tienen por qué aparecer en el orden en que fueron
 *    insertados. HashMap no garantiza ningún orden específico.
 *
 * 2. ¿Qué ha pasado en el LinkedHashMap?
 *    Sí. Se ha respetado el orden de inserción:
 *    Zoe, Bernat, Ana, Mario.
 *
 * 3. ¿Qué ha pasado en el TreeMap?
 *    Los nombres aparecen ordenados alfabéticamente por la clave:
 *    Ana, Bernat, Mario, Zoe.
 *
 * 4. Caso práctico:
 *    Para una agenda telefónica elegiría TreeMap porque mantiene
 *    automáticamente los nombres ordenados de la A a la Z, facilitando
 *    la búsqueda y visualización de los contactos.
 */
