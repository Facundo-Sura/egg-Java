package ruleta.rusa.entidades;

import java.util.Random;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6); // Rango de 0 a 5
        posicionAgua = random.nextInt(6); // Rango de 0 a 5
    }

    public boolean mojar() {
        return posicionAgua == posicionActual;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6; // Avanza a la siguiente posición circularmente
    }

    @Override
    public String toString() {
        return "Revolver de agua - Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}
