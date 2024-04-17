package pieza;

public class Video {
	
	private int duracion;
	private  int tamaño;
	
	public Video(int duracion, int tamaño) {
		super();
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
