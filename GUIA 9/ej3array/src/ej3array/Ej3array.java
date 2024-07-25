package ej3array;
import ej3array.servicios.ArregloServicio;
public class Ej3array {
    public static void main(String[] args) {
        double [] A = new double[50];
        double [] B = new double[20];
        ArregloServicio vector = new ArregloServicio();
        vector.inicializarA(A);
        System.out.println("Arreglo A:");
        vector.mostrar(A);
        vector.ordenar(A);
        System.out.println("Arreglo A ordenado de mayor a menor:");
        vector.mostrar(A);
        vector.inicializarB(A, B);
        System.out.println("Arreglo B:");
        vector.mostrar(B);
        System.out.println("Arreglo A actualizado:");
        vector.mostrar(A);
    }    
}