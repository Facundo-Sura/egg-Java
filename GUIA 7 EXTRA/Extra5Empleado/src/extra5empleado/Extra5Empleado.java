package extra5empleado;
import extra5empleado.Entidades.Empleado;
import java.util.Scanner;
public class Extra5Empleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        emp.setNombre(leer.nextLine());
        System.out.print("Ingrese la edad: ");
        emp.setEdad(leer.nextInt());
        System.out.print("Ingrese el salario: ");
        emp.setSalario(leer.nextDouble());
        emp.calcular_aumento();
    }    
}