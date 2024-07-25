package granja;

import granja.entidades.Animal;
import granja.entidades.Caballo;
import granja.entidades.Gato;
import granja.entidades.Perro;

public class Granja {
    public static void main(String[] args) {
        //Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        //Declaración de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chiuahua");
        perro2.Alimentarse();
        //Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();
        //Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }
}