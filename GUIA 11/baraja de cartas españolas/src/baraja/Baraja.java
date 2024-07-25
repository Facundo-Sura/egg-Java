package baraja;

import baraja.entidades.Barajar;
import baraja.entidades.Carta;
import java.util.List;

public class Baraja {
    public static void main(String[] args) {
        Barajar baraja = new Barajar();
        baraja.barajar();

        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("\nRepartiendo 5 cartas:");
        List<Carta> cartasRepartidas = baraja.darCartas(5);
        if (cartasRepartidas != null) {
            for (Carta carta : cartasRepartidas) {
                System.out.println(carta);
            }
        }

        System.out.println("\nNúmero de cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("\nMostrando cartas en el montón:");
        baraja.cartasMonton();

        System.out.println("\nSacando una carta:");
        Carta siguienteCarta = baraja.siguienteCarta();
        if (siguienteCarta != null) {
            System.out.println("Carta sacada: " + siguienteCarta);
        }

        System.out.println("\nMostrando la baraja completa:");
        baraja.mostrarBaraja();
    }
}