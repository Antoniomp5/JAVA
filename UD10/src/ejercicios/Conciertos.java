package ejercicios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conciertos {
    public static void main(String[] args) {

        List<EventoMusical> eventos = new ArrayList<>();

        // ===== ARTISTAS =====
        Artistas cantante1 = new Artistas("Carlos Rock", "España", 10);
        Artistas cantante2 = new Artistas("Metal Queen", "Alemania", 15);
        Artistas cantante3 = new Artistas("DJ Pulse", "EEUU", 8);
        Artistas cantante4 = new Artistas("Rap Master", "Francia", 12);
        Artistas cantante5 = new Artistas("Soprano Elite", "Italia", 20);

        // ===== EVENTO 1 =====
        EventoMusical rockFest = new EventoMusical(
                "Rock Fest",
                LocalDate.of(2026, 7, 10),
                new BigDecimal("250000.00"),
                GeneroMusical.ROCK
        );

        rockFest.addArtista(cantante1);
        rockFest.addArtista(cantante2);

        // ===== EVENTO 2 =====
        EventoMusical electroNight = new EventoMusical(
                "Electro Night",
                LocalDate.of(2026, 8, 5),
                new BigDecimal("180000.00"),
                GeneroMusical.ELECTRONICA
        );

        electroNight.addArtista(cantante3);

        // ===== EVENTO 3 =====
        EventoMusical rapBattle = new EventoMusical(
                "Rap Battle 2026",
                LocalDate.of(2026, 9, 20),
                new BigDecimal("120000.00"),
                GeneroMusical.RAP
        );

        rapBattle.addArtista(cantante4);

        // ===== EVENTO 4 =====
        EventoMusical operaGala = new EventoMusical(
                "Opera Gala",
                LocalDate.of(2026, 10, 15),
                new BigDecimal("300000.00"),
                GeneroMusical.CLASICA
        );

        operaGala.addArtista(cantante5);

        // Añadimos eventos a la lista
        eventos.add(rockFest);
        eventos.add(electroNight);
        eventos.add(rapBattle);
        eventos.add(operaGala);

        // Mostrar información
        for (EventoMusical evento : eventos) {
            System.out.println("Evento: " + evento.getNombre());
            System.out.println("Fecha: " + evento.getFecha());
            System.out.println("Género: " + evento.getGenero());
            System.out.println("Recaudación teórica: " + evento.getRecaudacion());
            System.out.println("Artistas confirmados:");

            for (Artistas artista : evento.getArtistasConfirmados()) {
                System.out.println(" - " + artista.getNombre());
            }

            System.out.println("-----------------------------------");
        }
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(rockFest);
        em.persist(electroNight);
        em.persist(rapBattle);
        em.persist(operaGala);
        
        
        
        em.getTransaction().commit();
        
        Long idPrimerEvento = rockFest.getId();
        
        EventoMusical eventoPorId = em.find(EventoMusical.class, idPrimerEvento);

        System.out.println("===== EVENTO POR ID =====");
        System.out.println("Nombre: " + eventoPorId.getNombre());
        System.out.println("Fecha: " + eventoPorId.getFecha());
        System.out.println("Genero: " + eventoPorId.getGenero());
        

        EventoMusical eventoJPQLStatic = em.createQuery(
                "SELECT e FROM EventoMusical e WHERE e.nombre = 'Electro Night'",
                EventoMusical.class)
                .getSingleResult();

        System.out.println("===== JPQL ESTÁTICA =====");
        System.out.println("Nombre: " + eventoJPQLStatic.getNombre());
        System.out.println("Fecha: " + eventoJPQLStatic.getFecha());



        String nombreBuscado = "Electro Night";

        EventoMusical eventoJPQLDinamica = em.createQuery(
                "SELECT e FROM EventoMusical e WHERE e.nombre = :nombre",
                EventoMusical.class)
                .setParameter("nombre", nombreBuscado)
                .getSingleResult();

        System.out.println("===== JPQL DINÁMICA =====");
        System.out.println("Nombre: " + eventoJPQLDinamica.getNombre());
        System.out.println("Fecha: " + eventoJPQLDinamica.getFecha());
        
        em.close();
        emf.close();
      }

}
