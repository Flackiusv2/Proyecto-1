package pieza;

public class Pintura extends Pieza {

	private int alto;
	private int ancho;
	private String tecnica;
	
	public Pintura(String titulo, String año, String lugarCreacion, boolean disponible, int valor,
			Autor autor,int alto, int ancho, String tecnica) {
		
		super(titulo, año, lugarCreacion, disponible, valor, autor);
		this.alto = alto;
		this.ancho = ancho;
		this.tecnica = tecnica;
	}


	public int getAlto() {
		return alto;
	}
	public int getAncho() {
		return ancho;
	}
	public String getTecnica() {
		return tecnica;
	}
	
	
	
}
