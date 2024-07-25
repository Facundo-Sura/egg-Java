package g3ej1;

import java.util.Scanner;

public class G3Ej1 {
public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int n1, n2;
     String opcion;
     System.out.println("Ingrese los 2 números:");
     n1 = leer.nextInt();
     n2 = leer.nextInt();
     System.out.println("¿Qué operación desea realizar?");
     opcion = leer.next();
     switch (opcion){
             case "S":
                 System.out.println("La suma de ambos es: " + sumar(n1,n2));
                 break;
             case "R":
                 System.out.println("La resta de ambos es: " + restar(n1,n2));
                 break;
             case "M":
                 System.out.println("La multiplicación de ambos es: " + multiplicar(n1,n2));
                 break;
             case "D":
                 System.out.println("La division de ambos es: " + dividir(n1,n2));
                 break;
     }
    }
public static int sumar(int a, int b){
    int suma;
    suma = a + b;
    return suma;
}
public static int restar(int a, int b){
    int resta;
    resta = a - b;
    return resta;
}
public static int multiplicar(int a, int b){
    int multiplicacion;
    multiplicacion = a * b;
    return multiplicacion;
}
public static int dividir(int a, int b){
    int division;
    division = a / b;
    return division;
}
}