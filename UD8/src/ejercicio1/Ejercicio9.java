package ejerciciosUd8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio9 {

	public static void main(String[] args) {
        // Colección sin repetidos y orden natural
        Set<Persona> personas = new TreeSet<>();

        // Añadir personas
        personas.add(new Persona("Antonio", "Hernández", 24));
        personas.add(new Persona("María", "Gómez", 25));
        personas.add(new Persona("Carlos", "López", 27));
        personas.add(new Persona("Lucía", "Martínez", 26));
        personas.add(new Persona("Antonio", "Hernández", 24)); // Duplicado, no se añade

        // Mostrar contenido
        System.out.println("\nContenido de TreeSet (orden natural por nombre):");
        for (Persona p : personas) {
            System.out.println(p);
        }
        
        Set<Persona> personasLinked = new LinkedHashSet<>();
        
        personasLinked.add(new Persona("Antonio", "Hernández", 24));
        personasLinked.add(new Persona("María", "Gómez", 25));
        personasLinked.add(new Persona("Carlos", "López", 27));
        personasLinked.add(new Persona("Lucía", "Martínez", 26));
        personasLinked.add(new Persona("Antonio", "Hernández", 24)); // entrada valida
        
        System.out.println("\\nContenido de LinkedHashSet (orden de inserción):");
        for (Persona p : personasLinked) {
            System.out.println(p);
        }
        // Ejercicio 10
        // Crear personas
        Persona p1 = new Persona("Antonio", "Hernández", 24);
        Persona p2 = new Persona("María", null, 30); // apedillo null
        Persona p3 = new Persona("Carlos", "López", 20);
        Persona p4 = new Persona("Lucía", "Martínez", 22);
        Persona p5 = new Persona("Ana", null, 28); // apedillo null
        
        // Comparador por edad
        Set<Persona> personasPorEdad = new TreeSet<>(new ComparadorPorEdad());
        personasPorEdad.add(p1);
        personasPorEdad.add(p2);
        personasPorEdad.add(p3);
        personasPorEdad.add(p4);
        personasPorEdad.add(p5);
        
        System.out.println("\nOrdenadas por edad:");
        
        for (Persona e : personasPorEdad) {
            System.out.println(e);
        }
        
        // Comparador por apellidos
        Set<Persona> personasPorApellidos = new TreeSet<>(new ComparadorPorApellidos());
        personasPorApellidos.addAll(personasPorEdad);

        System.out.println("\nOrdenadas por apellidos (sin apellido primero):");
        for (Persona r : personasPorEdad) {
            System.out.println(r);
        }
        // Comparador complejo
        Set<Persona> personasComplejo = new TreeSet<>(new ComparadorComplejo());
        personasComplejo.addAll(personasPorEdad);

        System.out.println("\nOrdenadas por apellidos, nombre y edad (sin apellido primero):");
        for (Persona s : personasPorEdad) {
            System.out.println(s);
        }
        
        

	}

}
