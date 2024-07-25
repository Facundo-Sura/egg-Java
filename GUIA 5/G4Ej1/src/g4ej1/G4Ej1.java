package g4ej1;

import static java.lang.Math.random;

public class G4Ej1 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        for(int i = 0; i < 100; i++){
            vector[i] = i + 1;
            System.out.println("[" + vector[i] + "]");
        }
    }
}