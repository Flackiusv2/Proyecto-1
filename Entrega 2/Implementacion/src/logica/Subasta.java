package logica;

import java.util.HashMap;
import java.util.List;

import pieza.Pieza;

public class Subasta {
	
	
	private HashMap<String,Pieza> piezasDisponibles;
	
	public Subasta( HashMap<String,Pieza> piezasDisponibles) {
		
		this.piezasDisponibles = piezasDisponibles;
	}
	
	public void agregarPieza(Pieza Apieza) {
		String nombre = Apieza.getTitulo();
		piezasDisponibles.put(nombre, Apieza);
	}

	
	public HashMap<String, Pieza> getPiezasDisponibles() {
		return piezasDisponibles;
	}
	
	public Pieza getPieza(Pieza Gpieza) {
		String nombre = Gpieza.getTitulo();
		Pieza piezaRetorno = piezasDisponibles.get(nombre);
		return piezaRetorno;
	}
	
	
	
	
}
