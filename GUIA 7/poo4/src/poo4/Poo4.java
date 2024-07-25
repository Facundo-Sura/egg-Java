package poo4;

import java.util.Scanner;
import poo4.Entidades.Rectangulo;

public class Poo4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores del Rectángulo:");
        Rectangulo rect = new Rectangulo(leer.nextDouble(),leer.nextDouble());
        System.out.println("Superficie: " + rect.calcularSuperficie());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
        rect.dibujarRectangulo();
    }
}