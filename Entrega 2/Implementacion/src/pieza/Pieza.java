package pieza;

public class Pieza {

	private String titulo;
	private String año;
	private String lugarCreacion;
	private boolean disponible;
	private int valor;
	private Autor autor;
	public Pieza(String titulo, String año, String lugarCreacion, boolean disponible, int valor, Autor autor) {
		super();
		this.titulo = titulo;
		this.año = año;
		this.lugarCreacion = lugarCreacion;
		this.disponible = disponible;
		this.valor = valor;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAño() {
		return año;
	}
	public String getLugar() {
		return lugarCreacion;
	}
	private boolean estaDisponible() {
		return disponible;
	}
	public int getValor() {
		return valor;
	}
	public Autor getAutor() {
		return autor;
	}
	private void bloquear() {
		 disponible = false;
	}
	
	
	
	
}
