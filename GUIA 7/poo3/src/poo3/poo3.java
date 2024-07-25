package poo3;

import poo3.Entidades.Operacion;

public class poo3 {
    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println(op1.suma());
        System.out.println(op1.resta());
        System.out.println(op1.multiplicacion());
        System.out.println(op1.division());
    }
}
