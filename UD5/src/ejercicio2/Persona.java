package ejercicio2;

class Persona {
	// Atributos
	
	 String nombre;
	private String apedillo;
	private int edad;
	private float estatura;
	private DiasDeLaSemana dia;
	private Sexo sexo;
	
	// Constructor
	Persona (String nombre, String apedillo, int edad, float estatura) {
		this.nombre = nombre;
		this.apedillo = apedillo;
		this.setEdad(edad);
		this.setEstatura(estatura);
	}
	
	public Persona(String nombre, String apedillo, int edad, float estatura, DiasDeLaSemana dia, Sexo sexo) {
		this.nombre = nombre;
		this.apedillo = apedillo;
		this.setEdad(edad);
		this.setEstatura(estatura);
		this.dia = dia;
		this.sexo = sexo;
	}


	Persona(String nombre){
		this.nombre = nombre;
	}
	
	// Metodos
	
	void saludar() {
		System.out.println("¡Hola me llamo! " + nombre);
	}
	
	void cumplirAños() {
		setEdad(getEdad() + 1);
		System.out.println(getEdad());
	}
	
	void crecer () {
		setEstatura(getEstatura() + 1);
		System.out.println(getEstatura());
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

}
