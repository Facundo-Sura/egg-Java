package ej1.servicios;
import ej1.entidades.CuentaBancaria;
import java.util.Scanner;
public class CuentaBancariaServicio {
    private Scanner scanner;    
    public CuentaBancariaServicio() {
        scanner = new Scanner(System.in);
    }    
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();
        System.out.println("Ingrese el saldo actual de la cuenta: ");
        double saldoActual = scanner.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }    
    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se ha ingresado " + cantidad + " pesos a la cuenta.");
    }    
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cantidad > cuenta.getSaldoActual()) {
            cantidad = cuenta.getSaldoActual();
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        }
        System.out.println("Se ha retirado " + cantidad + " pesos de la cuenta.");
    }    
    public void extraccionRapida(CuentaBancaria cuenta) {
        double cantidad = cuenta.getSaldoActual() * 0.2;
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.println("Se ha retirado " + cantidad + " pesos de la cuenta.");
    }    
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual() + " pesos.");
    }    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual de la cuenta: " + cuenta.getSaldoActual() + " pesos.");
    }
}