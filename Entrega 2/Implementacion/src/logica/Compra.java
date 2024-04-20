package logica;

public class Compra {
	
	private String medioDePago;
	private int valorPagado;
	
	public Compra(String medioDePago, int valorPagado) {
		this.medioDePago = medioDePago;
		this.valorPagado = valorPagado;
	}

	public String getMedioDePago() {
		return medioDePago;
	}
	

	public int getValorPagado() {
		return valorPagado;
	}
	
	
	
}
