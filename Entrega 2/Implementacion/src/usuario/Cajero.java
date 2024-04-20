package usuario;

import java.util.HashMap;

import logica.Compra;
import logica.compraController;
import pieza.Pieza;

public class Cajero {
	
	private HashMap<String, Compra> historial;
	private compraController compras;
	
	public Cajero() {
		historial = new HashMap<String,Compra>();
		compras = new compraController();
	}
	
	public void registrarPago(String medio, int valor, String titulo, String almacenamiento, Cliente cliente, Administrador admin) {
		
		boolean confirmacion = admin.confirmarVenta(titulo, almacenamiento);
		if (confirmacion) {
			Compra compra = compras.hacerCompra(medio, valor);
			historial.put(titulo, compra);
			cliente.agregarHistorial(titulo, compra);
		}else {
			System.err.println("Pago no exitoso");

		}
		
		
	}
}
