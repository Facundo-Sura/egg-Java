package g2ej2;

import java.util.Scanner;

public class G2Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese su frase:");
        frase = leer.nextLine();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
