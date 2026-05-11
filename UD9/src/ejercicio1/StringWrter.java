package ejercicio1;

import java.io.StringWriter;
import java.io.IOException;

public class EjemploStringWriter {
    public static void main(String[] args) {
        // Crear un StringWriter
        StringWriter sw = new StringWriter();

        // Escribir texto
        sw.write("Hola, ");
        sw.write("StringWriter en Java!");

        // Obtener el contenido como String
        String resultado = sw.toString();
        System.out.println(resultado); // Salida: "Hola, StringWriter en Java!"
    }
}
