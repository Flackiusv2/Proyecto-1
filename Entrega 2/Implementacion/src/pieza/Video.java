package pieza;

public class Video extends Pieza {
	
	private int duracion;
	private  int tamaño;

	public Video(String titulo, String año, String lugarCreacion, boolean disponible, 
			int valor, Autor autor, int duracion, int tamaño) {
		
		super(titulo, año, lugarCreacion, disponible, valor, autor);
		this.duracion = duracion;
		this.tamaño = tamaño;
	}


	public int getTamaño() {
		return tamaño;
	}

	public int getDuracion() {
		return duracion;
	}
	
	
}
