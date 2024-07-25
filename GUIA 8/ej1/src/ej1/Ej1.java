package ej1;
import ej1.entidades.CuentaBancaria;
import ej1.servicios.CuentaBancariaServicio;
public class Ej1 {
    public static void main(String[] args) {
        /*CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cb = cbs.crearCuenta();*/
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        // Crear una cuenta
        CuentaBancaria cuenta = servicio.crearCuenta();
        servicio.consultarDatos(cuenta);
        // Realizar operaciones con la cuenta
        servicio.ingresar(cuenta, 1000);
        servicio.retirar(cuenta, 500);
        servicio.extraccionRapida(cuenta);
        servicio.consultarSaldo(cuenta);
    }   
}