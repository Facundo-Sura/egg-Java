package baraja.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Barajar {
    private List<Carta> cartas;
    private List<Carta> monton;

    public Barajar() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        String[] palos = {"espadas", "bastos", "oros", "copas"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String palo : palos) {
            for (int numero : numeros) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

        Carta carta = cartas.remove(0);
        monton.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int numeroCartas) {
        if (numeroCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }

        List<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < numeroCartas; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                cartasRepartidas.add(carta);
            }
        }
        return cartasRepartidas;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No se ha sacado ninguna carta aún.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("La baraja está vacía.");
        } else {
            System.out.println("Cartas en la baraja:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }
}