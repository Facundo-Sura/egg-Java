package extra1.Cancion;
import java.util.Scanner;
public class Cancion {
    public String titulo;
    public String autor;
    public Cancion() {
        titulo = "";
        autor = "";
    }
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}