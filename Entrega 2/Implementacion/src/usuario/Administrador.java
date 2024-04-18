package usuario;

import java.util.HashMap;

import logica.Inventario;
import logica.Subasta;
import pieza.Pieza;

public class Administrador {
	
	
	public Subasta iniciarSubasta(HashMap<String,Pieza> piezasSubasta) {
		 return new Subasta(piezasSubasta);
	}
	public void registrarPieza(Inventario rInventario, Pieza rpieza, String almacenamiento) {
		rInventario.registrarPieza(rpieza, almacenamiento);
			
		
	}
	public void verificarCliente(Cliente cliente) {
		
		
	}
	public String confirmarVenta(Cliente vcliente) {
		if (vcliente.login(null, null))
	}

}
