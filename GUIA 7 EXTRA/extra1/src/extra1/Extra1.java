package extra1;
import extra1.Cancion.Cancion;
import java.util.Scanner;
public class Extra1 {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el título de la canción:");
        cancion.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la canción:");
        cancion.setAutor(leer.nextLine());
        System.out.println("La canción es: " + cancion.getTitulo());
        System.out.println("El autor es: " + cancion.getAutor());
    }
}