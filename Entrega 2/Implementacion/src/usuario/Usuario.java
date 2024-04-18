package usuario;

public abstract class Usuario {

	private String nombre;
	private String contraseña;
	
	public Usuario(String nombre, String contraseña) {
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	
	public boolean login(String Lnombre, String Lcontraseña) {
		if (Lnombre == nombre){
			if (Lcontraseña == contraseña){
				return true;
			}
		}
		return false;
		
	} 
}
