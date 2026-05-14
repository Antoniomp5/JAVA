package ejercicio1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GuardarMochila {
    public static void main(String[] args) {
        List<Item> mochila = new ArrayList<>();

        mochila.add(new Item("Espada", 3.5, 50));
        mochila.add(new Item("Escudo", 5.0, 40));
        mochila.add(new Item("Poción", 0.5, 15));
        mochila.add(new Item("Mapa", 0.2, 10));
        mochila.add(new Item("Oro", 2.0, 100));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("mochila.bin"))) {

            oos.writeObject(mochila);
            System.out.println("Mochila guardada correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
