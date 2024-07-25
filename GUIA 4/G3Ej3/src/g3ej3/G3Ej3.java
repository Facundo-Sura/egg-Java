package g3ej3;

import java.util.Scanner;

public class G3Ej3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de euros a convertir: ");
    double euro = sc.nextDouble();
    System.out.print("Indique la moneda que desea: ");
    String moneda = sc.next();
    convertir(euro, moneda);
}
public static void convertir (double euro, String moneda){
    double conversion;
    switch(moneda){
        case "libra":
            conversion = euro * 0.86;
            System.out.println("Su cambio es: " + conversion);
            break;
        case "dolar":
            conversion = euro * 1.29;
            System.out.println("Su cambio es: " + conversion);
            break;
        case "yen":
            conversion = euro * 129.85;
            System.out.println("Su cambio es: " + conversion);
            break;
        default:
            System.out.println("moneda no soportada.");
    }
}
}