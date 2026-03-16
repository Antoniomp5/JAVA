package ejercicios;
import ejercicio2.DiasDeLaSemana;
import ejercicio2.Sexo;

class Persona {
	// Atributos
	
	String nombre;
	String apedillo;
	int edad;
	float estatura;
	DiasDeLaSemana dia;
	Sexo sexo;
	
	// Constructor
	Persona (String nombre, String apedillo, int edad, float estatura) {
		this.nombre = nombre;
		this.apedillo = apedillo;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	public Persona(String nombre, String apedillo, int edad, float estatura, DiasDeLaSemana dia, Sexo sexo) {
		this.nombre = nombre;
		this.apedillo = apedillo;
		this.edad = edad;
		this.estatura = estatura;
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
		edad++;
		System.out.println(edad);
	}
	
	void crecer () {
		estatura++;
		System.out.println(estatura);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApedillo() {
		return apedillo;
	}

	public void setApedillo(String apedillo) {
		this.apedillo = apedillo;
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

	public DiasDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiasDeLaSemana dia) {
		this.dia = dia;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


}
