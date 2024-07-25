package g1.ej1;

import java.util.Scanner;

public class G1Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("Ingrese los números enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("El valor de la suma es: " + suma);
    }
}