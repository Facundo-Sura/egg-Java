package g2ej5;

import java.util.Scanner;

public class G2Ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int limite, num, suma;
        System.out.print("Ingrese el valor limite: ");
        limite = leer.nextInt();
        num = 0;
        suma = 0;
        while (suma <= limite){
            System.out.print("Ingrese el valor: ");
            num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println(suma);
    }
}