package ej3array.servicios;
import java.util.Arrays;
public class ArregloServicio {
    public void inicializarA(double[] A){
        for (int i = 0; i < 50; i++) {
            A[i] = (int)(Math.random() * 100);
        }
    }
    public void mostrar(double[] A){
        System.out.println(Arrays.toString(A));
    }
    public void ordenar(double[] A){
        Arrays.sort(A);
        for (int i = 0; i < 50 / 2; i++) {
            double temp = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = temp;
        }
        System.out.println("");
    }
    public void inicializarB(double[] A, double[] B){
        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
        }
        for (int i = 10; i < 20; i++) {
            B[i] = 0.5;
        }
        System.out.println();
    }
}