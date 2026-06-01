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
        Artista cantante1 = new Artista("Carlos Rock", "España", 10);
        Artista cantante2 = new Artista("Metal Queen", "Alemania", 15);
        Artista cantante3 = new Artista("DJ Pulse", "EEUU", 8);
        Artista cantante4 = new Artista("Rap Master", "Francia", 12);
        Artista cantante5 = new Artista("Soprano Elite", "Italia", 20);

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

            for (Artista artista : evento.getArtistasConfirmados()) {
                System.out.println(" - " + artista.getNombre());
            }

            System.out.println("-----------------------------------");
        }

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory(
                        "objectdb:$objectdb/db/eventos.odb");

        EntityManager em = emf.createEntityManager();

        // ==========================
        // PERSISTENCIA
        // ==========================
        em.getTransaction().begin();

        em.persist(rockFest);
        em.persist(electroNight);
        em.persist(rapBattle);
        em.persist(operaGala);

        em.getTransaction().commit();

        // ==========================
        // BÚSQUEDA POR ID
        // ==========================
        Long idPrimerEvento = rockFest.getId();

        EventoMusical eventoPorId =
                em.find(EventoMusical.class, idPrimerEvento);

        System.out.println("===== EVENTO POR ID =====");
        System.out.println("Nombre: " + eventoPorId.getNombre());
        System.out.println("Fecha: " + eventoPorId.getFecha());
        System.out.println("Genero: " + eventoPorId.getGenero());

        // ==========================
        // JPQL ESTÁTICA
        // ==========================
        EventoMusical eventoJPQLStatic =
                em.createQuery(
                        "SELECT e FROM EventoMusical e WHERE e.nombre = 'Electro Night'",
                        EventoMusical.class)
                        .getSingleResult();

        System.out.println("===== JPQL ESTÁTICA =====");
        System.out.println("Nombre: " + eventoJPQLStatic.getNombre());
        System.out.println("Fecha: " + eventoJPQLStatic.getFecha());

        // ==========================
        // JPQL DINÁMICA
        // ==========================
        String nombreBuscado = "Electro Night";

        EventoMusical eventoJPQLDinamica =
                em.createQuery(
                        "SELECT e FROM EventoMusical e WHERE e.nombre = :nombre",
                        EventoMusical.class)
                        .setParameter("nombre", nombreBuscado)
                        .getSingleResult();

        System.out.println("===== JPQL DINÁMICA =====");
        System.out.println("Nombre: " + eventoJPQLDinamica.getNombre());
        System.out.println("Fecha: " + eventoJPQLDinamica.getFecha());

        // ====================================================
        // ACTUALIZAR PRIMER EVENTO POR ID
        // ====================================================
        em.getTransaction().begin();

        EventoMusical eventoActualizar =
                em.find(EventoMusical.class, idPrimerEvento);

        eventoActualizar.setNombre(
                eventoActualizar.getNombre().toUpperCase());

        em.getTransaction().commit();

        System.out.println("===== UPDATE POR ID =====");
        System.out.println(eventoActualizar.getNombre());

        // ====================================================
        // ACTUALIZAR SEGUNDO EVENTO POR JPQL ESTÁTICA
        // ====================================================
        em.getTransaction().begin();

        em.createQuery(
                "UPDATE EventoMusical e "
                + "SET e.nombre = UPPER(e.nombre) "
                + "WHERE e.nombre = 'Electro Night'")
                .executeUpdate();

        em.getTransaction().commit();

        System.out.println("===== UPDATE JPQL ESTÁTICA =====");

        // ====================================================
        // VOLVER A NOMBRE ORIGINAL
        // ====================================================
        em.getTransaction().begin();

        EventoMusical electro =
                em.createQuery(
                        "SELECT e FROM EventoMusical e WHERE e.nombre = 'ELECTRO NIGHT'",
                        EventoMusical.class)
                        .getSingleResult();

        electro.setNombre("Electro Night");

        em.getTransaction().commit();

        // ====================================================
        // ACTUALIZAR SEGUNDO EVENTO POR JPQL DINÁMICA
        // ====================================================
        em.getTransaction().begin();

        em.createQuery(
                "UPDATE EventoMusical e "
                + "SET e.nombre = UPPER(e.nombre) "
                + "WHERE e.nombre = :nombre")
                .setParameter("nombre", "Electro Night")
                .executeUpdate();

        em.getTransaction().commit();

        System.out.println("===== UPDATE JPQL DINÁMICA =====");

        // ====================================================
        // COPIA DEL PRIMER EVENTO
        // ====================================================
        EventoMusical original =
                em.find(EventoMusical.class, idPrimerEvento);

        EventoMusical copiaEvento =
                new EventoMusical(
                        original.getNombre(),
                        original.getFecha(),
                        original.getRecaudacion(),
                        original.getGenero());

        for (Artista a : original.getArtistasConfirmados()) {
            copiaEvento.addArtista(a);
        }

        em.getTransaction().begin();

        em.persist(copiaEvento);

        em.getTransaction().commit();

        System.out.println("===== COPIA =====");
        System.out.println("ID original: " + original.getId());
        System.out.println("ID copia: " + copiaEvento.getId());

        // ====================================================
        // BORRAR PRIMER EVENTO POR ID
        // ====================================================
        em.getTransaction().begin();

        EventoMusical borrar =
                em.find(EventoMusical.class, idPrimerEvento);

        em.remove(borrar);

        em.getTransaction().commit();

        System.out.println("===== BORRADO POR ID =====");

        // ====================================================
        // BORRAR SEGUNDO EVENTO JPQL ESTÁTICA
        // ====================================================
        em.getTransaction().begin();

        em.createQuery(
                "DELETE FROM EventoMusical e "
                + "WHERE e.nombre = 'ELECTRO NIGHT'")
                .executeUpdate();

        em.getTransaction().commit();

        System.out.println("===== BORRADO JPQL ESTÁTICA =====");

        // ====================================================
        // BORRAR TERCER EVENTO JPQL DINÁMICA
        // ====================================================
        String nombreEliminar = "Rap Battle 2026";

        em.getTransaction().begin();

        em.createQuery(
                "DELETE FROM EventoMusical e "
                + "WHERE e.nombre = :nombre")
                .setParameter("nombre", nombreEliminar)
                .executeUpdate();

        em.getTransaction().commit();

        System.out.println("===== BORRADO JPQL DINÁMICA =====");

        em.close();
        emf.close();
    }
}
