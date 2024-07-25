package eje3.entidades;
import java.util.List;
public class Alumno {
    private String nombre;
    private List<Integer> notas;
    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Integer> getNotas() {
        return notas;
    }
    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    public double calcularPromedio() {
        double sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return sum / notas.size();
    }
}