package ejercicio14;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio14a {
	public static void main(String[] args) {
		Persona persona = new Persona("Fernando Alonso", 44);
		
		try {
			FileOutputStream fichero = new FileOutputStream("persona.dat");
			
			ObjectOutputStream out = new ObjectOutputStream(fichero);
			
			out.writeObject(persona);
			
			out.close();
			
			System.out.println("Persona guardada correctamente");
			
		}catch (IOException e){
				System.out.println("Error: " + e.getMessage());
			}
	}
		
}


