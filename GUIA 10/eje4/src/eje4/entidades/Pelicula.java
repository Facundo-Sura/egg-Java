package eje4.entidades;
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;
    public Pelicula() {
    }
    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    // Método toString para representar la información de la película como cadena de texto
    @Override
    public String toString() {
        return "Pelicula{" + "titulo='" + titulo + '\'' + ", director='" + director + '\'' + ", duracion=" + duracion + '}';
    }
}