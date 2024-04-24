package persistencia;

import java.util.Map;

import logica.Galeria;
import logica.Inventario;
import usuario.ControladorUsuarios;

public class PersistenciaGaleria {

    public static Galeria cargarGaleria() {
        Inventario inventario = new Inventario();
        PersistenciaInventario.cargarInventario(inventario);
        Galeria galeria = new Galeria(inventario, new ControladorUsuarios());
        PersistenciaUsuarios.cargarUsuarios(galeria);
        
        Map<String, logica.Subasta> subastas = PersistenciaSubastasCompras.cargarSubastas();
        galeria.setSubastas(subastas);

        Map<String, logica.Compra> compras = PersistenciaSubastasCompras.cargarCompras();
        galeria.setCompras(compras);

        return galeria;
        
    }

    public static void salvarGaleria(Galeria galeria) {
        // Lógica para salvar la galería
        PersistenciaInventario.guardarInventario(galeria.getInventario());
        PersistenciaUsuarios.guardarUsuarios(galeria);
        PersistenciaSubastasCompras.guardarComprasSubastas(galeria.getSubastas(), galeria.getCompras());
    }
}

