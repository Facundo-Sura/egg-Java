package adopcion;

import adopcion.entidades.Perro;
import adopcion.entidades.Persona;

public class Adopcion {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Max", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Luna", "Golden Retriever", 2, "Mediano");
        
        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678");
        Persona persona2 = new Persona("Maria", "Gomez", 25, "98765432");
        
        persona1.asignarPerro(perro1);
        persona2.asignarPerro(perro2);
        
        System.out.println("Información de la Persona 1:\n");
        System.out.println(persona1.obtenerInformacion());
        
        System.out.println("\nInformación de la Persona 2:\n");
        System.out.println(persona2.obtenerInformacion());
    }
}