package logica;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import pieza.Pieza;
import usuario.Administrador;
import usuario.Cliente;
import usuario.Comprador;
import usuario.ControladorUsuarios;
import usuario.Propietario;
import usuario.Empleado;

public class Galeria {
    private Inventario inventario;
    private ControladorUsuarios controladorUsuarios;
    private Administrador administradorGaleria;
    private Map<String, Subasta> subastas;
    private Map<String, Compra> compras;
    
    public Galeria(Inventario inventario, ControladorUsuarios controladorUsuarios) {
        this.inventario = inventario;
        this.controladorUsuarios = controladorUsuarios;
        this.subastas = new HashMap<String, Subasta>( );
        this.compras = new HashMap<String, Compra>( );
    }


    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ControladorUsuarios getControladorUsuarios() {
        return controladorUsuarios;
    }

    public Administrador getAdministrador(){
        return administradorGaleria;
    }
    public void setControladorUsuarios(ControladorUsuarios controladorUsuarios) {
        this.controladorUsuarios = controladorUsuarios;
    }

    public void setAdministradorGaleria(Administrador administradorGaleria) {
        this.administradorGaleria = administradorGaleria;
    }
    public Map<String, Subasta> getSubastas() {
        return subastas;
    }

    public void setSubastas(Map<String, Subasta> subastas) {
        this.subastas = subastas;
    }

    public Map<String, Compra> getCompras() {
        return compras;
    }

    public void setCompras(Map<String, Compra> compras) {
        this.compras = compras;
    }

    public void agregarSubasta(Subasta subasta){
        this.subastas.put(subasta.getId(), subasta);
    }

    public void agregarCompra(Compra compra){
        this.compras.put(compra.getId(), compra);
    }

    public Subasta encontrarSubasta(String id) {
        return subastas.get(id);

    }
    
    
    public void guardarEstado( File archivo ) throws IOException
    {
        PrintWriter writer = new PrintWriter( archivo );
        
        Map<String, String> userPasswordMap = controladorUsuarios.getBaseDeDatos();
        
        for (Pieza pz : inventario.getPiezasDisponibleVenta()) {
        	writer.println( pz.getTitulo() + ":" + pz.getPrecioFijo());
        	
        }
        
        
        for( Cliente cli : controladorUsuarios.getMapaCompradores().values( ) )
        {
            writer.println( cli.getNombre() + cli.getId());
        }
        
        // Guardar la información de los empleados
        for( Empleado emp : controladorUsuarios.getMapaEmpleados().values( ) )
        {
            writer.println( "empleado:" + emp.getId( ) + ":" + emp.getRol( ) );
        }
        
        
     // Guardar la información de la base de datos de login
        for( Map.Entry<String, String> entry : userPasswordMap.entrySet() )
        {
            writer.println( entry.getKey()  + ":" +  entry.getValue()); 
        }

        writer.close( );
    }


}
