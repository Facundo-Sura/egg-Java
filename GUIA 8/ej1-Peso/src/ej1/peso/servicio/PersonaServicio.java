package ej1.peso.servicio;
import ej1.peso.entidades.Persona;
import java.util.Scanner;
public class PersonaServicio {
    private Scanner scanner = new Scanner(System.in);    
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }    
    public Persona crearPersona() {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el sexo (H/M/O): ");
        char sexo = scanner.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo inválido. Ingrese el sexo (H/M/O): ");
            sexo = scanner.nextLine().charAt(0);
        }
        System.out.print("Ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la altura (en metros): ");
        double altura = scanner.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }    
    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}