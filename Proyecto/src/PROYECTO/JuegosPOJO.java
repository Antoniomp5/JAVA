package PROYECTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JuegosPOJO {
	// Leer XML
	List<Juegos> juegos = mostrarjuegos.leerJuegos("videojuegos.xml");
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("objectdb:$objectdb/db/juegos.odb");
	
	EntityManager em = emf.createEntityManager();
	
	

}
