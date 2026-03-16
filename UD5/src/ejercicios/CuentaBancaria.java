package ejercicios;

class CuentaBancaria {
	
	// Atributos
	private String titular;
	private double saldo;
	
	// Métodos
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void ingresar (double cantidad) {
		this.saldo = cantidad;
	}
	
	public void retirar (double cantidad) {
		this.saldo = cantidad;
		
	}
	

}
