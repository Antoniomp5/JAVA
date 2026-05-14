package ejercicio1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio11 {
    public static void main(String[] args) {
        File archivo = new File("record.txt");

        try (RandomAccessFile record = new RandomAccessFile(archivo, "rw")) {

            record.writeBytes("Nivel:001");
            record.seek(6); 
            record.writeBytes("005");

            System.out.println(archivo.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
