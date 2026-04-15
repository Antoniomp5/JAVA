package ejerciciosUd8;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Persona() {
    	
    }


    // Getters y setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Orden natural: por nombre alfabéticamente
    @Override
    public int compareTo(Persona otra) {
        return this.nombre.compareTo(otra.nombre);
    }

    // Dos personas son iguales si tienen el mismo nombre y apellidos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) &&
               Objects.equals(apellidos, persona.apellidos);
    }

    // Código hash consistente con equals
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    @Override
    public String toString() {
        return nombre + " " + (apellidos != null ? apellidos : "[sin apellido]") + " (" + edad + ")";
    }


}
