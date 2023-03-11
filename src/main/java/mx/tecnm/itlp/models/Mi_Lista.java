package mx.tecnm.itlp.models;

public class Mi_Lista {

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPeliculas_id() {
		return peliculas_id;
	}
	public void setPeliculas_id(int peliculas_id) {
		this.peliculas_id = peliculas_id;
	}
	private String nombre;
	private int peliculas_id;
	private String titulo;
}
