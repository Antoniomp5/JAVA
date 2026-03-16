package refuerzo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables del main
		CuentaBancaria cuenta1 = new CuentaBancaria ("Antonio", 75503.67);
		CuentaBancaria cuenta2 = new CuentaBancaria ("Diego", 65506.67);
		CuentaBancaria cuenta3 = new CuentaBancaria ("Juan", 69000.67);
		
		// llamado al metodo mostrarDatos
		cuenta1.mostrarDatos();
		cuenta2.mostrarDatos();
		cuenta3.mostrarDatos();
		
		// llamado al metodo estatico totalCuenta
		CuentaBancaria.getTotalCuentas();

	}

}
