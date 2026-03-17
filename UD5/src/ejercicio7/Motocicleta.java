package ejercicio7;

public class Motocicleta extends Vehiculo {

    private boolean tieneSidecar;

    // Constructor
    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescritura del método
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}
