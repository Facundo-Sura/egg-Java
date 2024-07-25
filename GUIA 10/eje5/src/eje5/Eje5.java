package eje5;

import eje5.servicio.PaisServicio;

public class Eje5 {
    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        ps.agregarPaises();
        ps.ordenarAlfabeticamene();
        ps.eliminarPais();
    }
}