package ejercicio11;

class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int annoPublicacion;

	
	Libro(String titulo, String autor, String isbn, int annoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.annoPublicacion = annoPublicacion;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Autor: " 
				+ autor + ", ISBN: " + isbn + ", Año: " + annoPublicacion;
	}
	
	public boolean equals(Object obj) {
		return this.titulo == (((Libro)obj).titulo) && autor == ((Libro)obj).autor
				&& isbn == ((Libro)obj).isbn && 
				annoPublicacion == ((Libro)obj).annoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnnoPublicacion() {
		return annoPublicacion;
	}

	public void setAnnoPublicacion(int annoPublicacion) {
		this.annoPublicacion = annoPublicacion;
	}
	
	
	
	

}
