package logica;

import java.util.HashMap;

import pieza.Pieza;

public class Inventario {
	
	private HashMap<String,Pieza> enExhibicion;
	private HashMap<String,Pieza> enBodega;
	
	
	public Inventario() {
		enExhibicion = new HashMap<String,Pieza>();
		enBodega = new HashMap<String,Pieza>();
	}
	
	public HashMap<String, Pieza> getEnExhibicion() {
		return enExhibicion;
	}

	public HashMap<String, Pieza> getEnBodega() {
		return enBodega;
	}
	
	public Pieza getPieza(String titulo, String almacenamiento) {
		if (almacenamiento == "exhibicion") {
			return enExhibicion.get(titulo);
			
		}else if (almacenamiento == "bodega") {
			return enBodega.get(titulo);
		}else {
			return null;
		}
	}
	
	public void registrarPieza(Pieza rpieza, String almacenamiento) {
		if (almacenamiento == "exhibicion") {
				enExhibicion.put(rpieza.getTitulo(), rpieza);
		}else {
			enBodega.put(rpieza.getTitulo(), rpieza);	
		}
	}
	public boolean venderPieza(String titulo, String almacenamiento) {
		if (almacenamiento == "exhibicion") {
			enExhibicion.remove(titulo);
			return true;
			
		}else if (almacenamiento == "bodega") {
			enBodega.remove(titulo);	
			return true;
		}else {
			return false;
		}
	
	}
	
	
	
}
