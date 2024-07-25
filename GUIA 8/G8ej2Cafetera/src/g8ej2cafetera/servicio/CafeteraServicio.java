package g8ej2cafetera.servicio;
import g8ej2cafetera.entidades.Cafetera;
import java.util.Scanner;
public class CafeteraServicio {
    Scanner scan = new Scanner(System.in);
    public void llenarCafetera(Cafetera cafetera){
        System.out.println("Ingrese la capacidad máxima de la cfetera (en mililitros):");
        cafetera.setCapacidadMaxima(scan.nextDouble());
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera ahora tiene " + cafetera.getCantidadActual() + " mililitros de café");
    }
    public void servirTaza(Cafetera cafetera){
        System.out.println("Ingrese el tamaño de la tazaza:");
        double tamanioTaza = scan.nextDouble();
        double cantidadServida = tamanioTaza;
        if (cafetera.getCantidadActual() < tamanioTaza){
            cantidadServida = cafetera.getCantidadActual();
        }
        cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidadServida);
        if (cantidadServida == tamanioTaza){
            System.out.println("Se ha llenado la taza");
        } else {
            System.out.println("No se ha llenado completamente la taza, queda " + (tamanioTaza - cantidadServida) + " de espacio");
        }
        System.out.println("La cafetera ahora tiene " + cafetera.getCantidadActual() + " mililitros de café");
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera ahora tiene " + cafetera.getCantidadActual() + " mililitros de café");
    }
    public void agregarCafe(Cafetera cafetera){
        System.out.println("Ingrese la cantidad a agregar:");
        double cantidad = scan.nextDouble();
        double cantidadMaxima = cafetera.getCapacidadMaxima();
        double cantidadActual = cafetera.getCantidadActual();
        if(cantidadMaxima < cantidadActual +cantidad){
            cafetera.setCantidadActual(cantidadMaxima);
            System.out.println("No se pudo agregar toda la cantidad de café, la cafetera está llena");
        }else{
            cafetera.setCantidadActual(cantidadActual + cantidad);
            System.out.println("Se ha agregado " + cantidad + " mililitros de café a la cafetera");
        }
        System.out.println("La cafetera ahora tiene " + cafetera.getCantidadActual() + " mililitros de café");
    }
}