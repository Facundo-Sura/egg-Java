package g2ej3;

import java.util.Scanner;

public class G2Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la frase:");
        frase = leer.nextLine();
        if (frase.length() == 8){
            System.out.println ("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
