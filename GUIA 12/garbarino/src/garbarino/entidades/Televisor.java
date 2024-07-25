package garbarino.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    protected double resolucion;
    protected boolean sintonizador;

    public Televisor() {}

    public Televisor(double resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(double resolucion, boolean sintonizador, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        String TDT = "falso";
        System.out.println("Ingrese la resolución y luego si tiene sintonizador TDT:");
        this.resolucion = leer.nextInt();
        TDT = leer.next();
        if (TDT.equalsIgnoreCase("si")) {
            this.sintonizador = true;
        }
    }

    @Override
    public void precioFinal() {
        if (this.resolucion > 40 && this.sintonizador == true){
            this.precio = precio + (precio * (30/100.0)) + 500;
        }else if (this.resolucion > 40) {
            this.precio = precio + (precio * (30/100.0));
        }else if (this.sintonizador == true) {
            this.precio = precio + 500;
        }
        System.out.println("El precio del televisor es: " + this.precio);
    }
}