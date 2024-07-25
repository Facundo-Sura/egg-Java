package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class EntidadDaoExt_Producto extends DAO {
    
    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null){
                throw new Exception("Debe ingresar un producto");
            }
            String sql = "INSERT INTO producto(codigo, nombre)"
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "UPDATE producto SET"
                    + "clave = '" + producto.getCodigo() + "' WHERE codigo = '" + producto.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(String nombre) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            String sql = "SeLECT * FROM producto"
                    + " WHERE nombre = '" + nombre + "'";
            
            consultarBase(sql);
            
            Producto producto = null;
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT nombre, codigo FROM producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setCodigo(resultado.getInt(2));
                productos.add(producto);
            }
            
            desconectarBase();
            return productos;
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}