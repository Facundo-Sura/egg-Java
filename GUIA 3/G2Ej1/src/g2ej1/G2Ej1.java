package g2ej1;

import java.util.Scanner;

public class G2Ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el número: ");
        num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número es par");
        }else   {
            System.out.println("El numero es impar");
        }
 }
}