package ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        HashSet<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros (Iterator)");
            System.out.println("3. Mostrar libros (for-each)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del libro: ");
                    String libro = scanner.nextLine();

                    if (libros.add(libro)) {
                        System.out.println("Libro agregado correctamente.");
                    } else {
                        System.out.println("El libro ya existe en la colección.");
                    }
                    break;

                case 2:
                    System.out.println("\nLibros usando Iterator:");
                    Iterator<String> iterator = libros.iterator();

                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case 3:
                    System.out.println("\nLibros usando for-each:");
                    for (String titulo : libros) {
                        System.out.println(titulo);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

/*
 * 1. ¿Por qué HashSet no garantiza un orden específico?
 *    Porque HashSet almacena los elementos utilizando una tabla hash.
 *    Los elementos se organizan según su valor hash y no según el
 *    orden en que fueron insertados, por lo que el orden de recorrido
 *    puede variar.
 *
 * 2. ¿Cuándo sería preferible usar un Iterator en lugar de un for-each?
 *    Cuando necesitamos recorrer la colección y eliminar elementos de
 *    forma segura durante la iteración. Además, Iterator proporciona
 *    más control sobre el recorrido mediante métodos como hasNext()
 *    y next().
 *
 * 3. ¿Qué pasaría si intentamos modificar el Set mientras iteramos con for-each?
 *    Se produciría una ConcurrentModificationException en tiempo de
 *    ejecución, ya que no está permitido modificar directamente la
 *    colección mientras se recorre con un for-each. Para eliminar
 *    elementos de forma segura debe utilizarse el método remove() del
 *    Iterator.
 */
