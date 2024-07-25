package ej1.peso;
import ej1.peso.entidades.Persona;
import ej1.peso.servicio.PersonaServicio;
public class Ej1Peso {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        
        Persona persona = personaServicio.crearPersona();
        
        if (personaServicio.esMayorDeEdad(persona)) {
            System.out.println(persona.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad");
        }
        
        int resultadoIMC = personaServicio.calcularIMC(persona);
        if (resultadoIMC == -1) {
            System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
        } else if (resultadoIMC == 0) {
            System.out.println(persona.getNombre() + " está en su peso ideal");
        } else {
            System.out.println(persona.getNombre() + " tiene sobrepeso");
        }
    }
}