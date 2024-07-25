package poo3.Entidades;

import java.util.Scanner;

public class Operacion {
    //Atributos
    private double numero1;
    private double numero2;
    //Métodos
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Operacion(){
        this.numero1 = 0;
        this.numero2 = 0;
    }
    //metodos get y set
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    //Método para crear operacion
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = leer.nextDouble();
    }
    //Método suma
    public double suma(){
        return this.numero1 + this.numero2;
    }
    //Método resta
    public double resta(){
        return this.numero1 - this.numero2;
    }
    //Método multiplicación
    public double multiplicacion(){
        if(this.numero1 == 0 || this.numero2 == 0){
            System.out.println("Error: No se puede multiplicar por cero");
            return 0;
        }else{
            return this.numero1 * this.numero2;
        }
    }
    //Método división
    public double division(){
        if (this.numero2 == 0){
            System.out.println("Error: No se puede dividir por cero");
            return 0;
        }else{
            return this.numero1 / this.numero2;
        }
    }
}