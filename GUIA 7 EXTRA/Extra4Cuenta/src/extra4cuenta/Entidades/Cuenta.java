package extra4cuenta.Entidades;
public class Cuenta {
    public double saldo;
    public String titular;
    public Cuenta() {
    }
    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void retirar_dinero(double cantidad){
        if (saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("Extraccion exitosa.");
        }else{
            System.out.println("Error: saldo insuficiente.");
        }
    }
}