package pieza;

public class Impresion {
	
	private int tamaño;
	private int resolucion;
	private String tipoDePapel;
	private String acabado;
	public Impresion(int tamaño, int resolucion, String tipoDePapel, String acabado) {
		super();
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
