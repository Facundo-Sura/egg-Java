package ej2par;
import ej2par.entidades.ParDeNumeros;
import ej2par.servicios.ParDeNumerosService;
public class Ej2par {
    public static void main(String[] args) {
        ParDeNumeros par = new ParDeNumeros();
        ParDeNumerosService service = new ParDeNumerosService();
        service.mostrarValores();
        service.devolverMayor();
        service.calcularPotencia();
        service.calcularRaiz();
    }
}