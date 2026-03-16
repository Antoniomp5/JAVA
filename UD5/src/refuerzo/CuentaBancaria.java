package refuerzo;

class CuentaBancaria {
	// Atributos normales
	private String titular;
	private double saldo;
	// Atributos estatico
	private static int totalCuenta = 0;

	
	// Constructor
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		++totalCuenta;
	}
	
	// Métodos
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void setTotalCuenta(int totalCuenta) {
		CuentaBancaria.totalCuenta = totalCuenta;
	}
	
	void mostrarDatos() {
		System.out.println("==== Datos de la cuenta ====");
		System.out.println("Titular de la cuenta: " + titular);
		System.out.println("Saldo de la cuenta: " + saldo);
		System.out.println();
	}
	
	void ingresar (double cantidad) {
		this.saldo = cantidad;
	}
	
	static int getTotalCuentas() {
		return totalCuenta;
	}




}
