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

}
