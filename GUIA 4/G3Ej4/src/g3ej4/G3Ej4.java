package g3ej4;

import java.util.Scanner;

public class G3Ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = leer.nextInt();
        boolean esPrimo = esPrimo(num);
        if (esPrimo){
            System.out.println(num + " es un número primo");
        }else{
            System.out.println(num + " no es un número primo");
        }
    }
    public static boolean esPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}