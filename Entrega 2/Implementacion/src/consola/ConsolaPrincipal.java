package consola;

import java.io.File;

import java.io.IOException;
import logica.Galeria;




public class ConsolaPrincipal extends ConsolaBasica{

	
	private final String[] opcionesMenuPrincipal = new String[]{ "Usar galeria actual", "Crear nueva galeria", "Crear empleados de la galeria", "Cargar galeria de un archivo", "Guardar galeria a un archivo", "Salir" };


	protected Galeria laGaleria;

	private void mostrarMenuPrincipal()
    {
        int opcionSeleccionada = mostrarMenu( "Menú principal", opcionesMenuPrincipal );
        if( opcionSeleccionada == 1 )
        {
            usarGaleria( );
        }
        else if( opcionSeleccionada == 2 )
        {
            ConsolaCrearGaleria consolaCreacion = new ConsolaCrearGaleria( );
            laGaleria = consolaCreacion.mostrarOpciones( );
        }
        else if( opcionSeleccionada == 3 )
        {	
        	boolean galeriaCheck = true;
            if (laGaleria == null) {
            	System.out.println("No se pueden crear empleados sin galeria");
            	galeriaCheck = false;
            }
            if (galeriaCheck) {
            	ConsolaCrearEmpleados consolaEmpleados = new ConsolaCrearEmpleados( laGaleria );
            	laGaleria = consolaEmpleados.mostrarOpciones();
            	}
        }
        else if( opcionSeleccionada == 4 )
        {
            guardarGaleria();
        }
        else if( opcionSeleccionada == 5 )
        {
            guardarGaleria();
        }
        else if( opcionSeleccionada == 6 )
        {
            System.out.println( "Saliendo ..." );
            System.exit( 0 );
        }
        mostrarMenuPrincipal( );
    }
	
	private void usarGaleria( )
    {
        if( laGaleria != null )
        {
            ConsolaUsarGaleria consolaUso = new ConsolaUsarGaleria( laGaleria );
            consolaUso.mostrarMenu( );
        }
        else
        {
            System.out.println( "No hay en este momento una galeria que pueda usarse" );
        }
    }
	
	
	
	private void guardarGaleria( )
    {
        if( laGaleria == null )
        {
            System.out.println( "No hay ninguna gasolinera para guardar" );
        }
        else
        {
            String nombreArchivo = pedirCadenaAlUsuario( "Indique el nombre del archivo donde guardará la gasolinera en su estado actual. El archivo se guardará dentro de la carpeta 'datos'" );
            if( !nombreArchivo.trim( ).equals( "" ) )
            {
                File archivo = new File( "./datos/" + nombreArchivo );

                boolean confirmar = true;
                if( archivo.exists( ) )
                {
                    confirmar = pedirConfirmacionAlUsuario( "El archivo " + nombreArchivo + " ya existe. ¿Está seguro de que quiere reemplazarlo?" );
                }
                if( confirmar )
                {
                    try
                    {
                        laGaleria.guardarEstado( archivo );
                        System.out.println( "El estado actual de la gasolinera fue salvado en el archivo " + archivo.getAbsolutePath( ) );
                    }
                    catch( IOException e )
                    {
                        System.out.println( "Hubo problemas guardando la información en el archivo" );
                        System.out.println( e.getMessage( ) );
                        e.printStackTrace( );
                    }
                }
            }
        }
    }
	public static void main( String[] args )
    {
        ConsolaPrincipal c = new ConsolaPrincipal( );
        c.mostrarMenuPrincipal( );
    }

}
	
