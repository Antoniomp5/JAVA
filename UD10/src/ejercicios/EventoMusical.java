package ejercicios;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Transient;

@Entity()
@SequenceGenerator(name = "evento_seq", sequenceName = "evento_sequence", allocationSize = 10)
class EventoMusical implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nombre;
	private LocalDate fecha;
	private BigDecimal recaudacion;
	@Transient
	private int control;
	
	
	public EventoMusical(String nombre, LocalDate fecha, BigDecimal recaudacion) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		
		
	}
	
	public EventoMusical() {
		
		
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
	
	public int getControl() {
		return control;
	}

	public void setControl(int control) {
		this.control = control;
	}

}
