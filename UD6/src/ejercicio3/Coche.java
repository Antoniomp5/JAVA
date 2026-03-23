package ejercicio3;

public class Coche extends Vehiculo{
	private int numPuertas;
	
	public Coche(String placa, String marca, int anno, Combustible combustible, int numPuertas) {
		super(placa, marca, anno, combustible);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String fechaMantenimiento() {
		return "2026-06-01";
	}

	@Override
	public double calcularVelocidad() {
		return 210.0;
	}
	
    @Override
    public String toString() {
		return super.toString() + " - Puertas: " + numPuertas;
    }
    
    

}
