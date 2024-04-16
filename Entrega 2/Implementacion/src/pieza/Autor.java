package pieza;

import java.util.List;

public class Autor {
	
	private String nombre;
	private  List<Pieza> piezas;
	
	public Autor(String nombre, List<Pieza> piezas) {
		this.nombre = nombre;
		this.piezas = piezas;
	}
	
	public String getNombre(){
		return nombre;
	}
	public List<Pieza> getPiezas() {
		return piezas;
	}
	//implementar 
	//public getPieza(Pieza pieza) {}
		
	
	
	
}
