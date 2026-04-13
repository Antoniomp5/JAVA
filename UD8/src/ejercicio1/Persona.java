package ejercicio1;

public class Persona {
	private String nombre;
	private int edad;
	

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws IllegalArgumentException{
		if (edad  < 0) {
			throw new IllegalArgumentException("La edad debe de ser mayor o igual a 0");
		}
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    @Override
    public String toString() {
        return "Persona{nombre: '" + nombre + "', edad: " + edad + "}";
    }

}
