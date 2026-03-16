package herencia;

class Empleado extends Persona{
	private double salario;
	
	
	
	public Empleado() {

	}

	public Empleado(String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
	}

	void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Salario: " + salario);
		}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
