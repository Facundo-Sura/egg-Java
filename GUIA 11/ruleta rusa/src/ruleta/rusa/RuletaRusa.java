package ruleta.rusa;

import java.util.ArrayList;
import ruleta.rusa.entidades.Juego;
import ruleta.rusa.entidades.Jugador;
import ruleta.rusa.entidades.RevolverDeAgua;

public class RuletaRusa {
    public static void main(String[] args) {
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1));
        jugadores.add(new Jugador(2));
        jugadores.add(new Jugador(3));
        jugadores.add(new Jugador(4));
        jugadores.add(new Jugador(5));
        jugadores.add(new Jugador(6));

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);

        juego.ronda();
    }
}