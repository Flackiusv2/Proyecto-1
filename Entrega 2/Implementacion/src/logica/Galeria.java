package logica;

import java.util.HashMap;

import pieza.Pieza;

public class Galeria {

	private String nombre;
	private HashMap<String,Pieza> historialPiezas;

	public Galeria(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public HashMap<String, Pieza> getHistorialPiezas() {
		return historialPiezas;
	}

	public void registrarPieza(Pieza rpieza) {
		historialPiezas.put(rpieza.getTitulo(),rpieza);
	}

}
