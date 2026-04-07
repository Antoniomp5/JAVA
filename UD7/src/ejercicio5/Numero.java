package ejercicio5;

import java.util.List;

public class Numero {
	
    public static void agregarNumero(List<Integer> lista, int numero) {
        if (lista.contains(numero)) {
            // 3º. Lanzar la excepción personalizada
            throw new NumeroRepetido("El número " + numero + " ya está en la lista");
        }

        lista.add(numero);
    }

}
