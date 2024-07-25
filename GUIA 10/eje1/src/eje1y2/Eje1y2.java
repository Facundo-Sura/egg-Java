package eje1y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Eje1y2 {
    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String raza;
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese la raza del perro (o 'salir' para finalizar): ");
            raza = scanner.nextLine();
            if (raza.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                razasPerros.add(raza);
            }
        }
        System.out.println("Perros guardados:");
        for (String perro : razasPerros) {
            System.out.println(perro);
        }
        System.out.print("Ingrese un perro a buscar en la lista: ");
        String perroABuscar = scanner.nextLine();
        Iterator<String> iterator = razasPerros.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            String perro = iterator.next();
            if (perro.equalsIgnoreCase(perroABuscar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        Collections.sort(razasPerros);
        if (encontrado) {
            System.out.println("El perro fue encontrado y eliminado de la lista.");
        } else {
            System.out.println("El perro no se encuentra en la lista.");
        }
        System.out.println("Lista ordenada:");
        for (String perro : razasPerros) {
            System.out.println(perro);
        }
    }
}