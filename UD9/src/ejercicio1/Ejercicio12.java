package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio12 {

    public static void main(String[] args) {

        String nombreFichero = "abecedario.txt";

        try {
            // Crear objeto File
            File fichero = new File(nombreFichero);

            // Si el fichero existe, eliminarlo
            if (fichero.exists()) {
                fichero.delete();
            }

            // Abrir flujo de acceso aleatorio en modo lectura/escritura
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");

            // Introducir la cadena "defg"
            raf.writeBytes("defg");

            // Volver al inicio para leer el contenido
            raf.seek(0);

            // Leer contenido del fichero
            byte[] contenido = new byte[(int) raf.length()];
            raf.read(contenido);

            System.out.println("Contenido inicial: " + new String(contenido));

            // Obtenemos contenido actual
            String texto = new String(contenido);

            // Añadimos "abc" al principio y "hij" al final
            texto = "abc" + texto + "hij";

            // Sustituimos vocales por '*'
            texto = texto.replaceAll("[aeiouAEIOU]", "*");

            // Vaciamos el fichero
            raf.setLength(0);

            // Volvemos al inicio
            raf.seek(0);

            // Escribimos el nuevo contenido
            raf.writeBytes(texto);

            // Mostramos el resultado final
            raf.seek(0);

            byte[] finalContenido = new byte[(int) raf.length()];
            raf.read(finalContenido);

            System.out.println("Contenido final: " + new String(finalContenido));
            
            // Cerramos fichero
            raf.close();


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}