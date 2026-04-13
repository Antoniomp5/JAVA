package ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Lista nula
		List<Persona> personas = null;
		System.out.println(personas);
		
		// Lista vacia
		personas = new LinkedList<>();
		System.out.println(personas);
		
		// Lista de 3 Personas
		Persona persona1 = new Persona("Toni", 24);
		Persona persona2 = new Persona("María", 23);
		Persona persona3 = new Persona("Lucía", 24);
		
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		System.out.println(personas);
		
		// Intercambio de posiciones 
		int ulitmoIndice = personas.size() -1;
		Persona temp = personas.get(0);
		
		personas.set(0, personas.get(ulitmoIndice));
		personas.set(ulitmoIndice, temp);
		
		System.out.println(personas);
		
		
		// Modificación
		Persona persona;
		persona = personas.getFirst();
		persona.setNombre("Antonio");
		System.out.println(personas);
		
		// Eliminación de la lista
        int posicionCentral = personas.size() / 2;
        personas.remove(posicionCentral);
        System.out.println("Lista tras eliminar la persona central: " + personas);
        
        // Recorrido con for clásico
        for (int i = 0; i < personas.size(); i++) {
        	System.out.println(personas.get(i).getNombre());
        }
        
        // Añadir nueva persona y comprobar
        Persona nuevaPersona = new Persona("Sara", 26);
        personas.add(nuevaPersona);
        System.out.println("Lista tras añadir nueva persona: " + personas);

        boolean contiene = personas.contains(nuevaPersona);
        System.out.println("¿La lista contiene a la persona nueva? " + contiene);
        
        // Vaciar lista
        personas.clear();
        System.out.println("Lista después de vaciarla: " + personas);

        System.out.println("¿Está vacía la lista? " + personas.isEmpty());
        
        
		

	}


}
