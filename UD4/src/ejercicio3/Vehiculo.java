package ejercicio3;

public class Vehiculo {
	
	// Atributos
	String matricula;
	String marca;
	int anioFabricacion;
	double precio;
	TipoVehiculo tipo;

	
	// Constructor
	Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo) {
		this.matricula = matricula;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	// Metodos
	public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Tipo de vehículo: " + tipo);
    }

	public boolean esAntiguo() {
        int anioActual = java.time.Year.now().getValue();
        return (anioActual - anioFabricacion) > 10;
    }

	public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = precio * (porcentaje / 100);
            precio -= descuento;
            System.out.println("Descuento aplicado: " + porcentaje + "%. Nuevo precio: " + precio + " €");
        } else {
            System.out.println("El porcentaje de descuento debe estar entre 0 y 100.");
        }
    }
	
	
	

}

