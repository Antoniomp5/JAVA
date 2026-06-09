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
/*
 * 1. Después de actualizar "Manzanas" no aparecen dos entradas.
 *    El valor anterior se sobrescribe porque en un HashMap
 *    las claves son únicas. Si una clave ya existe, put()
 *    reemplaza el valor asociado a esa clave.
 *
 * 2. Se puede usar un número entero como clave, pero debe ser
 *    de tipo Integer, no int, ya que los genéricos de Java
 *    solo aceptan objetos.
 *    Ejemplo:
 *    HashMap<Integer, Integer> inventario = new HashMap<>();
 *
 * 3. Un HashMap es más eficiente para un inventario porque
 *    permite acceder directamente a un producto mediante su clave.
 *    Con una ArrayList habría que recorrer los elementos uno a uno
 *    hasta encontrar el producto buscado.
 */
