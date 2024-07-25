package ej5date.servicio;

import ej5date.entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (dd/MM/yyyy):");
        String fechaNacimientoStr = scanner.nextLine();

        Date fechaNacimiento;
        try {
            fechaNacimiento = DATE_FORMAT.parse(fechaNacimientoStr);
        } catch (Exception e) {
            System.out.println("Fecha de nacimiento inválida. Se utilizará la fecha actual.");
            fechaNacimiento = new Date();
        }

        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        long diferenciaEnMillis = fechaActual.getTime() - persona.getFechaNacimiento().getTime();
        long edadEnMillis = 1000 * 60 * 60 * 24 * 365L; // 1 año en milisegundos
        int edad = (int) (diferenciaEnMillis / edadEnMillis);
        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + DATE_FORMAT.format(persona.getFechaNacimiento()));
        System.out.println("Edad: " + calcularEdad(persona));
    }
}