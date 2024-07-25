package g3ej2;

import java.util.Scanner;

public class G3Ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int personas = 0;
        System.out.print("Ingrese la cantidad de personas: ");
        personas = leer.nextInt();
        mostrarInfo(personas);
    }
    public static void mostrarInfo(int personas){
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad, n = 0;
        String respuesta = "Si";
        do {
            System.out.println("Ingrese el nombre: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();
            leer.nextLine();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
                System.out.println("¿Desea seguir mostrando personas? (Sí/No)");
            respuesta = leer.nextLine();
            n++;
        } while (!respuesta.equalsIgnoreCase("No") || n <= personas);
    }
}
