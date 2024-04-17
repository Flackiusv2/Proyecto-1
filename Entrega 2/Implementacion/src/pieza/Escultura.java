package pieza;

import java.util.List;

public class Escultura {

	private int alto;
	private int ancho;
	private int profundidad;
	private List<String> materiales;
	private int peso;
	private boolean electricidad;
	private boolean adicional;
	

	public Escultura(int alto, int ancho, int profundidad, List<String> materiales, int peso, boolean electricidad,
			boolean adicional) {
		super();
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
