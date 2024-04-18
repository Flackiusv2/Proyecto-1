package pieza;

public class PiezaSubasta extends Pieza {
	
	private int valorMinimo;
	private int valorInicial;
	private boolean vendida;
	
	
	
	public PiezaSubasta(String titulo, String año, String lugarCreacion, boolean disponible, int valor, Autor autor,
			int valorMinimo, int valorInicial, boolean vendida) {
		
		super(titulo, año, lugarCreacion, disponible, valor, autor);
		this.valorMinimo = valorMinimo;
		this.valorInicial = valorInicial;
		this.vendida = vendida;
	}



	public int getValorMinimo() {
		return valorMinimo;
	}



	public int getValorInicial() {
		return valorInicial;
	}



	public boolean estaVendida() {
		return vendida;
	}



	
	
	
}
