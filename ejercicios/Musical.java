package ejercicios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

class Musical implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nombre;
	private LocalDate fecha;
	private BigDecimal recaudacion;
	private GeneroMusical genero;
	
	 @ElementCollection
	 private List<Artistas> artistasConfirmados = new ArrayList<>();
	
	
	public Musical(String nombre, LocalDate fecha, BigDecimal recaudacion, GeneroMusical genero) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		this.setGenero(genero);
		
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public BigDecimal getRecaudacion() {
		return recaudacion;
	}


	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}
	


	public GeneroMusical getGenero() {
		return genero;
	}



	public void setGenero(GeneroMusical genero) {
		this.genero = genero;
	}
	
	public void setArtistasConfirmados(List<Artistas> artistasConfirmados) {
		this.artistasConfirmados = artistasConfirmados;
	}
	
	public void addArtista(Artistas artista) {
		this.artistasConfirmados.add(artista);
	}
	
	public List<Artistas> getArtistasConfirmados() {
		return artistasConfirmados;
	}
	
    @Override
    public String toString() {
        return "EventoMusical{" + "id" + id +
                ", nombre=' " + nombre + '\'' +
                ", fecha= " + fecha +
                ", recaudacion= " + recaudacion +
                '}';
    }




}
