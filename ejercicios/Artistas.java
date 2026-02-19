package ejercicios;

import java.io.Serializable;

public class Artistas implements Serializable{
	
	private String nombre;
	private String nacionalidad;
	private int annosExperiencia;
	
	public Artistas(String nombre, String nacionalidad, int annosExperiencia) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.annosExperiencia = annosExperiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}

	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}
	
	

	

}
