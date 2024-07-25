package g1ej3;

import java.util.Scanner;

public class G1Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese su frase: ");
        frase = leer.next();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
}
