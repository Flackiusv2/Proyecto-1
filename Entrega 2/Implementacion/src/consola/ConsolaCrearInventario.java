package consola;

import logica.Inventario;
import pieza.Escultura;
import pieza.Fotografia;
import pieza.Impresion;
import pieza.Pintura;
import pieza.Video;

public class ConsolaCrearInventario extends ConsolaBasica{
	
	
	private final String[] opcionesCrearInventario = new String[]{ "Crear pieza" , "Cargar inventario(Primero cree piezas)", "Regresar sin crear una galeria" };
	
	private final String[] opcionesCrearPieza = new String[]{ "Crear escultura", "Crear Fotografia", "Crear Impresion", "Crear Pintura", "Crear Video" };
	
	private Inventario nuevoInventario = new Inventario();
	
	public Inventario mostrarOpciones( )
    {
        Inventario nuevaInventario = null;
        boolean regresar = false;

        while( nuevaInventario == null && !regresar )
        {
           int opcionSeleccionada = mostrarMenu( "Menú de creación de inventario", opcionesCrearInventario );
            
           if  ( opcionSeleccionada == 1 ) {
            	
            	agregarPiezaInventario();
            	
            }
            
            else if( opcionSeleccionada == 2 )
            {
                boolean todoOk = true;
                if( this.nuevoInventario.getPiezasDisponibleVenta().size( ) == 0 )
                {
                    System.out.println( "No se puede crear un inventario sin piezas" );
                    todoOk = false;
                }
                

                if( todoOk )
                	nuevaInventario = nuevoInventario;
            }
            else if( opcionSeleccionada == 3 )
            {
                regresar = true;
            }
        }

        return nuevaInventario;
    }
	
	private void agregarPiezaInventario() {
		
		String titulo = pedirCadenaAlUsuario( "Ingrese el titulo de la pieza: " );
		String anio = pedirCadenaAlUsuario( "Ingrese el año de creacion de la pieza: " );
		String lugar = pedirCadenaAlUsuario( "Ingrese el lugar donde se creo: " );
		String fecha = pedirCadenaAlUsuario( "Ingrese la fecha de  devolucion " );
		boolean disponibleVentaValorFijo = true;
		boolean bloqueada = false;
		
		
		
		int opcionSeleccionada = mostrarMenu("Menu de creacion de piezas", opcionesCrearPieza);
		
		if( opcionSeleccionada == 1 )
        {
			int ancho = pedirEnteroAlUsuario( "Digite el ancho de la escultura" );
			int alto = pedirEnteroAlUsuario( "Digite el alto de la escultura" );
			int profundidad = pedirEnteroAlUsuario( "Digite la profundidad de la escultura" );
			int peso = pedirEnteroAlUsuario( "Digite el peso de la escultura" );
	        String material = pedirCadenaAlUsuario( "Ingrese el materialAdicional" );
	        boolean electricidad = pedirConfirmacionAlUsuario("La escultura necesita electricidad? ");
			
	        Escultura nuevaEscultura = new Escultura(titulo,anio,lugar,fecha, disponibleVentaValorFijo, bloqueada,
	        		alto,ancho,profundidad,peso,material,electricidad);
			
	        boolean exhibicion = pedirConfirmacionAlUsuario("La pieza estara en exhibicion?");
	        if (exhibicion) {
	        	nuevoInventario.pasarAExhibicion(nuevaEscultura);
	        }else {
	        	nuevoInventario.guardarEnBodega(nuevaEscultura);
	        }
	        nuevoInventario.ponerEnDisponibles(nuevaEscultura);
	        
        }
        else if  ( opcionSeleccionada == 2 ) {
        	String resolucion = pedirCadenaAlUsuario( "Ingrese la resolucion de la foto" );
	        String tamaño = pedirCadenaAlUsuario( "Ingrese el tamaño de la fotografia" );
        	
	        Fotografia nuevaFoto = new Fotografia(titulo,anio,lugar,fecha, disponibleVentaValorFijo, bloqueada,
	        		resolucion, tamaño);
	        boolean exhibicion = pedirConfirmacionAlUsuario("La pieza estara en exhibicion?");
	        if (exhibicion) {
	        	nuevoInventario.pasarAExhibicion(nuevaFoto);
	        }else {
	        	nuevoInventario.guardarEnBodega(nuevaFoto);
	        }
	        nuevoInventario.ponerEnDisponibles(nuevaFoto);
        }
        else if  ( opcionSeleccionada == 3 ) {
        	
        	int resolucion = pedirEnteroAlUsuario( "Ingrese la resolucion de la impresion" );
	        int tamaño = pedirEnteroAlUsuario( "Ingrese el tamaño de la impresion" );
	        String tipoDePapel = pedirCadenaAlUsuario( "Ingrese el tipo de papel" );
	        String acabado = pedirCadenaAlUsuario( "Ingrese el acabado" );
	        
	        Impresion nuevaImpresion = new Impresion(titulo,anio,lugar,fecha, disponibleVentaValorFijo, bloqueada,
	        		resolucion,tamaño,tipoDePapel,acabado);
	        boolean exhibicion = pedirConfirmacionAlUsuario("La pieza estara en exhibicion?");
	        if (exhibicion) {
	        	nuevoInventario.pasarAExhibicion(nuevaImpresion);
	        }else {
	        	nuevoInventario.guardarEnBodega(nuevaImpresion);
	        }
	        nuevoInventario.ponerEnDisponibles(nuevaImpresion);
	        
        }
        else if  ( opcionSeleccionada == 4 ) {
        	int ancho = pedirEnteroAlUsuario( "Digite el ancho de la pintura" );
			int alto = pedirEnteroAlUsuario( "Digite el alto de la pintura" );
			String tecnica = pedirCadenaAlUsuario( "Ingrese la tecnica" );
			
			Pintura nuevaPintura = new Pintura(titulo,anio,lugar,fecha, disponibleVentaValorFijo, bloqueada,
					ancho,alto,tecnica);
			boolean exhibicion = pedirConfirmacionAlUsuario("La pieza estara en exhibicion?");
	        if (exhibicion) {
	        	nuevoInventario.pasarAExhibicion(nuevaPintura);
	        }else {
	        	nuevoInventario.guardarEnBodega(nuevaPintura);
	        }
	        nuevoInventario.ponerEnDisponibles(nuevaPintura);
			
        }	
        else if  ( opcionSeleccionada == 5 ) {
        	String duracion = pedirCadenaAlUsuario( "Ingrese la duracion del video en minutos" );
	        String tamaño = pedirCadenaAlUsuario( "Ingrese el tamaño del video (ej 1920x1080)" );
	        
	        Video nuevoVideo = new Video(titulo,anio,lugar,fecha, disponibleVentaValorFijo, bloqueada,
	        		duracion, tamaño);
	        boolean exhibicion = pedirConfirmacionAlUsuario("La pieza estara en exhibicion?");
	        if (exhibicion) {
	        	nuevoInventario.pasarAExhibicion(nuevoVideo);
	        }else {
	        	nuevoInventario.guardarEnBodega(nuevoVideo);
	        }
	        nuevoInventario.ponerEnDisponibles(nuevoVideo);
	        
        }
		System.out.println("Pïeza agregada con exito!");
        
	}
}
