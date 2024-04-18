package pieza;

public class Impresion extends Pieza {
	
	
	private int tamaño;
	private int resolucion;
	private String tipoDePapel;
	private String acabado;
	
	
	
	public Impresion(String titulo, String año, String lugarCreacion, boolean disponible, int valor, Autor autor,
			int tamaño, int resolucion, String tipoDePapel, String acabado) {
		
		super(titulo, año, lugarCreacion, disponible, valor, autor);
		this.tamaño = tamaño;
		this.resolucion = resolucion;
		this.tipoDePapel = tipoDePapel;
		this.acabado = acabado;
	}
	public int getTamaño() {
		return tamaño;
	}
	public int getResolucion() {
		return resolucion;
	}
	public String getTipoDePapel() {
		return tipoDePapel;
	}
	public String getAcabado() {
		return acabado;
	}
	
	
}
