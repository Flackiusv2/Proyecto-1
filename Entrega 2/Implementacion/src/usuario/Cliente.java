package usuario;


<<<<<<< HEAD

public class Cliente extends Usuario{
=======
public class Cliente extends Usuario{
	
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
	private String nombre;
	private String telefono;
	private String id;
	
<<<<<<< HEAD
	
	public Cliente(String nombre, String contraseña, String cnombre, String ctelefono, String idd) {
=======
<<<<<<< HEAD
	public Cliente(String cnombre, String contraseña, String ctelefono, String ccorreo) {
		super(cnombre, contraseña);
=======
	public Cliente(String nombre, String contraseña, String cnombre, String ctelefono, String ccorreo) {
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
		super(nombre, contraseña);
		nombre = cnombre;
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
		telefono = ctelefono;
<<<<<<< HEAD
		id = idd;
=======
		correo = ccorreo;
<<<<<<< HEAD

=======
		historialCompras = new HashMap<String, Compra>();
		piezasPosesion = new HashMap<String, Pieza>();
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
	}

	
	public String getNombre() {
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;	
	}

<<<<<<< HEAD

	public String getId() {
        return id;
    }
=======
<<<<<<< HEAD
	



	public void comprar(String medio, String titulo, HashMap<String, Pieza>exhi, HashMap<String, Pieza>bodega) {
=======
	public void comprar(String medio, String titulo, String almacenamiento, Administrador admin,HashMap<String, Pieza>exhi, HashMap<String, Pieza>bodega) {
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
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
	
	
>>>>>>> branch 'main' of https://github.com/Flackiusv2/Proyecto-1.git
	
}
