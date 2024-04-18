package logica;

public class Compra {
	
<<<<<<< HEAD
	private String medioDePago;
	private int valorPagado;
	
	public Compra(String medioDePago, int valorPagado) {
		this.medioDePago = medioDePago;
		this.valorPagado = valorPagado;
=======
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
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
	}

	public String getMedioDePago() {
		return medioDePago;
	}
	

	public int getValorPagado() {
		return valorPagado;
	}
	
	
	
}
