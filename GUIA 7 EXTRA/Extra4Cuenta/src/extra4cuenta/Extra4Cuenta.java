package extra4cuenta;
import extra4cuenta.Entidades.Cuenta;
import java.util.Scanner;
public class Extra4Cuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el titular: ");
        cuenta.setTitular(leer.nextLine());
        System.out.print("Ingrese el saldo: ");
        cuenta.setSaldo(leer.nextDouble());
        System.out.print("Ingrese la cantidad a retirar: ");
        cuenta.retirar_dinero(leer.nextDouble());
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getSaldo());
    }
}