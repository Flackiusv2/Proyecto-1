package consola;

import logica.Galeria;


public class ConsolaUsarGaleria extends ConsolaBasica{
	
	
	private final String[] opcionesUsarGasolinera = new String[]{ "Vender gasolina por volumen", "Vender gasolina por precio", "Regresar" };

	
	private Galeria laGaleria;

	
    public ConsolaUsarGaleria( Galeria galeria  )
    {
        this.laGaleria = galeria;
    }
    
    
    public void mostrarMenu( )
    {
        boolean regresar = false;

        while( !regresar )
        {
            int opcionSeleccionada = mostrarMenu( "Opciones de la Gasolinera", opcionesUsarGasolinera );
            if( opcionSeleccionada == 1 )
            {
                
            }
            else if( opcionSeleccionada == 2 )
            {
                
            }
            else if( opcionSeleccionada == 3 )
            {
                regresar = true;
            }
        }
    }
}
