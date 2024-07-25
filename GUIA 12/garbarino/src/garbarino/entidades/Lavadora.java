package garbarino.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {}

    public Lavadora(int carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la carga maxima de la lavadora:");
        this.carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        if (this.carga>30){
            this.precio = precio + 500;
        }
        System.out.println("El precio de la lavadora es: " + this.precio);
    }
}