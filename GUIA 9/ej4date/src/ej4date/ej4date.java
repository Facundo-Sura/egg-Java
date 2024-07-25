package ej4date;
import ej4date.Servicio.FechaService;
import java.util.Date;
import java.util.Scanner;
public class ej4date {
    public static void main(String[] args) {
        FechaService servicio = new FechaService();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa):");
        String fechaNacimientoStr = leer.nextLine();
        String[] partes = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);
        Date fechaNacimiento = servicio.fechaNacimiento(anio, mes, dia);
        Date fechaActual = servicio.fechaActual();
        int edad = servicio.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Tu edad es: " + edad + " años.");
    }
}