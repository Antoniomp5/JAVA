package ejercicio3;

public class Motocicleta extends Vehiculo{
	private boolean sidecar;

	public Motocicleta(String placa, String marca, int anno, Combustible combustible, boolean sidecar) {
		super(placa, marca, anno, combustible);
		this.sidecar = sidecar;
	}

	@Override
	public String fechaMantenimiento() {
		return "2026-06-03";
	}

	@Override
	public double calcularVelocidad() {
		return 200.0;
	}
	
	@Override
	public String toString() {
	    String tieneSidecar = sidecar ? "Sí" : "No";
	    return super.toString() + " - Sidecar: " + tieneSidecar;
	}

}
