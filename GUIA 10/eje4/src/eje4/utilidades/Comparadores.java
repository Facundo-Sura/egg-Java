package eje4.utilidades;
import eje4.entidades.Pelicula;
import java.util.Comparator;
public class Comparadores {
    public static Comparator<Pelicula> ordenarMayorMenor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
}