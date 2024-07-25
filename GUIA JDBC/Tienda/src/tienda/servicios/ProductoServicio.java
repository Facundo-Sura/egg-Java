package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencia.EntidadDaoExt_Producto;

public class ProductoServicio {

    private EntidadDaoExt_Producto dao;

    public ProductoServicio() {
        this.dao = new EntidadDaoExt_Producto();
    }

    public void crearProducto(String nombre, int codigo) throws Exception {

        try {
            //Validaciones
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nomnbre es incorrecto.");
            }
            if (nombre.contains("@") == false) {
                throw new Exception("El nombre es incorrecto.");
            }
            if (codigo == 0) {
                throw new Exception("Debe indicar el código.");
            }
            if (codigo < 1) {
                throw new Exception("El código no existe.");
            }
            /*if (buscarProductoPorNombre(nombre) != null) {
                throw new Exception("Ya existe un usuario con el nombre indicado " + nombre);
            }*/

            //Creamos el producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
}