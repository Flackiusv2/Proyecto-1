package pieza;

public class Fotografia {
	
	private int alto;
	private int ancho;
	private String resolucion;
	private int profundidad;
	
	public Fotografia(int alto, int ancho, String resolucion, int profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.resolucion = resolucion;
		this.profundidad = profundidad;
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


	public int getProfundidad() {
		return profundidad;
	}

	
	
	
	
}
