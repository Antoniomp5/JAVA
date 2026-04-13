package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
			// Crear una lista de nombres
			String nombre1 = new String("Antonio");
			String nombre2 = new String("María");
			String nombre3 = new String("Lucía");
			String nombre4 = new String("Juan");
			String nombre5 = new String("Ricardo");
			
			nombres.add(nombre1);
			nombres.add(nombre2);
			nombres.add(nombre3);
			nombres.add(nombre4);
			nombres.add(nombre5);
			System.out.println(nombres);
			
			// Mostrar los nombres
			mostrar(nombres);
			
			// Añadir un nuevo nombre usando un escaner
			System.out.println("Introduce un nombre nuevo: ");
			String nombre6 = sc.nextLine();
			nombres.add(nombre6);
			System.out.println(nombres);
			
			// Eliminación de la lista
			System.out.println("Introduce el nombre a eliminar: ");
			String nombreEliminar = sc.nextLine();
	        if (nombres.remove(nombreEliminar)) {
	        	System.out.println("Lista tras eliminar un nombre: " + nombres);
	        } else {
	        	System.out.println("El nombre no se encuentra en la lista");
	        	
	        }
	        
	     // Mostrar número total de nombres
	        System.out.println("Número total de nombres: " + nombres.size());
	        
	        sc.close();
	}
	
	private static void mostrar (List<String> lista) {
		for (String l : lista) {
			System.out.println(l);
		}
		
	}
	        

}
