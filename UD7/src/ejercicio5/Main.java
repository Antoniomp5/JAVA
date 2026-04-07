package ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	List<Integer> lista = new ArrayList<>();
        try {
            Numero.agregarNumero(lista, 5);
            Numero.agregarNumero(lista, 3);
            Numero.agregarNumero(lista, 5); // Provoca la excepción
        } catch (NumeroRepetido e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
        	System.out.println("Programa finalizado.");
        }

        
    }
}

