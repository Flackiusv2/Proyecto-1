package logica;

import java.util.HashMap;

import pieza.Pieza;

public class Inventario {
	
	private HashMap<String,Pieza> enExhibicion;
	private HashMap<String,Pieza> enBodega;
	
	
	public Inventario() {}
	
	public HashMap<String, Pieza> getEnExhibicion() {
		return enExhibicion;
	}

	public HashMap<String, Pieza> getEnBodega() {
		return enBodega;
	}
	
	public void registrarPieza(Pieza rpieza, String almacenamiento) {
		if (almacenamiento == "exhibicion") {
				enExhibicion.put(rpieza.getTitulo(), rpieza);
		}else {
			enBodega.put(rpieza.getTitulo(), rpieza);	
		}
	}
	public void venderPieza(Pieza vpieza, String almacenamiento) {
		if (almacenamiento == "exhibicion") {
			enExhibicion.remove(vpieza.getTitulo());
			
		}else {
			enExhibicion.remove(vpieza.getTitulo());	
		}
	
	}
	
	
	
}
