package eje6vectores.servicio;

import eje6vectores.entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    public void cargarAlumnos(Curso curso) {
        Scanner scanner = new Scanner(System.in);
        String[] alumnos = new String[5];

        System.out.println("Ingrese el nombre de los alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }

        curso.setAlumnos(alumnos);
    }

    public Curso crearCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();

        System.out.print("Ingrese la cantidad de horas por día: ");
        int cantidadHorasPorDia = scanner.nextInt();

        System.out.print("Ingrese la cantidad de días por semana: ");
        int cantidadDiasPorSemana = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el turno (mañana o tarde): ");
        String turno = scanner.nextLine();

        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = scanner.nextDouble();

        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora);
        cargarAlumnos(curso);

        return curso;
    }

    public double calcularGanancia(Curso curso) {
        int cantidadAlumnos = curso.getAlumnos().length;
        int totalHoras = curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana();
        return totalHoras * curso.getPrecioPorHora() * cantidadAlumnos;
    }
}