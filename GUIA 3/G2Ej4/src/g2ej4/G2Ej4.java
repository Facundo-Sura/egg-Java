package g2ej4;

import java.util.Scanner;

public class G2Ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Ingrese la frase:");
        frase = leer.nextLine();
        if (frase.substring(0,1).equals("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
