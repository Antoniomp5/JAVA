package ejercicio3;

import java.util.Scanner;
import ejercicio1.Persona;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        	System.out.println("Introduce el nombre: ");
        	String nombre = sc.nextLine();

        	System.out.println("Introduce la edad: ");
        	int edad = sc.nextInt();

        	Persona n = new Persona(nombre, edad);
        	n.setEdad(edad);
        	System.out.println("Nombre: " + n.getNombre());
        	System.out.println("Edad: " + n.getEdad());
        } catch (IllegalArgumentException ex){
        	System.out.print("La edad debe ser mayor que 0");
        	
        } finally {
        	sc.close();
        }
        
    }
}