package pieza;

import java.util.List;

public class Escultura extends Pieza {

	private int alto;
	private int ancho;
	private int profundidad;
	private List<String> materiales;
	private int peso;
	private boolean electricidad;
	private boolean adicional;
	


	public Escultura(String titulo, String año, String lugarCreacion, boolean disponible, int valor, Autor autor, int alto, int ancho, int profundidad, List<String> materiales, int peso, boolean electricidad,
			boolean adicional) {
		super(titulo, año, lugarCreacion, disponible, valor, autor);
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.materiales = materiales;
		this.peso = peso;
		this.electricidad = electricidad;
		this.adicional = adicional;
	}


	public int getAlto() {
		return alto;
	}


	public int getAncho() {
		return ancho;
	}


	public int getProfundidad() {
		return profundidad;
	}



	public List<String> getMateriales() {
		return materiales;
	}

	public int getPeso() {
		return peso;
	}


	public boolean necesitaElectricidad() {
		return electricidad;
	}

	public boolean necesitaAdicional() {
		return adicional;
	}



	
	
}
