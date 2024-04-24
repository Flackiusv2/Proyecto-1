package usuario;

import java.util.HashMap;

import logica.Compra;
import logica.compraController;
import pieza.Pieza;


public class Cliente extends Usuario{
	
	private String nombre;
	private String telefono;
	private String correo;
	private HashMap<String, Compra> historialCompras;
	private HashMap<String, Pieza> piezasPosesion;
	private int valorMax;
	

	public Cliente(String cnombre, String contraseña, String ctelefono, String ccorreo) {
		super(cnombre, contraseña);;

		telefono = ctelefono;
		correo = ccorreo;

		historialCompras = new HashMap<String, Compra>();
		piezasPosesion = new HashMap<String, Pieza>();

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
	public void agregarHistorial(String titulo, Compra compra ) {
		historialCompras.put(titulo,compra);
		
	}
	public HashMap<String, Compra> getHistoralCompras(){
		return this.historialCompras;
		
	}


	public void comprar(String medio, String titulo, String almacenamiento, Administrador admin,HashMap<String, Pieza>exhi, HashMap<String, Pieza>bodega) {
		Pieza pieza = exhi.get(titulo);
		if (pieza == null) {
			pieza = bodega.get(titulo);
			if (pieza == null) {
				System.out.println("no existe la pieza");
			}
		}
		
		int valor = pieza.getValor();
		Cajero cajeroCliente = new Cajero();
		cajeroCliente.registrarPago(medio, valor, titulo, almacenamiento, this, admin);
		
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
