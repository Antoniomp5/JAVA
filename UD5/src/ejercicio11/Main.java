package ejercicio11;

public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "9788420412146", 1605);
        Libro l2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9780307474728", 1967);
        Libro l3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "9788408172177", 2001);
        Libro l4 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "9780261102385", 1954);
        Libro l5 = new Libro("1984", "George Orwell", "9780451524935", 1949);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println();

        System.out.println("¿l1 es igual a l2? " + l1.equals(l2));
    }
}
