package ejercicio1;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

    public static void main(String[] args) {

        File archivo = new File("C:\\Users\\05_1DAW_Alum\\Desktop\\DAW\\PRO\\UD9\\Ejercicio9.txt");

        try {

            if (archivo.exists()) {

                System.out.println("El archivo existe.");
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            } else {

                boolean creado = archivo.createNewFile();

                if (creado) {
                    System.out.println("El archivo no existía y fue creado correctamente.");
                    System.out.println("Nombre: " + archivo.getName());
                    System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

        } catch (IOException e) {

            System.out.println("Ocurrió un error de entrada/salida.");
            e.printStackTrace();

        }
    }
}
