package g2ej6;

import java.util.Scanner;

public class G2Ej6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int opcion, num1, num2, suma, resta, mul, div;
        System.out.print("Ingrese el primer númro entero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo númro entero: ");
        num2 = leer.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        do{
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("La suma es: " + suma);
                    break;
                    case 2:
                        System.out.println("La resta es: " + resta);
                    break;
                    case 3:
                        System.out.println("La multiplicación es: " + mul);
                    break;
                    case 4:
                        System.out.println("La dision es: " + div);
                    break;
                    case 5:
                        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                        char respuesta = leer.next().charAt(0);
                        if (respuesta == 'S' || respuesta == 's'){
                            return;
                        }else{
                            opcion = 0;
                        }
                        break;
                    default:
                    System.out.println("Opción inválida.");
                    break;
                    }
        }while (opcion != 5);
    }
}