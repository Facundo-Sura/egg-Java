package g4ej4;

import java.util.Random;

public class G4Ej4 {
    public static void main(String[] args) {
        int[][] A = new int [4][4];
        int[][] B = new int [4][4];
        Random rdn = new Random();
        System.out.println("Matriz");
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                A[i][j] = rdn.nextInt(10);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[i].length; j++){
                B[j][i] = A[i][j];
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}