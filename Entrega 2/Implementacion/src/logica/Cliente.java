package logica;
import java.util.HashMap;

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
		return this.historialCompras
		
	}

	public void comprar(String medio, Pieza pieza) {
		valor = pieza.getValor
		 Compra registro = new Compra(medio, )
		
	}
		
	}

}
