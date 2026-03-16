package refuerzo;

public class PersonaMain {

	public static void main(String[] args) {
        Persona p1 = new Persona("Antonio", 24);
        Persona p2 = new Persona("Lucía", 23);

        System.out.println(p1.equals(p2));
        
	}

}
