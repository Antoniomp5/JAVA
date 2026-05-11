package ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Ruta del fichero creado previamente
        String ruta = "C:\\Users\\05_1DAW_Alum\\Desktop\\DAW\\PRO\\UD9\\Ejercicio10.txt";

        // Añadir el contenido al final del fichero
        try {
            FileWriter escritor = new FileWriter(ruta, true);

            escritor.write("Nueva línea añadida desde Java.\n");
            escritor.write("Otra línea más.\n");

            escritor.close();

            System.out.println("Contenido añadido correctamente.\n");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
            e.printStackTrace();
        }

        // Mostrar el contenido del fichero
        try {
            List<String> lineas = Files.readAllLines(Paths.get(ruta));

            System.out.println("Contenido del fichero:");

            for (String linea : lineas) {
                System.out.println(linea);
            }	

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
            e.printStackTrace();
        }
    }
}