package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class InventarioFruteria {

    public static void main(String[] args) {

        // Creación del HashMap
        HashMap<String, Integer> inventario = new HashMap<>();

        // Carga de datos
        inventario.put("Manzanas", 50);
        inventario.put("Plátanos", 20);
        inventario.put("Naranjas", 35);
        inventario.put("Peras", 12);

        // Consulta
        System.out.println("Cantidad de Naranjas: " + inventario.get("Naranjas"));

        // Actualización
        inventario.put("Manzanas", 100);
        System.out.println("Stock actualizado de Manzanas: " + inventario.get("Manzanas"));

        // Verificación
        if (inventario.containsKey("Mangos")) {
            System.out.println("Cantidad de Mangos: " + inventario.get("Mangos"));
        } else {
            System.out.println("Producto no encontrado");
        }

        // Recorrido final
        System.out.println("\nInventario final:");

        inventario.forEach((fruta, cantidad) ->
                System.out.println(fruta + ": " + cantidad)
        );
    }
}
