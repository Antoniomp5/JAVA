package ejercicio3;

public class Main {

	public static void main(String[] args) {
        Coche coche1 = new Coche("1789JVC", "Toyota", 2022, Combustible.HIBRIDO, 4);
        Coche coche2 = new Coche("9871CVJ", "Audi", 2024, Combustible.GASOLINA, 4);
        Motocicleta moto1 = new Motocicleta("3452XSD", "Yamaha", 2021, Combustible.GASOLINA, false);
        Motocicleta moto2 = new Motocicleta("2543DSX", "KTM", 2023, Combustible.GASOIL, true);

        System.out.println(coche1);
        System.out.println("Velocidad máxima: " + coche1.calcularVelocidad() + " km/h");
        System.out.println("Siguiente mantenimiento: " + coche1.fechaMantenimiento());

        System.out.println();

        System.out.println(moto1);
        System.out.println("Velocidad máxima:: " + moto1.calcularVelocidad() + " km/h");
        System.out.println("Siguiente mantenimiento:: " + moto1.fechaMantenimiento());
        
        System.out.println();
        
        System.out.println(coche2);
        System.out.println("Velocidad máxima: " + coche2.calcularVelocidad() + " km/h");
        System.out.println("Siguiente mantenimiento: " + coche2.fechaMantenimiento());

        System.out.println();

        System.out.println(moto2);
        System.out.println("Velocidad máxima:: " + moto2.calcularVelocidad() + " km/h");
        System.out.println("Siguiente mantenimiento:: " + moto2.fechaMantenimiento());

        System.out.println();
        System.out.println("Nº. De vehículos acutal: " + Vehiculo.getTotalVehiculos());
        System.out.println();
        
        System.out.println("Son iguales las matriculas del coche 1 y coche 2: " + coche1.equals(coche2));
        System.out.println("Son iguales las matriculas de la moto 1 y moto 2: " + moto1.equals(moto2));

	}

}
