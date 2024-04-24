package usuario;


public class Cliente extends Usuario{
	
	private String nombre;
	private String telefono;
	private String id;
	
	
	public Cliente(String nombre, String contraseña, String cnombre, String ctelefono, String idd) {
		super(nombre, contraseña);
		nombre = cnombre;
		telefono = ctelefono;
		id = idd;
	}

	
	public String getNombre() {
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;	
	}


	public String getId() {
        return id;
    }
	
}
