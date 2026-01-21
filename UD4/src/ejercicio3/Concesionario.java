public class Concesionario {
    public static void main(String[] args) {
        // Tres objetos Vehiculo con tipos distintos
        Vehiculo vehiculo1 = new Vehiculo("1234ABC", "Toyota", 2010, 15000.0, TipoVehiculo.COCHE);
        Vehiculo vehiculo2 = new Vehiculo("5678DEF", "Honda", 2018, 20000.0, TipoVehiculo.MOTO);
        Vehiculo vehiculo3 = new Vehiculo("9012GHI", "Volvo", 2005, 25000.0, TipoVehiculo.CAMION);

        // Mostrar información de los vehículos antes de aplicar los descuentos
        System.out.println("=== Información de los vehículos ===");
        vehiculo1.mostrarInformacion();
        System.out.println("¿Es antiguo? " + vehiculo1.esAntiguo());
        System.out.println();

        vehiculo2.mostrarInformacion();
        System.out.println("¿Es antiguo? " + vehiculo2.esAntiguo());
        System.out.println();

        vehiculo3.mostrarInformacion();
        System.out.println("¿Es antiguo? " + vehiculo3.esAntiguo());
        System.out.println();

        // Demostrar el concepto de referencias
        System.out.println("=== Demostración de referencias ===");
        Vehiculo referenciaVehiculo1 = vehiculo1; // Ambas variables apuntan al mismo objeto
        System.out.println("Matrícula de 'vehiculo1': " + vehiculo1.matricula);
        System.out.println("Matrícula de 'referenciaVehiculo1': " + referenciaVehiculo1.matricula);
        System.out.println("¿Apuntan al mismo objeto? " + (vehiculo1 == referenciaVehiculo1));
        System.out.println();
      
        Vehiculo referenciaVehiculo2 = vehiculo2; 
        System.out.println("Matrícula de 'vehiculo1': " + vehiculo2.matricula);
        System.out.println("Matrícula de 'referenciaVehiculo1': " + referenciaVehiculo2.matricula);
        System.out.println("¿Apuntan al mismo objeto? " + (vehiculo2 == referenciaVehiculo2));
        System.out.println();
      
        Vehiculo referenciaVehiculo3 = vehiculo3; 
        System.out.println("Matrícula de 'vehiculo1': " + vehiculo3.matricula);
        System.out.println("Matrícula de 'referenciaVehiculo1': " + referenciaVehiculo3.matricula);
        System.out.println("¿Apuntan al mismo objeto? " + (vehiculo3 == referenciaVehiculo3));
        System.out.println();

        // Aplicar los descuentos a los vehículos
        vehiculo1.aplicarDescuento(10);
        vehiculo2.aplicarDescuento(15);
        vehiculo3.aplicarDescuento(20);

        // Mostrar información de los vehículos después de aplicar los descuentos
        System.out.println("=== Información de los vehículos ===");
        vehiculo1.mostrarInformacion();
        System.out.println();

        vehiculo2.mostrarInformacion();
        System.out.println();

        vehiculo3.mostrarInformacion();
        System.out.println();
    }
}
