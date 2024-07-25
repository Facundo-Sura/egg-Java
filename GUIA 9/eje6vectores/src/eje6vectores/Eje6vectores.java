package eje6vectores;

import eje6vectores.entidad.Curso;
import eje6vectores.servicio.CursoServicio;

public class Eje6vectores {
    public static void main(String[] args) {
        CursoServicio cursoService = new CursoServicio();
        Curso curso = cursoService.crearCurso();

        System.out.println("\nInformación del curso:");
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: " + curso.getPrecioPorHora());

        System.out.println("\nAlumnos:");
        String[] alumnos = curso.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alumnos[i]);
        }

        double gananciaSemanal = cursoService.calcularGanancia(curso);
        System.out.println("\nGanancia semanal del curso: " + gananciaSemanal);
    }
}