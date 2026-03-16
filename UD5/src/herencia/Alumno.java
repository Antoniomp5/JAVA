package herencia;

class Alumno extends Persona {
	private String ciclo;
	
	Alumno(String ciclo, String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		this.ciclo = ciclo;
	}

	@Override
	public void presentarse() {
		super.presentarse();
		this.estudiar();
		
	}
	
	public void estudiar() {
		System.out.println("Estoy estudiando este ciclo: " + ciclo);
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	} 

}
