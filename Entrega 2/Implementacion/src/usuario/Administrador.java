package usuario;

import java.util.HashMap;

import logica.Inventario;
import logica.Subasta;
import pieza.Pieza;

public class Administrador {
	
	private Inventario Ainventario;
	
	public Administrador(Inventario inventario) {
		super();
		this.Ainventario = inventario;
	}
	
	
	public void verificarCliente(Cliente cliente) {
		cliente.setValorMax(100000);
	}
	
	public Subasta iniciarSubasta(HashMap<String,Pieza> piezasSubasta) {
		 return new Subasta(piezasSubasta);
	}
	public void registrarPieza(Pieza rpieza, String almacenamiento) {
		Ainventario.registrarPieza(rpieza, almacenamiento);
			
		
	}	
	
	public boolean confirmarVenta(String titulo, String almacenamiento) {
		Pieza pieza = Ainventario.getPieza(titulo, almacenamiento);
		pieza.bloquear();
		boolean confirmacion = Ainventario.venderPieza(titulo, almacenamiento);
		if (confirmacion){
			return true;
		}else {
			pieza.desbloquear();
			return false;
		}
		
	}

	public boolean verificarDevolucion(Cliente dcliente,  String confirmacion) {
		if (confirmacion == "si"){
				return true;
		}else {
			return false;
		}
	}
	

}
