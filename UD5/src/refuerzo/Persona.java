package refuerzo;

class Persona {
	public String nombre;
	public int edad;
	
	
	public Persona(String nombre, int edad) {;
		this.nombre = nombre;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return nombre;
	}
	
	public boolean equals(Object obj) {
		return this.nombre == (((Persona)obj).nombre) && edad == ((Persona)obj).edad;
	}

}
