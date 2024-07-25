package ruleta.rusa.entidades;

import java.util.ArrayList;

public class Juego {private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda() {
        int index = 0;

        while (true) {
            Jugador jugador = jugadores.get(index);
            boolean seMojado = jugador.disparo(revolver);

            if (seMojado) {
                break;
            }

            index = (index + 1) % jugadores.size(); // Avanza al siguiente jugador circularmente
        }

        for (Jugador jugador : jugadores) {
            if (jugador.estaMojado()) {
                System.out.println("¡" + jugador.getNombre() + " es el perdedor y está mojado!");
                break;
            }
        }
    }
}