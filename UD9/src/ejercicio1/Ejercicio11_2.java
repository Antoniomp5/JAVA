package ejercicio1;
	
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio11_2 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 try {
			 Path archivo = Path.of("C:\\\\Users\\\\05_1DAW_Alum\\\\Desktop\\\\DAW\\\\PRO\\\\UD9\\\\Ejercicio11.txt");

	            // Leer el contenido actual
	            String contenido = Files.readString(archivo);

	            // Pedir nuevo nivel
	            System.out.print("¿Qué nivel quieres poner? ");
	            int nivel = sc.nextInt();

	            // Formato de 3 cifras: 1 -> 001
	            String nuevoNivel = String.format("%03d", nivel);

	            // Mantener "Nivel:" y cambiar solo el número
	            contenido = contenido.substring(0, 6) + nuevoNivel;

	            // Escribir el nuevo contenido
	            Files.writeString(archivo, contenido);

	            System.out.println("Archivo actualizado:");
	            System.out.println(contenido);

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {

	        	sc.close();
	        }
	    }
	}

