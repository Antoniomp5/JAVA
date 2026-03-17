package ejercicio7;

public class Main {

    public static void main(String[] args) {

        // Crear objetos
        Coche coche = new Coche("Toyota", "Corolla", 2020, 4);
        Motocicleta moto = new Motocicleta("Yamaha", "MT-07", 2022, false);

        // Mostrar detalles
        System.out.println("=== COCHE ===");
        coche.mostrarDetalles();

        System.out.println("\n=== MOTOCICLETA ===");
        moto.mostrarDetalles();
    }
}
