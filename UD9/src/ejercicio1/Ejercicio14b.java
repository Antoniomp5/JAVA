package ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio14b {

    public static void main(String[] args) {

        try {
            FileInputStream fichero = new FileInputStream("persona.dat");
            ObjectInputStream entrada = new ObjectInputStream(fichero);

            Persona persona = (Persona) entrada.readObject();

            entrada.close();
            fichero.close();

            System.out.println("Famoso deserializado: " + persona);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
