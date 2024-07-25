package garbarino.entidades;

import java.util.Scanner;

public abstract class Electrodomestico {
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    //el consumo sera evaluado con letras entre A y F.
    protected Double peso;

    public Electrodomestico() {}

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
/**
 * 
 * @param letra
 * @return devuelve el consumo con la letra
 */
    private char comprobarConsumo(char letra) {
        if (letra!='A'||letra!='B'||letra!='C'||letra!='D'||letra!='E'){
            letra = 'F';
        }
        return letra;
    }
/**
 * 
 * @param color
 * @return devuelve el color del electrodomestico
 */
    private String comprobarColor(String color) {
        if (!"negro".equalsIgnoreCase(color)||!"rojo".equalsIgnoreCase(color)||!"azul".equalsIgnoreCase(color)||!"gris".equalsIgnoreCase(color)){
            color = "blanco";
        }
        return color;
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio, color, consumo energético y peso:");
        this.precio = leer.nextDouble();
        this.color = leer.next();
        this.consumoEnergetico = leer.next().charAt(0);
        this.peso = leer.nextDouble();
        comprobarConsumo(this.consumoEnergetico);
        comprobarColor(this.color);
        this.precio = precio + 1000;
    }

    public void precioFinal() {
        for (int i = 0; i < 2; i++) {
            switch(this.consumoEnergetico) {
                case 'A':
                    this.precio = precio + 1000;
                    break;
                case 'B':
                    this.precio = precio + 800;
                    break;
                case 'C':
                    this.precio = precio + 600;
                    break;
                case 'D':
                    this.precio = precio + 500;
                    break;
                case 'E':
                    this.precio = precio + 300;
                    break;
                case 'F':
                    this.precio = precio + 100;
                    break;
            }
            if (this.peso>1 && this.peso<19){
                this.precio = precio + 100;
            }else if (this.peso>=20 && this.peso<49){
                this.precio = precio + 500;
            }else if (this.peso>=50 && this.peso<79){
                this.precio = precio + 800;
            }else if (this.peso>=80){
                this.precio = precio + 1000;
            }
        }
    }
}