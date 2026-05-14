package ejercicio1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LeerMochila {
    public static void main(String[] args) {

        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("mochila.bin"))) {

       List<Item> mochila = (List<Item>) ois.readObject();

       double valorTotal = 0;

       for (Item i : mochila) {
           System.out.println(i);
           valorTotal += i.getValor();
       }

       System.out.println("Valor total de la mochila: " + valorTotal);

   } catch (Exception e) {
       e.printStackTrace();
   }
    }

}
