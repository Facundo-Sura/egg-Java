package poo01;
import java.util.Scanner;
public class Libro {
    // Atributos
    public int ISBN;
    public String titulo;
    public String autor;
    public int NumeroDePaginas;
    // Métodos
    public Libro() {}
    public Libro(int ISBN, String titulo, String autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ISBN del libro: ");
        ISBN = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        NumeroDePaginas = scanner.nextInt();
    }  
    // Método para mostrar los datos del libro
    public void mostrarLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + NumeroDePaginas);
    }
}