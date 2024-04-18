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
	public boolean verificarCliente(Cliente vcliente, String contraseña) {
		if (vcliente.login(vcliente.getNombre(), contraseña)) {
			vcliente.setValorMax(100000);
			return true;
		}else {
			return false;
		}
			
		
	}
	public boolean confirmarVenta(Cliente vcliente, String contraseña, String confirmacion) {
		if (verificarCliente(vcliente,contraseña)) {
			if (confirmacion == "si"){
				return true;
			}
		}
		return false;
	}
	
	public boolean verificarDevolucion(Cliente dcliente, String contraseña, String confirmacion) {
		if (verificarCliente(dcliente,contraseña)) {
			if (confirmacion == "si"){
				return true;
			}
		}
		return false;
	}
	

}
