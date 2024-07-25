package eje3;
import eje3.servicio.AlumnoService;
public class Eje3 {
    public static void main(String[] args) {
        AlumnoService servicio = new AlumnoService();
        servicio.crearAlumnos();
        servicio.notaFinal();
    }
}