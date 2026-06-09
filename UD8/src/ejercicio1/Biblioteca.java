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
