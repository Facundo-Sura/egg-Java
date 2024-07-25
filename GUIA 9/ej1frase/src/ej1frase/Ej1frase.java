package ej1frase;
import ej1frase.entidades.Cadena;
import ej1frase.servicio.CadenaServicio;
import java.util.Scanner;
public class Ej1frase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la frase:");
        Cadena cadena = new Cadena(scan.nextLine());
        CadenaServicio servicio = new CadenaServicio();
        servicio.mostrarVocales(cadena);
        servicio.invertirFrase(cadena);
        System.out.println("Elija la letra que desea:");
        servicio.vecesRepetido(cadena, scan.next());
        System.out.println("Ingrese la frase para comparar:");
        servicio.compararLongitud(cadena, scan.nextLine());
        System.out.println("Ingrese la frase que desea unir:");
        servicio.unirFrases(cadena, scan.nextLine());
    }
}