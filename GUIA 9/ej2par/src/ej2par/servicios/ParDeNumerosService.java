package ej2par.servicios;
import ej2par.entidades.ParDeNumeros;
public class ParDeNumerosService {
    ParDeNumeros par = new ParDeNumeros();
    public void mostrarValores(){
        double n1 = par.getNum1();
        double n2 = par.getNum2();
        System.out.println("El primer valor es: " + n1 + " el segundo valor es: " + n2);
    }
    public void devolverMayor(){
        double mayor = Math.max(par.getNum1(), par.getNum2());
        System.out.println("El mayor es: " + mayor);
    }
    public void calcularPotencia(){
        double mayor = Math.round(Math.max(par.getNum1(), par.getNum2()));
        double menor = Math.round(Math.min(par.getNum1(), par.getNum2()));
        double potencia = Math.pow(mayor, menor);
        System.out.println("El mayor elevado al menor es: " + potencia);
    }
    public void calcularRaiz(){
        double menor = Math.min(par.getNum1(), par.getNum2());
        double raiz = Math.sqrt(Math.abs(menor));
        System.out.println("La raíz cuadrada del menor es: " + raiz);
    }
}
