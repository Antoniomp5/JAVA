package ejecicio8;

public class Main {
	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[2];
		
		empleados[0] = new EmpleadoFijo("Ana", 2000);
		empleados[1] = new EmpleadoPorHoras("Luis", 80, 15);
		
		for (Empleado e : empleados) {
			System.out.println("Nombre: " + e.getNombre() + " - Salario: " + e.calcularSalario());
		}
	

	}


}
