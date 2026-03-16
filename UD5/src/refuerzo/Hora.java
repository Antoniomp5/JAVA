package refuerzo;

class Hora {
	// Atributos
	private int hora;
	private int min;
	private int seg;
	
	// Constructor
	
	Hora(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	public void mostarDatos() {
		System.out.println("La hora es: " + hora + ":" + min + ":" + seg);
	}
	
	public void unseg(int hora, int min, int seg) {
		this.hora = hora;
		++hora;
		this.min = min;
		++min;
		this.seg = seg;
		++seg;	
		System.out.println("La hora es: " + hora + ":" + min + ":" + seg);
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public int getSeg() {
		return seg;
	}


	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	
	

}
