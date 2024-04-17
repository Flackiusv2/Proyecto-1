package logica;

public class Compra {
	
	private String medio;
	private String valorPagado;
	
	public Compra (String medioDePago, String valor) {
		
		this.medio = medioDePago;
		this.valorPagado = valor;
	}
	public String getMedioDePago() {
		return medio;
	}
	public String getValorPagado() {
		return valorPagado;
	}

}
