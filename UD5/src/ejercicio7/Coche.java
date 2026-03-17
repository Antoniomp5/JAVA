package ejercicio7;

public class Coche extends Vehiculo {
    private int numPuertas;

    // Constructor
    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

   
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numPuertas);
    }
}


