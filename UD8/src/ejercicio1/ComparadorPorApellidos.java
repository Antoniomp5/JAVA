package ejerciciosUd8;

import java.util.Comparator;

public class ComparadorPorApellidos implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getApellidos() == null && p2.getApellidos() == null) {
            return 0;
        } else if (p1.getApellidos() == null) {
            return -1;
        } else if (p2.getApellidos() == null) {
            return 1;
        } else {
            return p1.getApellidos().compareTo(p2.getApellidos());
        }
    }
}