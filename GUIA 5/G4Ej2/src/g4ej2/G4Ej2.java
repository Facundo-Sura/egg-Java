package g4ej2;

import java.util.Random;
import java.util.Scanner;

public class G4Ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vctor: ");
        int N = scan.nextInt();
        int num;
        boolean repetido = false;
        Random r = new Random();
        int [] vector = new int[N];
        for(int i = 0; i < N; i++){
            vector[i] = r.nextInt(100);
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.print("Ingrese el número a buscar: ");
        num = scan.nextInt();
        for (int i = 0; i < N; i++){
            if (vector[i] == num){
                if(repetido){
                    System.out.println("El número " + num + " está repetido en las posiciones " + (i+1));
                }else{
                    System.out.println("El número " + num + " se encuentra en la posición " + (i+1));
                    repetido = true;
                }
            }
        }
        if(!repetido){
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
}