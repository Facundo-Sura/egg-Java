package eje4;
import eje4.servicio.PeliculasService;
public class Eje4 {
    public static void main(String[] args) {
        PeliculasService peli = new PeliculasService();
        peli.cine();
        peli.mostrarPeliculas();
        peli.mayorA1hora();
        peli.ordenDescendente();
        peli.ordeneAsendente();
        peli.ordeneDirector();
        peli.ordeneTitulo();
    }
}