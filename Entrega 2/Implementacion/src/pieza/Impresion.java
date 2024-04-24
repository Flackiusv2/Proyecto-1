package pieza;

public class Impresion extends Pieza {
	
	
	private int tamaño;
	private int resolucion;
	private String tipoDePapel;
	private String acabado;
	
	
	
	public Impresion(String titulo, int anioCreacion, String lugarCreacion, String fechaDevolucion, boolean disponibleVentaValorFijo, boolean bloqueada,
			int tamaño, int resolucion, String tipoDePapel, String acabado) {
		
		super(titulo, anioCreacion, lugarCreacion, fechaDevolucion, disponibleVentaValorFijo, bloqueada);
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
	public String getTipoPieza(){
        return "Impresion";
    }
	
	
}
