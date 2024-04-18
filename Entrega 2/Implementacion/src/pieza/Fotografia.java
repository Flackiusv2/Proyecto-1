package pieza;

public class Fotografia extends Pieza{
	
	private int alto;
	private int ancho;
	private String resolucion;
	
	
	public Fotografia(String titulo, String año, String lugarCreacion, boolean disponible, int valor, 
			Autor autor, int alto, int ancho, String resolucion) {
		
		super(titulo, año, lugarCreacion, disponible, valor, autor);
		this.alto = alto;
		this.ancho = ancho;
		this.resolucion = resolucion;
		
	}

	public int getAlto() {
		return alto;
	}


	public int getAncho() {
		return ancho;
	}

	

	public String getResolucion() {
		return resolucion;
	}

	
	
	
	
}
