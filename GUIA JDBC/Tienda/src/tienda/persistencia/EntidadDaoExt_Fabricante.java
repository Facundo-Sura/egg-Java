package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class EntidadDaoExt_Fabricante extends DAO {
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null){
                throw new Exception("Debe ingresar un fabricante");
            }
            String sql = "INSERT INTO fabricante(codigo, nombre)"
                    + "VALUES ( '" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }
            String sql = "UPDATE fabricante SET"
                    + "clave = '" + fabricante.getCodigo() + "' WHERE codigo = '" + fabricante.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(String nombre) throws Exception {
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}