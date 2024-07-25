package g1ej4;

import java.util.Scanner;

public class G1Ej4 {
    public static void main(String[] args) {
        int centigrados,fahrenheit;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese los grados centigrados: ");
        centigrados = leer.nextInt();
        fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("Sus grados en fahrenheit son: " + fahrenheit);
    }
    
}
