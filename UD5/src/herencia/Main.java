package herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alumno a = new Alumno("Antonio", 24, "Hombre");
		//a.setCiclo("DAW.");
		//a.presentarse();
		
		Empleado e = new Empleado();
		e.nombre = "Cristóbal";
		e.edad = 36;
		e.setSalario(223409.89);
		e.mostrarDatos();
	}

}
