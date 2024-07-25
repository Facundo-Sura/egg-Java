package eje4.servicio;
import eje4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class PeliculasService {
    private Scanner leer;
    private ArrayList<Pelicula> peliculas;
    public PeliculasService(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el título de la pelicula:");
        String titulo = leer.next();
        System.out.println("Ingrese el nombre del director:");
        String director = leer.next();
        System.out.println("Ingrese la duración en horas:");
        int duracion = leer.nextInt();
        return new Pelicula(titulo, director, duracion);
    }
    public void agregarPelicula(Pelicula p){
        peliculas.add(p);
    }
    public void mostrarPeliculas (){
        System.out.println("Las peliculas actuales son:");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + peliculas.size());
    }
    /**
     * for (int i = 0; i < cantidad; i++) {
     * es lo mismo que declararla 
     * Pelicula aux = new Pelicula(); y despues agregar la valiable abajo peliculas.add(aux);
     * peliculas.add(new Pelicula());
     */
    public void cine(){
        String respuesta;
        do{
            Pelicula peliAgregada = crearPelicula();
            agregarPelicula(peliAgregada);
            System.out.println(peliAgregada.toString());
            System.out.println("¿Desea agregar otra pelicula? (S/N)");
            respuesta = leer.next();
        }while (respuesta.equalsIgnoreCase("S"));
    }
    public void mayorA1hora(){
        System.out.println("Las peliculas que superan la hora son:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() >= 100){
                System.out.println(pelicula);
            }
        }
    }
    public void ordenDescendente(){
        System.out.println("Peliculas ordenada de mayor a menor duración:");
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula);
        }
    }
    public void ordeneAsendente(){
        System.out.println("Peliculas ordenada de menor a mayor duración:");
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion));
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula);
        }
    }
    public void ordeneTitulo(){
        System.out.println("Peliculas ordenada por su título:");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula);
        }
    }
    public void ordeneDirector(){
        System.out.println("Peliculas ordenada por su directór:");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula);
        }
    }
}