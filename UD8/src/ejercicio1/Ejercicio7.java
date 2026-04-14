package ejerciciosUd8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio7 {

    public static void main(String[] args) {
    	// --- LinkedHashSet ---
        // 1. Declaración de un conjunto vacío usando la interfaz Set (LinkedHashSet)
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Agregar nombres de alumnos al conjunto
        alumnos.add("Antonio");
        alumnos.add("Lucía");
        alumnos.add("Juan");
        alumnos.add("María");

        // 3. Imprimir el conjunto
        System.out.println("LinkedHashSet: " + alumnos);

        // 4. Añadir un nombre repetido
        alumnos.add("Antonio"); // No se añade, Set no admite duplicados

        // 5. Añadir un null
        alumnos.add(null); // Set permite elementos null

        // 6. Recorrer el conjunto e imprimir cada elemento con prefijo "D."
        System.out.println("Recorrido LinkedHashSet:");
        for (String alumno : alumnos) {
            System.out.println("D. " + alumno);
        }

        // --- HashSet ---
        // 1. Declaración de un conjunto vacío usando la interfaz Set (HashSet)
        Set<String> alumnosHash = new HashSet<>();

        // 2. Agregar nombres de alumnos al conjunto
        alumnosHash.add("Antonio");
        alumnosHash.add("Lucía");
        alumnosHash.add("Juan");
        alumnosHash.add("María");

        // 3. Imprimir el conjunto
        System.out.println("\nHashSet: " + alumnosHash);

        // 4. Añadir un nombre repetido
        alumnosHash.add("Antonio"); // No se añade, Set no admite duplicados

        // 5. Añadir un null
        alumnosHash.add(null); // Set permite elementos null

        // 6. Recorrer el conjunto e imprimir cada elemento con prefijo "D."
        System.out.println("Recorrido HashSet:");
        for (String alumnoHash : alumnosHash) {
            System.out.println("D. " + alumnoHash);
        }
    }
}
