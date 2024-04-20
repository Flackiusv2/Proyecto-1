package usuario;

import java.util.HashMap;

import logica.Compra;
import logica.compraController;
import pieza.Pieza;

public class Cliente {
	private String nombre;
	private String telefono;
	private String correo;
	private HashMap<String, Compra> historialCompras;
	private HashMap<String, Pieza> piezasPosesion;
	private int valorMax;
	
	public Cliente(String cnombre, String ctelefono, String ccorreo) {
		nombre = cnombre;
		telefono = ctelefono;
		correo = ccorreo;
	}
	
	public void setValorMax(int valor) {
		this.valorMax = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;	
	}
	public String getCorreo() {
		return this.correo;
	}
	
	public HashMap<String, Compra> getHistoralCompras(){
		return this.historialCompras;
		
	}

	public void comprar(String medio, String titulo, HashMap<String, Pieza>exhi, HashMap<String, Pieza>bodega) {
		Pieza pieza = exhi.get(titulo);
		if (pieza == null) {
			pieza = bodega.get(titulo);
			if (pieza == null) {
				System.out.println("no existe la pieza");
			}
		}
		
		int valor = pieza.getValor();
		compraController.hacerCompra(medio, valor);
		
	}
		
	public void devolucion(String titulo, boolean confirmacion, HashMap<String, Pieza>exhi, HashMap<String, Pieza>bodega) {
		Pieza pieza = exhi.get(titulo);
		if (pieza == null) {
			pieza = bodega.get(titulo);
			if (pieza == null) {
				System.out.println("no existe la pieza");
			}
		}
		
		if (pieza== piezasPosesion.get(titulo)){
			piezasPosesion.remove(titulo);
			historialCompras.remove(titulo);
		}
		
	}
	
	
	
}
