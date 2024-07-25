package poo2;

import java.util.Scanner;
import poo2.entidades.Circunferencia;

public class Poo2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia radio = new Circunferencia();
        System.out.print("ingrese el tamaño del radio: ");
        radio.crearCircunferencia(leer.nextDouble());
        System.out.println("Su area es: " + radio.area());
        System.out.println("Su perimetro es: " + radio.perimetro());
    }
}