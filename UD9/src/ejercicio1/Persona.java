package ejercicio1;

import java.io.Serializable;


import java.util.*;

// Clase Persona
public class Persona implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String nombre;
    public String apellidos;
    public int edad;


	public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " - Edad: " + edad;
    }
}

class ComparadorPorEdad implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        int CompEdad = p1.edad - p2.edad;
        return CompEdad;
    }
}

class ComparadorPorApellidos implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        int CompApellidos = p1.apellidos.compareTo(p2.apellidos);
        return CompApellidos;
    }
}
    class ComparadorCompleto implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        int CompCompleto = p1.apellidos.compareTo(p2.apellidos);

        if (CompCompleto == 0) {
            CompCompleto = p1.nombre.compareTo(p2.nombre);
        }

        if (CompCompleto == 0) {
            CompCompleto = p1.edad - p2.edad;
        }

        return CompCompleto;
    }
 }