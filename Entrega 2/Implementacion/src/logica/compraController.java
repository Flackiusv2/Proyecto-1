package logica;

public class compraController {

	public compraController() {}
	
	public Compra hacerCompra(String medioDePago, int valorPagado) {
		
		return new Compra( medioDePago,valorPagado);
	}
	
	
}
