package figurasGeometricas;

import figurasGeometricas.entidades.Circulo;
import figurasGeometricas.entidades.Rectangulo;
import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Circulo circulo1 = new Circulo();

        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Ingrese el tamaño del Radio:");
        circulo1.setRadio(leer.nextDouble());
        System.out.println("Ingrese el tamaño del Diametro:");
        circulo1.setDiametro(leer.nextDouble());
        circulo1.Area();
        circulo1.Perimetro();

        System.out.println("-----------------------------------------------------");

        System.out.println("Ingrese la Base del Rectángulo:");
        rectangulo1.setBase(leer.nextDouble());
        System.out.println("Ingrese la Altura del Rectángulo:");
        rectangulo1.setAltuta(leer.nextDouble());
        rectangulo1.Area();
        rectangulo1.Perimetro();
    }
}