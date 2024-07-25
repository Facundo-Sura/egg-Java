package g1ej5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class G1Ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el número a operar: ");
        num = leer.nextInt();
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(sqrt(num));
    }
    
}
