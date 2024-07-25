package extra3juego.Entidades;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private int numJugador1;
    private int numIntentos;
    private int ganadorJugador1;
    private int ganadorJugador2;

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        System.out.println("Jugador 1, elige un número entre 1 y 100:");
        numJugador1 = scanner.nextInt();
        System.out.println("Jugador 2, tienes 10 intentos para adivinar el número de Jugador 1.");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Intento #" + i + ":");
            int numJugador2 = scanner.nextInt();

            if (numJugador2 == numJugador1) {
                System.out.println("¡Felicidades, has adivinado el número en " + i + " intentos!");
                numIntentos += i;
                ganadorJugador2++;
                break;
            } else if (numJugador2 < numJugador1) {
                System.out.println("Más alto.");
            } else {
                System.out.println("Más bajo.");
            }

            if (i == 10) {
                System.out.println("¡Lo siento, te has quedado sin intentos!");
                ganadorJugador1++;
            }
        }

        System.out.println("El número de intentos necesarios para adivinar el número fue: " + numIntentos);
        System.out.println("El número de veces que Jugador 1 ha ganado: " + ganadorJugador1);
        System.out.println("El número de veces que Jugador 2 ha ganado: " + ganadorJugador2);
    }
}