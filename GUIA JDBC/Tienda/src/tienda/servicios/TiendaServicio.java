package tienda.servicios;
/*
import java.util.Scanner;
import tienda.persistencia.EntidadDaoExt_Producto;
*/
public class TiendaServicio {
    /*
    private EntidadDaoExt_Producto dao;
    
    public TiendaServicio() {
        this.dao = new EntidadDaoExt_Producto();
    }
    
    public void crearProducto(String nombre, String codigo) throws Exception {
        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre.");
            }
            if (nombre.contains("@") == false) {
                throw new Exception("El nombre es incorrecto.");
            }
            if (codigo == null || codigo.trim().isEmpty()) {
                throw new Exception("Debe indicar el codigo.");
            }
            if(codigo.length() < 1) {
                throw new Exception("El codigo es menor que 1");
            }
            if(buscarProductoPorNombre(nombre) != null) {
                throw new Exception ("Ya existe un producto con ese nombre" + nombre);
            }
        } catch (Exception e) {
        }
    }
    
    public void menu(){
        System.out.println("********************MENU********************");
        System.out.println("A) lista los productos");
        System.out.println("B) Lista los nombres y precios");
        System.out.println("C) Productos conun valor entre 120 y 202");
        System.out.println("D) Buscar y listar los portátiles");
        System.out.println("E) Nombre y precio del producto más barato");
        System.out.println("F) Ingrar un producto");
        System.out.println("G) Ingresar un fabricante");
        System.out.println("H) Editar los datos de un producto");
        System.out.println("Elija la opcion:");
        Scanner leer = new Scanner(System.in);
        String respuesta = leer.next();
        switch (respuesta){
            case "a":
                
            case "b":
            case "c":
            case "d":
            case "e":
            case "f":
            case "g":
            case "h":
        }
    }
*/
}