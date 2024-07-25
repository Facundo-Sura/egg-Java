package ej5date;

import ej5date.entidades.Persona;
import ej5date.servicio.PersonaServicio;

public class ej5date {
    public static void main(String[] args) {
        PersonaServicio personaService = new PersonaServicio();

        // Crear una persona
        Persona persona = personaService.crearPersona();

        // Calcular la edad de la persona
        int edad = personaService.calcularEdad(persona);
        System.out.println("Edad de la persona: " + edad);

        // Comprobar si la persona es menor que una edad específica
        int edadConsultada = 18;
        boolean esMenor = personaService.menorQue(persona, edadConsultada);
        System.out.println("¿La persona es menor que " + edadConsultada + "? " + esMenor);

        // Mostrar la información de la persona
        personaService.mostrarPersona(persona);
    }
}