package herencia;

class Persona {
	protected String nombre;
	protected int edad;
	private String sexo;
	
	Persona(){
		
	}
	
	Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public void presentarse() {
		System.out.println("Hola, soy una persona y me llamo: " + nombre
				+ ", tengo: " + edad  + " años.");	
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
