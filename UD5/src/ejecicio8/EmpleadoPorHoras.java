package ejecicio8;

class EmpleadoPorHoras extends Empleado{
	
	private int horasTrabajadas;
	private double precioHora;
	
	public EmpleadoPorHoras(String nombre, int horasTrabajadas, double precioHora) {
		super(nombre);
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}
	
	@Override
	public double calcularSalario() {
	    return horasTrabajadas * precioHora;
	}
		
	
	

}
