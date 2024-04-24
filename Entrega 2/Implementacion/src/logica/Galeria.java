package logica;

import java.util.HashMap;
import java.util.Map;


import usuario.Administrador;
import usuario.ControladorUsuarios;

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


}
