package ejerciciosUd8;

import java.util.Comparator;

class ComparadorComplejo implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getApellidos() == null && p2.getApellidos() == null) {
            return compararPorNombreYEdad(p1, p2);
        } else if (p1.getApellidos() == null) {
            return -1;
        } else if (p2.getApellidos() == null) {
            return 1;
        } else {
            int comparacionApellidos = p1.getApellidos().compareTo(p2.getApellidos());
            if (comparacionApellidos != 0) {
                return comparacionApellidos;
            } else {
                return compararPorNombreYEdad(p1, p2);
            }
        }
    }

    private int compararPorNombreYEdad(Persona p1, Persona p2) {
        int comparacionNombre = p1.getNombre().compareTo(p2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        } else {
            return Integer.compare(p1.getEdad(), p2.getEdad());
        }
    }
}
