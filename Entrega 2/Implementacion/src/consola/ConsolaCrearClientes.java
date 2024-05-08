package consola;

import usuario.Comprador;
import usuario.ControladorUsuarios;
import usuario.Propietario;

public class ConsolaCrearClientes extends ConsolaBasica {
	
	private final String[] opcionesCrearCliente = new String[]{ "Nueva comprador", "Nuevo vendedor","Guardar usuarios", "Regresar sin guardar" };
	
	private ControladorUsuarios control = new ControladorUsuarios();
	
	public ControladorUsuarios mostrarOpciones( )
    {
		ControladorUsuarios elControlador = null;
        boolean regresar = false;

        while( elControlador == null && !regresar )
        {
            
        	int opcionSeleccionada = mostrarMenu( "Menú de creación", opcionesCrearCliente );
    		
    		
            if( opcionSeleccionada == 1 )
            {
            	String nombre = pedirCadenaAlUsuario( "Ingrese su nombre de usuario" );
        		String password = pedirCadenaAlUsuario( "Ingrese su contraseña" );
            	String nickname = pedirCadenaAlUsuario( "Ingrese su nickname" );
            	String telefono = pedirCadenaAlUsuario( "Ingrese su telefono" );
        		int limite = 100000;
        		String id  = obtenerNuevoID();
        		
        		Comprador nuevoComprador =  new Comprador(nombre,password,nickname,telefono,limite,id);
        		control.agregarComprador(nuevoComprador);
        		control.agregarUsuario(nombre, password);
            }
            else if  ( opcionSeleccionada == 2 ) {
            	String nombre = pedirCadenaAlUsuario( "Ingrese su nombre de usuario" );
        		String password = pedirCadenaAlUsuario( "Ingrese su contraseña" );
            	String nickname = pedirCadenaAlUsuario( "Ingrese su nickname" );
            	String telefono = pedirCadenaAlUsuario( "Ingrese su telefono" );
        		String id  = obtenerNuevoID();
        		
        		Propietario nuevoPropietario =  new Propietario(nombre,password,nickname,telefono,id);
        		control.agregarPropietario(nuevoPropietario);
        		control.agregarUsuario(nombre, password);
        		
            }
            else if  ( opcionSeleccionada == 3 ) {
            	elControlador = control;
            }
            else if  ( opcionSeleccionada == 4 ) {
            	regresar = true;
            }
            
        }

        return elControlador;
    }
	
	
	
	
}
