package ejercicio3;

public abstract class Vehiculo implements Mantenimiento{
	private String placa;
	private String marca;
	private int anno;
	private Combustible combustible;
	private static int cuentaVehiculo = 0;
	
	public Vehiculo(String placa, String marca, int anno, Combustible combustible) {
		this.placa = placa;
		this.marca = marca;
		this.anno = anno;
		this.combustible = combustible;
		cuentaVehiculo++;
	}
	
	public abstract double calcularVelocidad();
	
	public  String getInfoVehiculo() {
		return "Licencia: " + placa + "- Marca: " + marca + "- Año: " + anno;
	}   
	
	public static int getTotalVehiculos() {
		return cuentaVehiculo;
	}
	
	protected String getPlaca() {
		return placa;
	}
	protected void setPlaca(String placa) {
		this.placa = placa;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected int getAnno() {
		return anno;
	}
	protected void setAnno(int anno) {
		this.anno = anno;
	}
	protected Combustible getCombustible() {
		return combustible;
	}
	protected void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}
	protected int getCuentaVehiculo() {
		return cuentaVehiculo;
	}
	protected void setCuentaVehiculo(int cuentaVehiculo) {
		this.cuentaVehiculo = cuentaVehiculo;
	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehiculo)) return false;
        Vehiculo other = (Vehiculo) obj;
        return this.placa.equals(other.placa);
    }

    @Override
    public String toString() {
        return getInfoVehiculo() + " - Combustible: " + combustible;
    }

	

}
