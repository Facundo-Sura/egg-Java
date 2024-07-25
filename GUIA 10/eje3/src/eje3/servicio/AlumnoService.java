package eje3.servicio;
import eje3.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AlumnoService {
    private List<Alumno> listaAlumnos;
    public AlumnoService() {
        listaAlumnos = new ArrayList<>();
    }
    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = scanner.nextLine();
            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota " + i + " del alumno:");
                int nota = scanner.nextInt();
                notas.add(nota);
            }
            scanner.nextLine(); // Limpiar el buffer del scanner
            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);
            System.out.println("¿Desea crear otro alumno? (S/N)");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }
    public void notaFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno:");
        String nombreBusqueda = scanner.nextLine();
        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                double promedio = alumno.calcularPromedio();
                System.out.println("El promedio final de " + alumno.getNombre() + " es: " + promedio);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró al alumno en la lista.");
        }
    }
}