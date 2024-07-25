package eje6;

import eje6.servicio.ServicioTienda;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eje6 {
    private static Scanner scanner = new Scanner(System.in);
    private static ServicioTienda tiendaServicio = new ServicioTienda();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("-------- MENÚ --------");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.println("----------------------");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("¡Gracias por utilizar la aplicación de la tienda!");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de leer el precio

        tiendaServicio.agregarProducto(nombre, precio);
        System.out.println("Producto agregado correctamente.");
    }

    private static void modificarPrecio() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        if (tiendaServicio.existeProducto(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea después de leer el precio

            tiendaServicio.modificarPrecio(nombre, precio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        if (tiendaServicio.existeProducto(nombre)) {
            tiendaServicio.eliminarProducto(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    private static void mostrarProductos() {
        if (tiendaServicio.obtenerNumeroProductos() == 0) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            Map<String, Double> productos = tiendaServicio.obtenerProductos();

            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String nombre = entry.getKey();
                double precio = entry.getValue();
                System.out.println(nombre + " - Precio: " + precio);
            }
        }
    }
}
