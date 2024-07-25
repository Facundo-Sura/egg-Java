package garbarino;

import garbarino.entidades.Lavadora;
import garbarino.entidades.Televisor;

public class Garbarino {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        lavadora.crearLavadora();
        lavadora.precioFinal();
        televisor.crearTelevisor();
        televisor.precioFinal();
    }
}