package eje6.servicio;

import eje6.entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioTienda {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Map<String, Double> productos = new HashMap<>();

    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
    }

    public void modificarPrecio(String nombre, double nuevoPrecio) {
        productos.put(nombre, nuevoPrecio);
    }

    public void eliminarProducto(String nombre) {
        productos.remove(nombre);
    }

    public Map<String, Double> obtenerProductos() {
        return productos;
    }

    public boolean existeProducto(String nombre) {
        return productos.containsKey(nombre);
    }

    public int obtenerNumeroProductos() {
        return productos.size();
    }
}