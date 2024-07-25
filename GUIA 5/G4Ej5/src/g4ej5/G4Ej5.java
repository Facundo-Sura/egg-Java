package g4ej5;

import java.util.Random;
import java.util.Scanner;

public class G4Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        int[][] matriz = new int [n][n];
        System.out.println("Matriz original");
        MostrarMatriz(matriz);
        boolean esAntisimetrica = true;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] != matriz[j][i]){
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica){
                break;
            }
        }
        if (esAntisimetrica){
            System.out.println("La matriz es antisimétrica.");
        }else{
            System.out.println("La matriz no es antisimétrica");
        }
    }
    public static void MostrarMatriz(int [][]matriz){
        Random rdn = new Random();
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rdn.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}